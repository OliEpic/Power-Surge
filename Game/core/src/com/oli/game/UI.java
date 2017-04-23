package com.oli.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class UI {
	
	BitmapFont font;
	
	public UI() {
		
		font = new BitmapFont(Gdx.files.internal("one.fnt"), Gdx.files.internal("one.png"), false);
		
	}
	
	public void draw(SpriteBatch batch) {
		
		font.draw(batch, "Score: " + MGame.score, 64, 650);
		font.draw(batch, "Lives: " + MGame.player.health, 64, 600);
		
	}

}
