package ro.ulbs.lab6.prob2;

public abstract class ACalculator {
    protected Object state;

    public Object result() {
        return state;
    }

    public ACalculator clear() {
        this.init();
        return this;
    }

    protected abstract void init();
}