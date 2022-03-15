package com.shiqi.lirbarysystem.test.Thread;

public class Demo01 {
      String name;
      int galy;

    public synchronized void setName(String name,int galy)  {
     this.name=name;
     try {
         Thread.sleep(2000);
     }catch (Exception  e){
         e.printStackTrace();
     }
       this.galy=galy;
    }
    public   int getGaly(String name){

        return this.galy;
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        new Thread(()->
                demo01.setName("张三",100)
                ).start();
        new Thread(()->
                System.out.println(demo01.getGaly("张三"))
        ).start();

        try {
            Thread.sleep(2);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(
                demo01.getGaly("张三")
        );
    }

}
