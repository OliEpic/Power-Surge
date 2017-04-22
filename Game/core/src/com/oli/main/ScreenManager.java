package com.oli.main;

import com.badlogic.gdx.Screen;

public class ScreenManager {
	
	private Main game;
	
	public void init(Main game) {
		
		this.game = game;
		
	}
	
	public void SetScreen(GameScreen screen) {
		
		Screen CurrentScreen = game.getScreen();
		
		game.setScreen(screen);
		
		if (CurrentScreen != null) {
			
            CurrentScreen.dispose();
     
		}
		
	}

}
