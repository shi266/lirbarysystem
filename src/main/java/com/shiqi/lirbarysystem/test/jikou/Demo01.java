package com.shiqi.lirbarysystem.test.jikou;

public interface Demo01 {
    int a =23;
    default int play(String name) {
        System.out.println(name+"真好玩 "+a);
        return a;
    }

    void meat();
    void mdrink();
    void msleep();
}
