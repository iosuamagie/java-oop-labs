package ro.ulbs.lab6.prob2;

public class DoubleCalculator extends ACalculator {
    private double state;

    public DoubleCalculator(double state) {
        this.state = state;
    }

    public DoubleCalculator add(double value) {
        this.state += value;
        return this;
    }

    public DoubleCalculator subtract(double value) {
        this.state -= value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        this.state *= value;
        return this;
    }
    public Object result() {
        return this.state;
    }
    @Override
    protected void init() {

    }

}
