package com.recieve;

import com.example.androidallcomponentsre.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
//reciever���յ�������������Activityʵ�ֿ���̵Ľ�����Ϣ��
public class RecieveActivity extends Activity {

	public RecieveActivity() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myreciever);
		Toast.makeText(this, "������",Toast.LENGTH_LONG).show();
		String age = getIntent().getStringExtra("age");//��ǰ�����䡣
		TextView tr = (TextView)findViewById(R.id.tx1);
		tr.setText(age);//���ÿؼ���ʾ�����֡�
		
	}

}
