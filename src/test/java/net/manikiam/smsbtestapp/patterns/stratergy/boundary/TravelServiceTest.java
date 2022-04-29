package net.manikiam.smsbtestapp.patterns.stratergy.boundary;

import net.manikiam.smsbtestapp.patterns.stratergy.entity.TravelType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class TravelServiceTest {

    @Autowired
    TravelService cut;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void processTravel_boat() {

        String expected = "Processing for travel: " + TravelType.TRAVEL_BY_BOAT;
        String actual = cut.processTravel(TravelType.TRAVEL_BY_BOAT);

        assertThat(actual, is(expected));
    }

    @Test
    void processTravel_bus() {

        String expected = "Processing for travel: " + TravelType.TRAVEL_BY_BUS;
        String actual = cut.processTravel(TravelType.TRAVEL_BY_BUS);

        assertThat(actual, is(expected));
    }

    @Test
    void processTravel_car() {

        String expected = "Processing for travel: " + TravelType.TRAVEL_BY_CAR;
        String actual = cut.processTravel(TravelType.TRAVEL_BY_CAR);

        assertThat(actual, is(expected));
    }

    @Test
    void processTravel_plane() {

        String expected = "Processing for travel: " + TravelType.TRAVEL_BY_PLANE;
        String actual = cut.processTravel(TravelType.TRAVEL_BY_PLANE);

        assertThat(actual, is(expected));
    }
}