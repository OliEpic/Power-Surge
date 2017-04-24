package com.oli.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.oli.main.GameScreen;
import com.oli.main.Main;

public class Options extends  GameScreen {

	Main game;
	Texture background;
	SpriteBatch batch;
	Texture[] sound;
	Texture[] music;
	Texture back;
	boolean musicon;
	boolean soundon;
	
	public Options(Main game, boolean musicon, boolean soundon) {
		super(game);
		
		this.game = game;
		this.soundon = soundon;
		this.musicon = musicon;
		
	}
	
	@Override
	public void show() {
		
		batch = new SpriteBatch();
		background = new Texture("options.png");
		sound = new Texture[2];
		music = new Texture[2];
		sound[0] = new Texture("soundon.png");
		sound[1] = new Texture("soundoff.png");
		music[0] = new Texture("musicon.png");
		music[1] = new Texture("musicoff.png");
		back = new Texture("back.png");
	
	}
	
	@Override
	public void render(float delta) {
		
		batch.begin();
		
		batch.draw(background, 0, 0);
		
		if (soundon) {
			
			batch.draw(sound[0], 220, 300);
			
		} else {
			
			batch.draw(sound[1], 220, 300);
			
		}
		
		if (musicon) {
			
			batch.draw(music[0], 502, 300);
			
		} else {
			
			batch.draw(music[1], 502, 300);
			
		}
		
		batch.draw(back, 784, 300);
		
		if (Gdx.input.isKeyJustPressed(Keys.B)) {
			
			game._ScreenManager.SetScreen(new MainMenu(game, musicon, soundon));
			
		}
		
		if (Gdx.input.isKeyJustPressed(Keys.S)) {
			
			if (soundon) {
				
				soundon = false;
				
			} else {
				
				soundon = true;
				
			}
			
		}
		
		if (Gdx.input.isKeyJustPressed(Keys.M)) {
			
			if (musicon) {
				
				musicon = false;
				
			} else {
				
				musicon = true;
				
			}
			
		}
		
		batch.end();
		
	}

}
