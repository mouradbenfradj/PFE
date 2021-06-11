package com.test.pfe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jouer extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		Button bUnJ,bMultieJ;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		bUnJ = (Button)findViewById(R.id.unJoueur);
		bUnJ.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.JOUER"));
				
			}
		});
		bMultieJ = (Button)findViewById(R.id.multieJoueurs);
		bMultieJ.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.INSTRUCTION"));
				
			}
		});
		
	}
}
