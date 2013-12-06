package com.example.cubic_dictionary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class French extends Activity {

	Button btnfrench,btnexit,btnhear,btninfo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_french);
		
		btnfrench=(Button)findViewById(R.id.btnvocab);		
		btnexit=(Button)findViewById(R.id.btnexit);		
		btnhear=(Button)findViewById(R.id.btnhear);		
		btninfo=(Button)findViewById(R.id.btninfo);
		
		btnfrench.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent i=new Intent(getApplicationContext(),FranzozischVocabulaire.class);
			startActivity(i);
			}
		});
		
		btnexit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				final Toast toast = Toast.makeText(getApplicationContext(), "ADIEU...", Toast.LENGTH_SHORT);
			    toast.show();

			    Handler handler = new Handler();
			        handler.postDelayed(new Runnable() {
			           @Override
			           public void run() {
			               toast.cancel(); 
			           }
			    }, 500);
			        
			        finish();

			}
		});
		
		
		
		btnhear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Intent i = new Intent(getApplicationContext(),ListenFrench.class);
				startActivity(i);
			}
		});
		btninfo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(getApplicationContext(),FrenchInformation.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.french, menu);
		return true;
	}

}
