package com.example.cubic_dictionary;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class DeutschVocabulary extends Activity {

	Spinner spgerman;
	TextView tvgerman;
	FetchData Data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_deutsch_vocabulary);
		
		spgerman=(Spinner)findViewById(R.id.spinner1);
		tvgerman=(TextView)findViewById(R.id.tvgerman);
		
		ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.vocab, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spgerman.setAdapter(adapter);
	
		
		spgerman.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
			String str=	parent.getItemAtPosition(position).toString();
			if(position > 0)
			{
				if(str.equalsIgnoreCase("number"))
				{
					Data=new FetchData(R.raw.number);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Environment"))
				{
					Data=new FetchData(R.raw.environment);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("communication"))
				{
					Data=new FetchData(R.raw.communication);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("food and drink"))
				{
					Data=new FetchData(R.raw.food_and_drink);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Month"))
				{
					Data=new FetchData(R.raw.month);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Weekdays"))
				{
					Data=new FetchData(R.raw.weekdays);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Relationships"))
				{
					Data=new FetchData(R.raw.relationships);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Feeling and attitude"))
				{
					Data=new FetchData(R.raw.feeling_and_emotion);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Education"))
				{
					Data=new FetchData(R.raw.education);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("City"))
				{
					Data=new FetchData(R.raw.city);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Home"))
				{
					Data=new FetchData(R.raw.home);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Furniture"))
				{
					Data=new FetchData(R.raw.furniture);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Sports"))
				{
					Data=new FetchData(R.raw.sports);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Transport and travel"))
				{
					Data=new FetchData(R.raw.transport_and_travel);
					tvgerman.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
			}
				else
				{
					tvgerman.setText("");
					Toast.makeText(getApplicationContext(), "Please Select option", Toast.LENGTH_SHORT).show();
				}
			
				
		}
			

			@Override
				public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
						}
		});
		
	}
	


	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.deutsch_vocabulary, menu);
		return true;
	}

}
