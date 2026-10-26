package ro.ulbs.lab6.prob2;

public class NewIntCalculator extends ACalculator {
     private int state;

     public NewIntCalculator(int state) {
        this.state = state;
    }

    public NewIntCalculator add(int value) {
        this.state += value;
        return this;
    }

    public NewIntCalculator subtract(int value) {
        this.state -= value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        this.state *= value;
        return this;
    }
    public Object result() {
        return this.state;
    }

    @Override
    protected void init() {

    }
    public NewIntCalculator divide(int value) {
        if (value == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        this.state /= value;
        return this;
    }
}
