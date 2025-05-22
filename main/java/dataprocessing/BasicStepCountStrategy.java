package dataprocessing;

import storage.SensorData;

public class BasicStepCountStrategy implements StepCountStrategy {

    public int stepCount=0;

    @Override
    public void consumeMessage(SensorData sample) {
        stepCount += sample.getStepsCount();
    }

    @Override
    public int getTotalSteps() {
        return stepCount;
    }

    @Override
    public String getStrategyDescription() {
        return "metoda basic";
    }
}
