package com.springGame.console.game;

public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Crouch");
	}
	public void left() {
		System.out.println("Go left");
	}
	public void right() {
		System.out.println("Move forward");
	}
}
