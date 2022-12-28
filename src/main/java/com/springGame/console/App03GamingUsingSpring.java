package com.springGame.console;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springGame.console.game.GameRunner;
import com.springGame.console.game.GamingConsole;
import com.springGame.console.game.PacmanGame;

public class App03GamingUsingSpring {
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfig.class)){
			
			//context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		}
		
		
		
		//var game = new PacmanGame();
		//var game = new MarioGame();
		//var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
	}
}
