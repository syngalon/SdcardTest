package com.tpv.mantis.sdcardtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


/**
 * 检测sdcard插入，检测sdcard里面是否有特定的文件，有则打开本测试apk；
 * 
 * 另外如果指定位置有版本更高的本测试apk则直接升级
 * 
 * @author Uemc
 *  create time 2015-8-11
 */
public class SdcardReceiver extends BroadcastReceiver {
	
	private static final String TAG = "TpvSdcardReceiver";
	
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i(TAG, "SdcardReceiver: onReceive");
		String action = intent.getAction();

//		Toast.makeText(context, action + "; PATH="+ mountPath, Toast.LENGTH_LONG).show();
        Log.i(TAG, "SdcardReceiver: oaction=" + action);

		
		if (Intent.ACTION_MEDIA_MOUNTED.equals(action)) {
            Log.i(TAG, "SdcardReceiver: ACTION_MEDIA_MOUNTED");
            Toast.makeText(context, "ACTION_MEDIA_MOUNTED", Toast.LENGTH_LONG).show();
            openTestActivity(context);
		}
	}

    private void openTestActivity(Context contex) {
        Intent intent = new Intent();
        intent.setClass(contex, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        contex.startActivity(intent);
    }


}
