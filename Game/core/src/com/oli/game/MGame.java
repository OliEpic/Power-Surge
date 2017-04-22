package com.oli.game;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.Array;
import com.oli.main.GameScreen;
import com.oli.main.Main;

public class MGame extends GameScreen {
	
	SpriteBatch batch;
	Texture background;
	Texture copper;
	OrthographicCamera camera;
	ShapeRenderer DebugRenderer;
	TrackGenerator _TrackGenerator;
	Array<Array<int[]>> AllTracks;
	Array<int[]> Track1;
	Array<int[]> Track2;
	Array<int[]> Track3;

	public MGame(Main game) {
		super(game);
	}
	
	@Override
	public void show() {
		
		batch = new SpriteBatch();
		camera = new OrthographicCamera(1280, 700);
		background = new Texture("background.png");
		copper = new Texture("copper.png");
		DebugRenderer = new ShapeRenderer();
		_TrackGenerator = new TrackGenerator();
		
		camera.position.x = 640;
		camera.position.y = 350;
		DebugRenderer.setAutoShapeType(true);
		
		AllTracks = _TrackGenerator.GenerateTracks();
		Track1 = AllTracks.get(0);
		//Track2 = AllTracks.get(1);
		
	}
	
	@Override
	public void render(float delta) {
		
		batch.setProjectionMatrix(camera.combined);
		DebugRenderer.setProjectionMatrix(camera.combined);
		camera.update();
		
		batch.begin();
		
		batch.draw(background, 0, 0);
		
		for (int[] i : Track1) {
			
			batch.draw(copper, i[0], i[1]);
		
		}
		
		batch.end();
		
	}
	
}
