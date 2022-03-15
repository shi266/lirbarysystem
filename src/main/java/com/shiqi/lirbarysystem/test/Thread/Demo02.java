package com.shiqi.lirbarysystem.test.Thread;

public class Demo02 {
    int count = 0;
    synchronized void m(){

        System.out.println(Thread.currentThread().getName()+"count:"+count);

        while (true){
            count++;
            System.out.println(Thread.currentThread().getName()+"count:"+count);
            try {
                Thread.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
            if(count==5){
                System.out.println(5555);
//                int i =1/0;
//                break;
            }
            if(count==10){
//                int i =1/0;
                break;
            }
        }

    }

    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                demo02.m();
            }
        };
        new  Thread(r,"d1").start();
        try {
            Thread.sleep(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        new Thread(r,"d2").start();
    }
}





