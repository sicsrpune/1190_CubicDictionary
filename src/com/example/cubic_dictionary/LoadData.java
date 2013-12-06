package com.example.cubic_dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.content.Context;

public class LoadData {
	int resource;
	String txt;
	public LoadData(int resource,String txt)
		{
		this.resource=resource;
		this.txt=txt;
		}
	public StringBuilder getRawData(Context ctx)
	{
		InputStream inputStream = ctx.getResources().openRawResource(resource);

	    InputStreamReader inputreader = new InputStreamReader(inputStream);
	    BufferedReader buffreader = new BufferedReader(inputreader);
	    String line;
	    StringBuilder text = new StringBuilder();

	    try {
	        while (( line = buffreader.readLine()) != null) {
	        	if(line.startsWith(txt))
	        	{
	            text.append(line);
	            text.append('\n');
	        	}
	        }
	    } catch (IOException e) {
	        return null;
	    }
	    return text;
	}
			
}
