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

public class Spain extends Activity {

	Button btnspain,btnexit,btnhear,btninfo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spain);
		
		btnspain=(Button)findViewById(R.id.btnvocab);
		btnexit=(Button)findViewById(R.id.btnexit);
		btnhear=(Button)findViewById(R.id.btnhear);
		btninfo=(Button)findViewById(R.id.btninfo);
		
		btnspain.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i =new Intent (getApplication(),SpanischVocabulary.class);
				startActivity(i);
			}
		});
		
		
		btninfo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(getApplicationContext(),SpainInformation.class);
				startActivity(i);
			}
		});
		
		btnhear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(getApplicationContext(),ListenSpanish.class);
				startActivity(i);
			}
		});
		
		
	
		
		btnexit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				final Toast toast = Toast.makeText(getApplicationContext(), "ADIOS...", Toast.LENGTH_SHORT);
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
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.spain, menu);
		return true;
	}

}
