package com.dive.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dive.game.DiveGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		// Set basic properties of the game window
		config.title = "Save the Sea";
		config.width = 1280;
		config.height = 720;
		
		new LwjglApplication(new DiveGame(), config);
	}
}

