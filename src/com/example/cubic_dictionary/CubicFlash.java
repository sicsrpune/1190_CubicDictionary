package com.example.cubic_dictionary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

public class CubicFlash extends Activity {
private final int SPLASH_DISPLAY_LENGTH=1000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cubic_flash);
		new Handler().postDelayed(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent i=new Intent(CubicFlash.this,Cubic.class);
				CubicFlash.this.startActivity(i);
				CubicFlash.this.finish();
			}
			
		}, SPLASH_DISPLAY_LENGTH);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cubic_flash, menu);
		return true;
	}

}
