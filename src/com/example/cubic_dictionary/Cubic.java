package com.example.cubic_dictionary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Cubic extends Activity {
	ImageView french,german,spanish;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cubic);
		
		french=(ImageView)findViewById(R.id.ivfrench);
		german=(ImageView)findViewById(R.id.ivgerman);
		spanish=(ImageView)findViewById(R.id.ivspain);
		
		french.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i= new Intent(getApplicationContext(),French.class);
				startActivity(i);
			}
		});
		
		german.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i=new Intent(getApplicationContext(),German.class);
				startActivity(i);
			}
		});
		
		spanish.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i=new Intent(getApplicationContext(),Spain.class);
				startActivity(i);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cubic, menu);
		return true;
	}

}
