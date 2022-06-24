package net.manikiam.smsbtestapp.patterns.stratergy.boundary;

import lombok.extern.slf4j.Slf4j;
import net.manikiam.smsbtestapp.patterns.stratergy.entity.TravelType;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Bus implements TravelStrategy {

    @Override
    public String process() {

        final String result = String.format("Processing for travel: %s", getName());
        log.info(result);
        return result;
    }

    @Override
    public TravelType getName() {
        return TravelType.TRAVEL_BY_BUS;
    }
}
