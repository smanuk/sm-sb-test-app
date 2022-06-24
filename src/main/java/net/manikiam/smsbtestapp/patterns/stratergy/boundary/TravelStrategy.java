package net.manikiam.smsbtestapp.patterns.stratergy.boundary;

import net.manikiam.smsbtestapp.patterns.stratergy.entity.TravelType;

public interface TravelStrategy {

    String process();
    TravelType getName();
}
