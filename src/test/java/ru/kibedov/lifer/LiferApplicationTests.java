package ru.kibedov.lifer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ru.kibedov.lifer.fw.LiferApplication;

@SpringBootTest(classes = LiferApplication.class)
@ActiveProfiles("test")
class LiferApplicationTests {

	@Test
	void contextLoads() {
	}

}
