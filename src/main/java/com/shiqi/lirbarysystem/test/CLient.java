package com.shiqi.lirbarysystem.test;

import org.json.simple.JSONObject;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CLient {
    private static Socket socket;
    public static boolean connectStatus = false;
    private static ObjectOutputStream out;

    public static void main(String[] args) {
        Connect();
    }
    private static void Connect(){
        try {
            socket = new Socket("fe80::89af:d8dd:a05c:e5d7%2",6666);
            connectStatus=true;

                out=new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                new Thread(new ClientListen(socket,in)).start();
                new Thread(new ClientSend(socket,out)).start();
                new Thread(new ClientHeart(socket,out)).start();

        }catch (Exception e){
            e.printStackTrace();
            connectStatus=false;
        }
    }
    //重新连接
    public static void reconnect(){
        while (!connectStatus){
            System.out.println("正在尝试重新连接");
            Connect();
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
//            if(connectStatus){-
//                System.out.println("连接成功");
//            }
        }
    }
}
class ClientListen implements Runnable{
    //初始化Socket
    private  Socket socket;
    private  ObjectInputStream in;
    //构造方法，调用该方法就执行
    ClientListen(Socket socket,ObjectInputStream in){
        this.socket=socket;
    }
    @Override
    public void run() {
        //接受输入流
        try {
            while (true){
                System.out.println("serever："+in.readObject());
            }
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}

class ClientSend implements Runnable{
    //初始化Socket
    private  Socket socket;
    private ObjectOutputStream out;
    //构造方法，调用该方法就执行
    ClientSend(Socket socket,ObjectOutputStream out){
        this.socket=socket;
        this.out=out;
    }
    @Override
    public void run() {
        //接受输入流
        try {
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.print("请输入：");
                String msgServer = scanner.nextLine();
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("type","chat");
                jsonObject.put("msg",msgServer);

                out.writeObject(jsonObject);
                out.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
            try {
                socket.close();
                CLient.connectStatus=false;
                CLient.reconnect();
            }catch (Exception e1){
                e1.printStackTrace();

            }
        }
    }
}
class ClientHeart implements Runnable{
    //初始化Socket
    private  Socket socket;
    private ObjectOutputStream out;
    //构造方法，调用该方法就执行
    ClientHeart(Socket socket,ObjectOutputStream out){
        this.socket=socket;
        this.out=out;
    }
    @Override
    public void run() {
        //接受输入流
        try {
            System.out.println("心跳包线程已启动");
            while (true){
                Thread.sleep(5000);
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("type","heart");
                jsonObject.put("msg","心跳包");

                out.writeObject(jsonObject);
                out.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
            try {
                socket.close();
                CLient.connectStatus=false;
                CLient.reconnect();
            }catch (Exception e1){
                e1.printStackTrace();

            }

        }
    }
}
