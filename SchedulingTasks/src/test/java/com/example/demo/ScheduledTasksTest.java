package com.example.demo;

import org.awaitility.Durations;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;


import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class ScheduledTasksTest {

	
	ScheduledTasks tasks;

	@Test
	public void reportCurrentTime() {
		await().atMost(Durations.TEN_SECONDS).untilAsserted(() -> {
			verify(tasks, atLeast(2)).reportCurrentTime();
		});
	}
}