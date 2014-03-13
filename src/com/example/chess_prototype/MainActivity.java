package com.example.chess_prototype;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		menu();
	}

	private void menu(){

		ImageButton NewGame = (ImageButton) findViewById(R.id.menuNewGame);
		ImageButton Practice = (ImageButton) findViewById(R.id.menuPractice);
		ImageButton Settings = (ImageButton) findViewById(R.id.menuSettings);
		ImageButton Leaderboard = (ImageButton) findViewById(R.id.menuLeaderboard);
		ImageButton Exit = (ImageButton) findViewById(R.id.menuExit);

		NewGame.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, Game.class);
				startActivity(i);
				finish();

			}
		});

		Practice.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, Practice.class);
				startActivity(i);
				finish();

			}
		});

		Settings.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, Settings.class);
				startActivity(i);
				finish();

			}
		});

		Leaderboard.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, Leaderboard.class);
				startActivity(i);
				finish();

			}
		});

		Exit.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//TODO exit
			}
		});
	}

}
