package net.manikiam.smsbtestapp.patterns.stratergy.boundary;

import lombok.extern.slf4j.Slf4j;
import net.manikiam.smsbtestapp.patterns.stratergy.entity.TravelType;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TravelService {

    private TravelStrategyFactory travelStrategyFactory;

    public TravelService(TravelStrategyFactory travelStrategyFactory) {
        this.travelStrategyFactory = travelStrategyFactory;
    }

    public String processTravel(TravelType travelType) {

        TravelStrategy travelStrategy = travelStrategyFactory.findTravelStategy(travelType);
        return travelStrategy.process();
    }
}
