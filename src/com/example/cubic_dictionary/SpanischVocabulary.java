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

public class SpanischVocabulary extends Activity {

	Spinner spspain;
	TextView tvspain;
	FetchData Data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spanisch_vocabulary);
		
		spspain=(Spinner)findViewById(R.id.spinner1);
		tvspain=(TextView)findViewById(R.id.tvspain);
		
		ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.vocab, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spspain.setAdapter(adapter);
	
		
		spspain.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
			String str=	parent.getItemAtPosition(position).toString();
			if(position > 0)
			{
				if(str.equalsIgnoreCase("number"))
				{
					Data=new FetchData(R.raw.sp_number);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Environment"))
				{
					Data=new FetchData(R.raw.sp_environment);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("communication"))
				{
					Data=new FetchData(R.raw.sp_communication);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("food and drink"))
				{
					Data=new FetchData(R.raw.sp_food_and_drinks);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Month"))
				{
					Data=new FetchData(R.raw.sp_month);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Weekdays"))
				{
					Data=new FetchData(R.raw.sp_weekdays);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Relationships"))
				{
					Data=new FetchData(R.raw.sp_relationships);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Feeling and attitude"))
				{
					Data=new FetchData(R.raw.sp_feeling_and_emotion);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Education"))
				{
					Data=new FetchData(R.raw.sp_education);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("City"))
				{
					Data=new FetchData(R.raw.sp_city);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Home"))
				{
					Data=new FetchData(R.raw.sp_home);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Furniture"))
				{
					Data=new FetchData(R.raw.sp_furniture);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Sports"))
				{
					Data=new FetchData(R.raw.sp_sports);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
				else if(str.equalsIgnoreCase("Transport and travel"))
				{
					Data=new FetchData(R.raw.sp_transport_and_travel);
					tvspain.setText(Html.fromHtml(Data.getRawData(getApplicationContext()).toString()));
				}
			}
				else
				{
					tvspain.setText("");
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
		getMenuInflater().inflate(R.menu.spanisch_vocabulary, menu);
		return true;
	}

}
