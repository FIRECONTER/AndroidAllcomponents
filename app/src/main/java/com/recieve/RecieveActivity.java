package com.recieve;

import com.example.androidallcomponentsre.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
//reciever接收到后，用于启动的Activity实现跨进程的接收信息。
public class RecieveActivity extends Activity {

	public RecieveActivity() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myreciever);
		Toast.makeText(this, "启动了",Toast.LENGTH_LONG).show();
		String age = getIntent().getStringExtra("age");//当前的年龄。
		TextView tr = (TextView)findViewById(R.id.tx1);
		tr.setText(age);//设置控件显示的数字。
		
	}

}
