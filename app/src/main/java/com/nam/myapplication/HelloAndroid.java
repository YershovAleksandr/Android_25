package com.nam.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class HelloAndroid extends AppCompatActivity {
	public void onCreate(Bundle savedInstanceState) {
		
		// Required call through to Activity.onCreate()
		// Restore any saved instance state
		super.onCreate(savedInstanceState);
		
		// Set up the application's user interface (content view)
		setContentView(R.layout.helloandroid);
		
	}
}