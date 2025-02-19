package com.example.demo.classes;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.configurations.SpringConfig;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			SpringConfig.class
		);
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

		musicPlayer.PlayMusic();

		System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.getVolume());


		context.close();
	}

}
