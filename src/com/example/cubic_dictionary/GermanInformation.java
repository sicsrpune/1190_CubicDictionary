package com.example.cubic_dictionary;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;

import android.widget.TextView;
//import android.widget.ArrayAdapter;

public class GermanInformation extends Activity {
	
	FetchData Data;
	TextView tvgerman;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_german_information);
		tvgerman=(TextView)findViewById(R.id.tvabt);
		
		Data=new FetchData(R.raw.g_info);
		tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
			
				
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.german_information, menu);
		return true;
	}

}
