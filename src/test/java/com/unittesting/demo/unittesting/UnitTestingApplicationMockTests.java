package com.unittesting.demo.unittesting;

import com.unittesting.demo.unittesting.services.CustomService;
import com.unittesting.demo.unittesting.services.DataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


//Testing Custom Service having DataService dependency.
public class UnitTestingApplicationMockTests {

    //before calling actual method, initialize the mock.
    private final CustomService customService = new CustomService();
    private final DataService dataService = mock(DataService.class);

    @Test
    public void shouldReturnNonZeroSumUsingDataService() {
        when(dataService.retrieveData()).thenReturn(new int[] {1, 2, 3});
        //if we don't set in our service layer, then will get null pointer exception.
        customService.setDataService(dataService);
        assertEquals(6, customService.calculateUsingDataService());
    }

    @Test
    public void shouldReturnZeroSumUsingDataService() {
        when(dataService.retrieveData()).thenReturn(new int[] {});
        //if we don't set in our service layer, then will get null pointer exception.
        customService.setDataService(dataService);
        assertEquals(0, customService.calculateUsingDataService());
    }
}
