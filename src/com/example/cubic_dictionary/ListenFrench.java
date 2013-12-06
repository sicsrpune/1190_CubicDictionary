package com.example.cubic_dictionary;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ListenFrench extends Activity implements OnInitListener {

	Button btnhear;
	EditText ethear;
	TextToSpeech ttshear;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listen_french);
		
		btnhear=(Button)findViewById(R.id.btnhear);
		ethear=(EditText)findViewById(R.id.editText1);
		
		ttshear=new TextToSpeech(this,this);
		
		
		btnhear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				speakOut();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.listen_french, menu);
		return true;
	}

	@Override
	public void onInit(int status) {
		// TODO Auto-generated method stub
		if(status == TextToSpeech.SUCCESS)
		{
			int show=ttshear.setLanguage(Locale.FRANCE);
			
			if(show == TextToSpeech.LANG_MISSING_DATA || show == TextToSpeech.LANG_NOT_SUPPORTED)
			{
				Log.e("ttshear", "Invalid Input");
			}
			else
			{
				btnhear.setEnabled(true);
				speakOut();
			}
		}	
			else
			{
				Log.e("ttshear","Failed to start");
			}
	}
	public void speakOut()
	{
		String str=ethear.getText().toString();
		ttshear.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	}
	public void onDestroy()
	{
		if(ttshear != null)
		{
			ttshear.stop();
			ttshear.shutdown();
		}
		super.onDestroy();
	}

}
