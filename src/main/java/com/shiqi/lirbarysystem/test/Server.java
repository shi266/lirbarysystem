package com.shiqi.lirbarysystem.test;

import com.google.gson.JsonObject;
import org.json.simple.JSONObject;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
       try {
           System.out.println("服务器开始运行");
           ServerSocket serversocket = new ServerSocket(6666);
           //接受客户端请求
           while (true) {
               Socket socket = serversocket.accept();
               System.out.println();
               new Thread(new ServerListen(socket)).start();
               new Thread(new ServerSend(socket)).start();
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
class ServerListen implements Runnable{
    //初始化Socket
    private  Socket socket;
    //构造方法，调用该方法就执行
    ServerListen(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
    //接受输入流
        try {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            while (true){
                Object msgclient = in.readObject();
                System.out.println("client:"+msgclient);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class ServerSend implements Runnable{
    //初始化Socket
    private  Socket socket;
    //构造方法，调用该方法就执行
    ServerSend(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        //接受输入流
        try {
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            while (true){
                String msgServer = scanner.nextLine();
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("type","chat");
                jsonObject.put("msg",msgServer);

                out.writeObject(jsonObject);
                out.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}















