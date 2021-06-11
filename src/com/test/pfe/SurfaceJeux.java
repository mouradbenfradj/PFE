package com.test.pfe;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SurfaceJeux extends SurfaceView implements Runnable {
	SurfaceHolder monHolder;
	Thread monThread = null;
	boolean marche = true;
	public SurfaceJeux(Context context) {
		super(context);
		monHolder = getHolder();
		
	}

	public void pause(){
		marche = false;
		while(true){
			try {
				monThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
	monThread=null;
	}
	
	public void resume(){
		marche= true;
		monThread = new Thread(this);
		monThread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(marche){
			if(!monHolder.getSurface().isValid())
				continue;
			Canvas canvas =monHolder.lockCanvas();
			canvas.drawRGB(02, 02, 150);
			monHolder.unlockCanvasAndPost(canvas);
		}
		
	}

}
