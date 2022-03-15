package com.shiqi.demo;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class soket {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(12345);
        InetAddress address  = InetAddress.getLocalHost();
        String ip = address.getHostAddress();
        Socket socket;
        System.out.println("服务端以就绪，等待客户进入，服务端IP为："+ip);
        socket=serverSocket.accept();
        InputStream is = null;

        InputStreamReader isr;
        BufferedReader br;
        OutputStream os = null;
        PrintWriter pw = null;
        is = socket.getInputStream();
        is= socket.getInputStream();
        isr = new InputStreamReader(is,"UTF-8");
        br = new BufferedReader(isr);
        String info = null;
        while ((info = br.readLine())!=null){
            System.out.println("客户端发送过来的信息："+info);
        }
        socket.shutdownInput();//关闭输入流
        socket.close();


    }
}
