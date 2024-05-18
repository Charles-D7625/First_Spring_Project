package com.example.demo.classes;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.interfaces.Music;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationContext.xml"
		);

		Music musicBean = context.getBean("musicBean", Music.class);

		MusicPlayer musicPlayer = new MusicPlayer(musicBean);

		musicPlayer.PlayMusic();
		context.close();
	}

}
