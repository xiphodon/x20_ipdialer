package com.example.x20_ipdialer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class CallReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		//���IP��·
		//��ȡ�����������Ĺ㲥�в����ĺ��루���ݣ�
		String number = getResultData();
		
		if(number.startsWith("0")){
			//ʹ�������Ĳ���
			SharedPreferences sp = context.getSharedPreferences("ip", context.MODE_PRIVATE);
			String ipNumber = sp.getString("ipNumber", "");
			
			number = ipNumber + number;
			//���º�����·���㲥��
			setResultData(number);
		}
		
	}

}
