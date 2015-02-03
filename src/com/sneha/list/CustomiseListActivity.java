package com.sneha.list;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.sneha.list.adapters.Messageadapter;

public class CustomiseListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_customise);
		
		String[] value1 = {"dsfsfgfhf","fghdjfjhj","fjdfinguotu","uybirutyr","ufygofig","hurgyr8tr","rtrtiuytr",
				"rjoyityuou","ttuiyyyyyyyyyyyyu","ggggggggggg"};
		
		String[] value2 = {"dsfsfgfhf","fghdjfjhj","fjdfinguotu","uybirutyr","ufygofig","hurgyr8tr","rtrtiuytr",
				"rjoyityuou","ttuiyyyyyyyyyyyyu","ggggggggggg"};
	
		//SIMPLE ADAPTER 
//		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), 
//				android.R.layout.simple_list_item_1, value1);
//		
//		setListAdapter(adapter);
		
		
		//COUSTOM ADAPTER
		ListView l = (ListView) findViewById(R.id.list);
		Messageadapter adapter = new Messageadapter(CustomiseListActivity.this, value1, value2);
		l.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.customise, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
