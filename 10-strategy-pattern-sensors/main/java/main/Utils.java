package main;

import dataprocessing.BasicStepCountStrategy;
import dataprocessing.FilteredStepCountStrategy;
import dataprocessing.StepCountStrategy;

public class Utils {
    public static final String BASIC_STRATEGY = "basic";
    public static final String FILTERED_STRATEGY = "filtered";

    public static int getClientId() {
        return 42;
    }

    // Returns either BasicStepCountStrategy or FilteredStepCountStrategy
    public static StepCountStrategy getStrategy(String type) {
        if (BASIC_STRATEGY.equalsIgnoreCase(type)) {
            return new BasicStepCountStrategy();
        } else if (FILTERED_STRATEGY.equalsIgnoreCase(type)) {
            return new FilteredStepCountStrategy();
        } else {
            throw new IllegalArgumentException("Unknown strategy type: " + type);
        }
    }
}
