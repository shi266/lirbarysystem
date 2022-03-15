package com.shiqi.lirbarysystem.test.jikou;

public class Son implements Demo01{
   public void speak(){
       System.out.println("我说话");
   }

    @Override
    public int play(String name) {
        System.out.println("play");
        return 45;
    }

    @Override
    public void meat() {
        System.out.println(11);
    }

    @Override
    public void mdrink() {
        System.out.println(22);
    }

    @Override
    public void msleep() {
        System.out.println(33);
    }
}
