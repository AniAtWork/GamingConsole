package com.springGame.console;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springGame.console.game.GameRunner;
import com.springGame.console.game.GamingConsole;
import com.springGame.console.game.PacmanGame;

@Configuration
public class GamingConfig {

	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
