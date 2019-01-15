package ex01.Impl;

import ex01.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<< Slience >>");
    }
}
