package com.example.cubic_dictionary;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

public class FrenchInformation extends Activity {

	FetchData Data;
	TextView tvfrench;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_french_information);
		
		tvfrench=(TextView)findViewById(R.id.tvabt);
		
		Data=new FetchData(R.raw.f_info);
		tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.french_information, menu);
		return true;
	}

}
