package com.recieve;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Myreciever extends BroadcastReceiver {

	public Myreciever() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		//��Ҫ�ĺ�������дonReciever��
		Log.w("����","�Ѿ���ȡ��������Ĳ���");
		System.out.println("��������ִ����");
		String age = intent.getStringExtra("age");
		if(age==null) System.out.println("Ϊ��");
		
		Intent it = new Intent(context,RecieveActivity.class);
		it.putExtra("age",age);
		it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//�ؼ�����Activity�ϼ�Context����Activity��ʱ��ʹ��flag
		context.startActivity(it);
	}

}
