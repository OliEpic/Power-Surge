package com.oli.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class MusicController {
	
	Music one;
	Music two;
	Music three;
	Sound shoot;
	
	public MusicController() {
		
		one = Gdx.audio.newMusic(Gdx.files.internal("one.wav"));
		shoot = Gdx.audio.newSound(Gdx.files.internal("shoot.wav"));
		one.setLooping(true);
		shoot.setVolume(0, 0.5f);
		
	}
	
	public void play() {
		
		one.play();
		
	}
	
	public void PlayShoot() {
		
		shoot.play();
		
	}

}
