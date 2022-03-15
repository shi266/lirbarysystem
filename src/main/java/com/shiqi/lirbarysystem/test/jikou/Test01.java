package com.shiqi.lirbarysystem.test.jikou;

import org.apache.commons.io.FileUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Test01  extends Thread{
    private String url;
    private String name;

    public Test01( String url,String name ) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        new download().down(url,name);
        System.out.println("下载文件："+name);

    }

    public static void main(String[] args) {
        new Test01("https://img-baofun.zhhainiao.com/market/133/97ba6b60662ab4f31ef06cdf5a5f8e94_preview.jpg","第一张").start();
        new Test01("https://img-baofun.zhhainiao.com/market/133/97ba6b60662ab4f31ef06cdf5a5f8e94_preview.jpg","第二张").start();
        new Test01("https://img-baofun.zhhainiao.com/market/133/97ba6b60662ab4f31ef06cdf5a5f8e94_preview.jpg","第三张").start();
    }

}
class download{

    public void down(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Io异常，down方法出现问题");
        }
    }

}
