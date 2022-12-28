package com.springGame.console;

import java.io.IOException;

import com.springGame.console.game.GameRunner;
import com.springGame.console.game.MarioGame;
import com.springGame.console.game.SuperContraGame;
import com.springGame.console.game.PacmanGame;

public class App01GamingBasic {
	public static void main(String[] args)throws IOException {
		
		var game = new PacmanGame();
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}
