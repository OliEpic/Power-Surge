package com.oli.main.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.oli.main.Main;

public class DesktopLauncher {
	
	public static void main (String[] arg) {
	
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = 1280;
		config.height = 700;
		config.title = "Power Surge! - Ludum Dare 38";
		config.resizable = false;
		config.backgroundFPS = 0;
		config.foregroundFPS = 60;
		config.vSyncEnabled  = true;
		
		new LwjglApplication(new Main(), config);
	
	}
	
}
