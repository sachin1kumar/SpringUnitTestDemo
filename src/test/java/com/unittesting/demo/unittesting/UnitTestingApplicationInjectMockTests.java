package com.unittesting.demo.unittesting;

import com.unittesting.demo.unittesting.services.CustomService;
import com.unittesting.demo.unittesting.services.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


//Testing Custom Service having DataService dependency.
//Here we are required to use RunWith so that we can use the annotations like @InjectMocks, @Mock, etc.
@RunWith(MockitoJUnitRunner.class)
public class UnitTestingApplicationInjectMockTests {

    @InjectMocks
    CustomService customService;

    @Mock
    DataService dataService;

    @Test
    public void shouldReturnNonZeroSumUsingDataService() {
        when(dataService.retrieveData()).thenReturn(new int[] {1, 2, 3});
        //no need of injecting manually..
        //customService.setDataService(dataService);
        assertEquals(6, customService.calculateUsingDataService());
    }

    @Test
    public void shouldReturnZeroSumUsingDataService() {
        when(dataService.retrieveData()).thenReturn(new int[] {});
        //no need of injecting manually..
        //customService.setDataService(dataService);
        assertEquals(0, customService.calculateUsingDataService());
    }
}
