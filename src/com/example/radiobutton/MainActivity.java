package com.example.radiobutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup_main_sex);
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				int radioButtonId = arg0.getCheckedRadioButtonId();
				switch (radioButtonId) {
				case R.id.radioButton_left:
					Toast.makeText(getApplicationContext(), "��ͨ/�Ӽ�ת��",
							Toast.LENGTH_SHORT).show();
					break;
				case R.id.radioButton_right:
					Toast.makeText(getApplicationContext(), "ʵʱת��",
							Toast.LENGTH_SHORT).show();
					break;

				default:
					break;
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
