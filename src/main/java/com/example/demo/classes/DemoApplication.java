package com.example.demo.classes;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationContext.xml"
		);

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.PlayMusic();
		context.close();
	}

}
