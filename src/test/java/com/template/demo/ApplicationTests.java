package com.template.demo;

import com.template.demo.controller.DefaultControllerTests;
import com.template.demo.controller.ServiceControllerTests;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ContextConfiguration(classes = {ServiceControllerTests.class, DefaultControllerTests.class})
public class ApplicationTests {

	@Test
	public void appTest() {
		assertTrue(true);
	}

}
