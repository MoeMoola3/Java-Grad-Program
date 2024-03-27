package com.in28minutes.spring.introspring;

import com.in28minutes.spring.introspring.game.GameRunner;
import com.in28minutes.spring.introspring.game.GamingConsole;
import com.in28minutes.spring.introspring.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IntroSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(IntroSpringApplication.class, args);

//		GamingConsole game = new MarioGame();
//		GameRunner runner = new GameRunner(game);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
