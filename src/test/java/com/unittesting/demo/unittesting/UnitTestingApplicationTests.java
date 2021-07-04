package com.unittesting.demo.unittesting;

import com.unittesting.demo.unittesting.services.CustomService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class UnitTestingApplicationTests {

	@Test
	public void shouldReturnNonZeroSum() {
		CustomService customService = new CustomService();
		int actualSum = customService.calculateSum(new int[] {1, 2, 3});
		int expectedSum = 6;
		assertEquals(expectedSum, actualSum);
	}

}
