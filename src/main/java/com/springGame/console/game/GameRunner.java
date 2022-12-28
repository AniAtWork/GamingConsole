package com.springGame.console.game;

public class GameRunner {

	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	public void run() {
		System.out.println("Game running is" + game);
		game.down();
		game.up();
		game.left();
		game.right();
		}


}
