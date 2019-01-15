package ex01;

import ex01.Impl.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck  mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        // ((MallardDuck) mallard).setI();
        // ((MallardDuck) mallard).print();
        //
        // (new Duck_child()).print();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
