package in.blogspot.randomcompiler.template.method.pattern.impl;

import in.blogspot.randomcompiler.template.method.pattern.api.BoardGame;

public class Chess extends BoardGame {

	@Override
	public void initializeBoard() {
		System.out.println("Intializing chess board");
	}

	@Override
	public void startGame() {
		System.out.println("Starting the game of chess");
	}

	@Override
	public void endGame() {
		System.out.println("Ending the game of chess");
	}
}
