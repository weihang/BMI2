package com.example.bmi2;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private EditText height;
	private EditText weight;
	private Button button;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (TextView) findViewById(R.id.textView2);
		
		height=(EditText) findViewById(R.id.editText1);
		height.setHint("type your height(m)");
		
		weight= (EditText) findViewById(R.id.editText2);
		weight.setHint("type your weight(kg)");
				
		button=(Button) findViewById(R.id.button1);
		button.setText("send");
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String h1 = height.getText().toString();
				String w1 = weight.getText().toString();
				float sum = Float.parseFloat(h1)+Float.parseFloat(w1) ;
				float bmi =  Float.parseFloat(w1)/(Float.parseFloat(h1)*Float.parseFloat(h1)) ;
				textView.setText("±zªºBMI­È¬°"+Float.toString(bmi));
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
