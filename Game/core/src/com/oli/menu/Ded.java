package com.oli.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Align;
import com.oli.game.MGame;
import com.oli.main.GameScreen;
import com.oli.main.Main;

public class Ded extends GameScreen {
	
	BitmapFont font;
	SpriteBatch batch;
	int score;
	GlyphLayout layout;
	CharSequence chars;
	Texture texture;
	boolean musicon;
	boolean soundon;
	
	public Ded(Main game, int score, boolean musicon, boolean soundon) {
		super(game);
		
		this.score = score;
		this.musicon = musicon;
		this.soundon = soundon;
		
	}
	
	@Override
	public void show() {
		
		font = new BitmapFont(Gdx.files.internal("one.fnt"), Gdx.files.internal("one.png"), false);
		texture = new Texture("ded.png");
		batch = new SpriteBatch();
		layout = new GlyphLayout();
		chars = "Score: " + score;
		layout.setText(font, chars, Color.WHITE, Align.center, Align.center, true);
		
	}
	
	@Override
	public void render(float delta) {
		
		batch.begin();
		
		batch.draw(texture, 0, 0);
		font.draw(batch, layout, 640, 350);
		
		if (Gdx.input.isTouched()) {
			
			MGame.music.stop();
			MGame.spawner.SpawnMonster1.clear();
			MGame.spawner.SpawnSpider.clear();
			game._ScreenManager.SetScreen(new MGame(game, musicon, soundon));
			
		}
		
		batch.end();
		
	}
	
}
