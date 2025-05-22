package dataprocessing;

import storage.SensorData;
import storage.DataRepository;

import java.util.List;
import java.util.stream.Collectors;

public class FilteredStepCountStrategy implements StepCountStrategy {

    @Override
    public int getTotalSteps() {
        long oneMinuteAgo = System.currentTimeMillis() - 60000;

        // Get data from the singleton repository
        List<SensorData> recentData = DataRepository.getInstance()
                .getRecords()
                .stream()
                .filter(record -> record.getTimestamp() >= oneMinuteAgo)
                .filter(record -> record.getStepsCount() > 0)
                .collect(Collectors.toList());

        // Sum steps
        return recentData.stream()
                .mapToInt(SensorData::getStepsCount)
                .sum();
    }

    @Override
    public void consumeMessage(SensorData sample) {
    }

    @Override
    public String getStrategyDescription() {
        return "metoda filtrata (doar pasii din ultimul minut)";
    }
}
