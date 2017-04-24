package com.oli.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.oli.main.GameScreen;
import com.oli.main.Main;

public class SplashScreen extends GameScreen {

	Texture splash;
	SpriteBatch batch;
	MainMenu menu;
	
	public SplashScreen(Main game) {
		super(game);
	}
	
	@Override
	public void show() {
		
		batch = new SpriteBatch();
		splash = new Texture("Logo.png");
		menu = new MainMenu(game, true, true);
		
	}
	
	@Override
	public void render(float delta) {
		
		batch.begin();
		batch.draw(splash, 0, 0);
		batch.end();
		
		if (Gdx.input.isTouched()) {
			
			game._ScreenManager.SetScreen(menu);
			
		}
		
	}
	
	@Override
	public void dispose() {
		
		batch.dispose();
		splash.dispose();
		
	}

}
