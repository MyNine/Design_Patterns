package ex01.Impl;

import ex01.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("I can't fly");
    }
}
