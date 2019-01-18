package ex03MakeupPatterns;

public class Decak extends Beverage {
    public Decak(){
        setDescription("Decak Coffee");
    }

    @Override
    public double cost() {
        return .10;
    }
}

