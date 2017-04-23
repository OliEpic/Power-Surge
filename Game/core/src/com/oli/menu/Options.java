package com.oli.menu;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.oli.main.GameScreen;
import com.oli.main.Main;

public class Options extends  GameScreen {

	Main game;
	Texture background;
	SpriteBatch batch;
	
	public Options(Main game) {
		super(game);
		
		this.game = game;
		
	}
	
	@Override
	public void show() {
		
		batch = new SpriteBatch();
		background = new Texture("options.png");
		
	}
	
	@Override
	public void render(float delta) {
		
		batch.begin();
		
		batch.draw(background, 0, 0);
		
		batch.end();
		
	}

}
