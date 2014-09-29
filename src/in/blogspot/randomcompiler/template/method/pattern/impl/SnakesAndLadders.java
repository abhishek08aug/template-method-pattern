package in.blogspot.randomcompiler.template.method.pattern.impl;

import in.blogspot.randomcompiler.template.method.pattern.api.BoardGame;

public class SnakesAndLadders extends BoardGame {

	@Override
	public void initializeBoard() {
		System.out.println("Intializing snakes and ladders board");
	}

	@Override
	public void startGame() {
		System.out.println("Starting the game of snakes and ladders");
	}

	@Override
	public void endGame() {
		System.out.println("Ending the game of snakes and ladders");
	}
}