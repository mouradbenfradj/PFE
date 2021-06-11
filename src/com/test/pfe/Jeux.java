package com.test.pfe;

import android.app.Activity;
import android.os.Bundle;

public class Jeux extends Activity {
	SurfaceJeux maSurface;
	
	protected void onCreat(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		maSurface = new SurfaceJeux(this);
		setContentView(maSurface);
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		maSurface.pause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		maSurface.resume();
	}
}

