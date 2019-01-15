package ex01;

import ex01.Impl.FlyWithWinigs;
import ex01.Impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior =  new Quack();
        flyBehavior = new FlyWithWinigs();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }

    public void print(){
        System.out.println("i 的值是：" + i);
    }

    public void setI(){
        i = 1;
    }
}
