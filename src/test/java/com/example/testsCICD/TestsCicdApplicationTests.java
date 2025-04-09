package com.example.testsCICD;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestsCicdApplicationTests {

	@Test
	public void test_is_alive() {
		assertEquals(1, 1);
	}

}
