package ex03MakeupPatterns;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        setDescription("Dark Roast Coffee");
    }

    @Override
    public double cost() {
        return .99;
    }
}
