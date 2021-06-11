package com.test.pfe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuC extends Activity {
	Button bJouer,bInstruction,bTemps;


	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menuc);
		bJouer = (Button)findViewById(R.id.jouer);
		bJouer.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.JOUER"));
				
			}
		});
		bInstruction = (Button)findViewById(R.id.instruction);
		bInstruction.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.INSTRUCTION"));
				
			}
		});
		bTemps = (Button)findViewById(R.id.temps);
		bTemps.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.TEMPS"));
				
			}
		});
	}
}
