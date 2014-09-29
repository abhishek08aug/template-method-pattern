package in.blogspot.randomcompiler.template.method.pattern.demo;

import in.blogspot.randomcompiler.template.method.pattern.api.BoardGame;
import in.blogspot.randomcompiler.template.method.pattern.impl.Chess;
import in.blogspot.randomcompiler.template.method.pattern.impl.SnakesAndLadders;

public class TemplateMethodPatternDemo {

	public static void main(String[] args) {
		BoardGame game1 = new Chess();
		game1.play();
		
		BoardGame game2 = new SnakesAndLadders();
		game2.play();
	}

}
