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
		//重要的函数，重写onReciever。
		Log.w("操作","已经获取到了请求的部分");
		System.out.println("操作部分执行了");
		String age = intent.getStringExtra("age");
		if(age==null) System.out.println("为空");
		
		Intent it = new Intent(context,RecieveActivity.class);
		it.putExtra("age",age);
		it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//关键代码Activity上级Context启动Activity的时候使用flag
		context.startActivity(it);
	}

}
