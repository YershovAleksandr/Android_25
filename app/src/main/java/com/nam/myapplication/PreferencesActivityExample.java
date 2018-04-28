package com.nam.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PreferencesActivityExample extends AppCompatActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.preferencefragment);

		// Open a User Preferences Entry Activity 
		final Button button = (Button) findViewById(R.id.check_pref_button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(PreferencesActivityExample.this, ViewAndUpdatePreferencesActivity.class));
			}
		});

	}
}