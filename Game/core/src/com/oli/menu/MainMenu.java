package com.oli.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.oli.game.MGame;
import com.oli.main.GameScreen;
import com.oli.main.Main;

public class MainMenu extends GameScreen {

	Texture background;
	Texture play;
	Texture options;
	Texture credits;
	Texture exit;
	SpriteBatch batch;
	Main game;
	boolean soundon;
	boolean musicon;
	
	public MainMenu(Main game, boolean musicon, boolean soundon) {
		super(game);
		
		this.game = game;
		this.soundon = soundon;
		this.musicon = musicon;
	}
	
	@Override
	public void show() {
		
		batch = new SpriteBatch();
		background = new Texture("menu.png");
		play = new Texture("play.png");
		options = new Texture("optionsb.png");
		credits = new Texture("creditsb.png");
		exit = new Texture("exit.png");
		
	}
	
	@Override
	public void render(float delta) {
		
		batch.begin();
		
		batch.draw(background, 0, 0);
		batch.draw(play, 220, 350);
		batch.draw(options, 502, 350);
		batch.draw(credits, 784, 350);
		batch.draw(exit, 220, 212);
		
		batch.end();
		
		if (Gdx.input.isKeyJustPressed(Keys.P)) {
			
			System.out.println(soundon);
			
			game._ScreenManager.SetScreen(new MGame(game, musicon, soundon));
			
		}

		if (Gdx.input.isKeyJustPressed(Keys.O)) {
			
			game._ScreenManager.SetScreen(new Options(game, musicon, soundon));
			
		}
		
		if (Gdx.input.isKeyJustPressed(Keys.E)) {
			
			System.exit(0);
			
		}
		
	}

}
