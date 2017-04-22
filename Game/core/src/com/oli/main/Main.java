package com.oli.main;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.oli.game.MGame;
import com.oli.menu.MainMenu;

public class Main extends Game {
	
	MainMenu mainmenu;
	MGame game;
	
	ScreenManager _ScreenManager;
	
	@Override
	public void create () {
		
		mainmenu = new MainMenu(this);
		game = new MGame(this);
		
		_ScreenManager = new ScreenManager();
		_ScreenManager.init(this);
		_ScreenManager.SetScreen(game);
		
	}

	@Override
	public void render () {
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		this.getScreen().render(Gdx.graphics.getDeltaTime());
		
	}
	
}
