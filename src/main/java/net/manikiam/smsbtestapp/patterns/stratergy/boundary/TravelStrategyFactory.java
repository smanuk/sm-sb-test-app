package net.manikiam.smsbtestapp.patterns.stratergy.boundary;

import net.manikiam.smsbtestapp.patterns.stratergy.entity.TravelType;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class TravelStrategyFactory {

    Map<TravelType, TravelStrategy> travelStrategies;

    public TravelStrategyFactory(Set<TravelStrategy> travelStrategySet) {

        travelStrategies = travelStrategySet.stream()
                .collect(Collectors.toMap(TravelStrategy::getName, Function.identity()));
    }

    public TravelStrategy findTravelStategy(TravelType strategyName) {

        return travelStrategies.get(strategyName);
    }
}
