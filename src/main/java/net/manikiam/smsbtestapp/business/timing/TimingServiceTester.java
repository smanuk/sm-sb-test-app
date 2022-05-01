package net.manikiam.smsbtestapp.business.timing;

import lombok.extern.slf4j.Slf4j;
import net.manikiam.boundary.timinglibrary.LogExecutionTime;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class TimingServiceTester {

    @LogExecutionTime
    public void testTiming() throws Exception {

        log.debug("About to sleep");
        Thread.sleep(1500);
    }
}
