package com.shiqi.lirbarysystem.test.Thread;

public class Demo03 implements Runnable{
  int count = 0;
   synchronized   void num(){
        count++;
         System.out.println(Thread.currentThread().getName()+" ："+count);
    }

    public static void main(String[] args) {
       Demo03 d = new Demo03();
         Runnable r = new Runnable() {
             @Override
             public void run() {
                    d.num();

             }
         };
//         new Thread(r,"三七").start();
//         try {
//             Thread.sleep(1000);
//         }catch (Exception e){
//             e.printStackTrace();
//         }
//         new Thread( () ->d.num(),"四八").start();
         new Thread(d,"llilljljl").start();

    }

    @Override
    public void run() {
        System.out.println("默认线程");
        num();
    }
}
class A implements Runnable{
    A(){
        System.out.println("A");
    }

    @Override
    public void run() {

    }
}
