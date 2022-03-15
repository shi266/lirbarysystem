package com.shiqi.lirbarysystem.test;

import java.awt.*;
import java.awt.event.MouseEvent;

public class CLicktest{

    public static void main(String[] args) throws InterruptedException, AWTException {
//        Thread.sleep(5000);
//        Click[] cLicks = new Click[9];
//        for ( Click c :
//             cLicks) {
//            c= new Click();
//            c.start();
//        }
while (true){
    System.out.println(99);
}
    }
}
class Click extends Thread{
    @Override
    public void run() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        int n = 1500;
        while (n-->0){
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
