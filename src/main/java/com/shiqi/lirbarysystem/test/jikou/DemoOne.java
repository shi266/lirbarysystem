package com.shiqi.lirbarysystem.test.jikou;

public abstract class  DemoOne {
    DemoOne(){
        System.out.println("抽象类构造方法");
    }

   abstract void sing();
   void danc(){
        System.out.println("跳舞");
    }

}
