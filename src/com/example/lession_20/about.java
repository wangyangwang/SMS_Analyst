package com.example.lession_20;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class about extends Activity {
	Bitmap bm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		ImageView imageView = (ImageView) this.findViewById(R.id.imageView1);
		imageView.setImageBitmap(bm);
		try {
			InputStream is = this.getAssets().open("mylogo.png");
			bm = BitmapFactory.decodeStream(is);
			imageView.setImageBitmap(bm);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
