package com.unittesting.demo.unittesting;

import com.unittesting.demo.unittesting.services.CustomService;
import com.unittesting.demo.unittesting.services.DataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UnitTestingApplicationStubTests {

	@Test
	public void shouldReturnNonZeroSumUsingDataService() {
		CustomService customService = new CustomService();
		customService.setDataService(new StubDataService());
		int actualSum = customService.calculateUsingDataService();
		int expectedSum = 6;
		assertEquals(expectedSum, actualSum);
	}

	@Test
	public void shouldReturnZeroSumUsingDataService() {
		CustomService customService = new CustomService();
		customService.setDataService(new StubEmptyDataService());
		int actualSum = customService.calculateUsingDataService();
		int expectedSum = 0;
		assertEquals(expectedSum, actualSum);
	}

}

//Stubbing........
class StubDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] {1, 2, 3};
	}
}

class StubEmptyDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] {};
	}
}
