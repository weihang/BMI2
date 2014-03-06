package com.example.bmi2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText height;
	private EditText weight;
	private Button button;
	private TextView textView;
	private Button clearButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (TextView) findViewById(R.id.resultTextView);
		height=(EditText) findViewById(R.id.heighteditText);		
		weight= (EditText) findViewById(R.id.weighteditText);
		button=(Button) findViewById(R.id.startButton);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendfunction();
				
			}
		});

		clearButton = (Button) findViewById(R.id.clearButton);
		clearButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				height.getText().clear();
				weight.getText().clear();
				textView.setText("BMI");
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void sendfunction(){
		float h1 = Float.parseFloat(height.getText().toString());
		float w1 = Float.parseFloat(weight.getText().toString());
		// float sum = Float.parseFloat(h1)+Float.parseFloat(w1) ;
		float bmi =  (w1)/((h1)*(h1)/10000);
		textView.setText("±zªºBMI­È¬°"+bmi);
	}

}
