package io.eroshenkoam.sample;

import io.eroshenkoam.allure.BaseSteps;
import org.testng.annotations.Test;

public class SimpleTest {

    private BaseSteps steps = new BaseSteps();

    @Test
    public void testOutput() {
        steps.firstStep();
        steps.secondStep();
    }

}
