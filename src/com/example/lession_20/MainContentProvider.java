package com.example.lession_20;

import java.util.ArrayList;

import android.net.Uri;
import android.os.Bundle;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;



import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GraphView.GraphViewData;
import com.jjoe64.graphview.GraphViewSeries;
import com.jjoe64.graphview.LineGraphView;

import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainContentProvider extends Activity {
	int zero, one, two, three, four, five, six, seven, eight, nine, ten,
			eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen,
			eighteen, nineteen, twenty, twentyone, twentytwo, twentythree;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_content_provider);

		final ArrayList<Integer> dateList = new ArrayList<Integer>();

		ContentResolver myContentResolver = getContentResolver();
		Uri smsuri = Uri.parse("content://sms/sent");
		Cursor cursor = myContentResolver.query(smsuri, null, null, null, null);

		if (cursor.moveToFirst()) {
			int ColumnIndex = cursor.getColumnIndex("date");
			do {
				String date = cursor.getString(ColumnIndex);
				
				// SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
				DateFormat formatter = new SimpleDateFormat("HH");
				Calendar calendar = Calendar.getInstance();
				long now = Long.parseLong(date);
			
				calendar.setTimeInMillis(now);
				String count = formatter.format(calendar.getTime());
				dateList.add(Integer.parseInt(count));
			} while (cursor.moveToNext());
		}
		for (int i = 0; i < dateList.size(); i++) {
		
			
		
			
			if (dateList.get(i) == 0) {
				zero = zero + 1;
				
			}
			if (dateList.get(i) == 1) {
				one = one + 1;
			
			}
			if (dateList.get(i) == 2) {
				two++;
			}
			if (dateList.get(i) == 3) {
				three++;
			}
			if (dateList.get(i) == 4) {
				four++;
			}
			if (dateList.get(i) == 5) {
				five++;
			}
			if (dateList.get(i) == 6) {
				six++;
			}
			if (dateList.get(i) == 7) {
				seven++;
			}
			if (dateList.get(i) == 8) {
				eight++;
			}
			if (dateList.get(i) == 9) {
				nine++;
			}
			if (dateList.get(i) == 10) {
				ten++;
			}
			if (dateList.get(i) == 11) {
				eleven++;
			}
			if (dateList.get(i) == 12) {
				twelve++;
			}
			if (dateList.get(i) == 13) {
				thirteen++;
			}
			if (dateList.get(i) == 14) {
				fourteen++;
			}
			if (dateList.get(i) == 15) {
				fifteen++;
			}
			if (dateList.get(i) == 16) {
				sixteen++;
			}
			if (dateList.get(i) == 17) {
				seventeen++;
			}
			if (dateList.get(i) == 18) {
				eighteen++;
			}
			if (dateList.get(i) == 19) {
				nineteen++;
			}
			if (dateList.get(i) == 20) {
				twenty++;
			}
			if (dateList.get(i) == 21) {
				twentyone++;
			}
			if (dateList.get(i) == 22) {
				twentytwo++;
			}
			if (dateList.get(i) == 23) {
				twentythree++;
			}
		}
		Log.v("mylog", Integer.toString(zero));

		// draw the chart!
		GraphViewSeries SMSTimeResult = new GraphViewSeries(
				new GraphViewData[] { 
						
						new GraphViewData(0, zero),
						new GraphViewData(1, one), 
						new GraphViewData(2, two),
						new GraphViewData(3, three),
						new GraphViewData(4, four),
						new GraphViewData(5, five),
						new GraphViewData(6, six),
						new GraphViewData(7, seven),
						new GraphViewData(8, eight),
						new GraphViewData(9, nine),
						new GraphViewData(10, ten),
						new GraphViewData(11, eleven),
						new GraphViewData(12, twelve),
						new GraphViewData(13, thirteen),
						new GraphViewData(14, fourteen),
						new GraphViewData(15, fifteen),
						new GraphViewData(16, sixteen),
						new GraphViewData(17, seventeen),
						new GraphViewData(18, eighteen),
						new GraphViewData(19, nineteen),
						new GraphViewData(20, twenty),
						new GraphViewData(21, twentyone),
						new GraphViewData(22, twentytwo),
						new GraphViewData(23, twentythree),
					
						});

		GraphView graphView = new LineGraphView(this // context
				, "SMSAnalysis" // heading
		);
		graphView.addSeries(SMSTimeResult); // data

		RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);
		layout.addView(graphView);

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_content_provider, menu);
		return true;
	}	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.menu_about:
	        	
	        	 Intent i = new Intent(this, about.class); 
	             startActivity(i);
	            return true;
	      
	    }
		return false;
	}
	
}