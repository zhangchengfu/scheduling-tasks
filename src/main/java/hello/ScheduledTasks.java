package hello;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	
	@Scheduled(fixedRate = 5000)
	public void test() {
		SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
		System.out.println("task" + formate.format(new Date()));
	}
}
