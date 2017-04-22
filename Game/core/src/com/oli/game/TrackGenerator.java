package com.oli.game;

import java.util.Random;

import com.badlogic.gdx.utils.Array;

public class TrackGenerator {
	
	Random random;
	
	//faked previous coords
	int LastX = -32;
	int LastY = 350;
	
	int Straight = 0;
	int Up = 1;
	int Down = 2;
	
	int XPos = 0;
	int[] LastDirectionChange;
	int Direction = Straight;
	int AmountOfDirChange;
	int DirChangeSoFar = 0;
	
	public TrackGenerator() {
		
		random = new Random();
		LastDirectionChange = new int[2];
		LastDirectionChange[0] = 0;
		LastDirectionChange[1] = 350;
		
	}
	
	public Array<Array<int[]>> GenerateTracks() {
		
		Array<int[]> Track = new Array<int[]>();
		Array<int[]> Track2 = new Array<int[]>();
		
		while (XPos <= 1248) {
			
			if (Direction == Straight) {
				
				if (XPos > LastDirectionChange[0] + 320) {
					
					Direction = random.nextInt(2) + 1;
					
					DirChangeSoFar = 0;
					AmountOfDirChange = (random.nextInt(3) * 16) + 64;
					
				} else {
					
					int[] coords1 = new int[2];
					coords1[0] = LastX + 16;
					coords1[1] = LastY;
					LastX = coords1[0];
					LastY = coords1[1];
					XPos = coords1[0];
					
					Track.add(coords1);
					
				}
				
			} else if (Direction == Up) {
				
				if (DirChangeSoFar < AmountOfDirChange) {
				
					int[] coords = new int[2];
					coords[0] = LastX;
					coords[1] = LastY + 16;
					LastX = coords[0];
					LastY = coords[1];
					XPos = coords[0];
				
					Track.add(coords);
					
					DirChangeSoFar += 16;
					
				} else {
					
					LastDirectionChange[0] = XPos;
					LastDirectionChange[1] = LastY;
					Direction = Straight;
					
				}
				
			} else if (Direction == Down) {
				
				if (DirChangeSoFar < AmountOfDirChange) {
				
					int[] coords = new int[2];
					coords[0] = LastX;
					coords[1] = LastY - 16;
					LastX = coords[0];
					LastY = coords[1];
					XPos = coords[0];
				
					Track.add(coords);
					
					DirChangeSoFar += 16;
					
				} else {
					
					LastDirectionChange[0] = XPos;
					LastDirectionChange[1] = LastY;
					Direction = Straight;
					
				}
				
			}
			
		}
		
		Array<Array<int[]>> AllTracks = new Array<Array<int[]>>();
		AllTracks.add(Track);
		
		return AllTracks;
		
	}
	
}