package ex03MakeupPatterns;

//摩卡
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    // 装饰
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
