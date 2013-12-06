package com.example.cubic_dictionary;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

public class SpainInformation extends Activity {

	FetchData Data;
	TextView tvs;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spain_information);
		
		tvs=(TextView)findViewById(R.id.tvabt);
		
		Data=new FetchData(R.raw.s_info);
		tvs.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.spain_information, menu);
		return true;
	}

}
