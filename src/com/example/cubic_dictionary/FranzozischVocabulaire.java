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

public class FranzozischVocabulaire extends Activity {

	Spinner spfrench;
	TextView tvfrench;
	FetchData Data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_franzozisch_vocabulaire);
		
		spfrench=(Spinner)findViewById(R.id.spinner1);
		tvfrench=(TextView)findViewById(R.id.tvfrench);
		
		ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.vocab, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spfrench.setAdapter(adapter);
		
		spfrench.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
			String str=	parent.getItemAtPosition(position).toString();
			if(position > 0)
			{
				if(str.equalsIgnoreCase("number"))
				{
					Data=new FetchData(R.raw.fr_number);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Environment"))
				{
					Data=new FetchData(R.raw.fr_environment);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("communication"))
				{
					Data=new FetchData(R.raw.fr_communication);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("food and drink"))
				{
					Data=new FetchData(R.raw.fr_food_and_drinks);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Month"))
				{
					Data=new FetchData(R.raw.fr_month);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Weekdays"))
				{
					Data=new FetchData(R.raw.fr_weekdays);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Relationships"))
				{
					Data=new FetchData(R.raw.fr_relationships);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Feeling and attitude"))
				{
					Data=new FetchData(R.raw.fr_feeling_and_emotions);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Education"))
				{
					Data=new FetchData(R.raw.fr_education);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("City"))
				{
					Data=new FetchData(R.raw.fr_city);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Home"))
				{
					Data=new FetchData(R.raw.fr_home);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Furniture"))
				{
					Data=new FetchData(R.raw.fr_furniture);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Sports"))
				{
					Data=new FetchData(R.raw.fr_sports);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Transport and travel"))
				{
					Data=new FetchData(R.raw.fr_transport_and_travel);
					tvfrench.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
			}
				else
				{
					tvfrench.setText("");
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
		getMenuInflater().inflate(R.menu.franzozisch_vocabulaire, menu);
		return true;
	}

}
