package in.blogspot.randomcompiler.template.method.pattern.api;

public abstract class BoardGame {
	public abstract void initializeBoard();
	
	public abstract void startGame();
	
	public abstract void endGame();
	
	public void play() {
		initializeBoard();
		startGame();
		endGame();
	}

}
