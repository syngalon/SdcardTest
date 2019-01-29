# SdcardTest

监听android.intent.action.MEDIA_MOUNTED
intentFilter.addDataScheme("file"); （动态注册）

或者在AndroidManifest.xml加上：

<data android:scheme="file"/>（静态注册）


无该语句，BroadcastReceiver将无法收到SD卡插拔广播消息

        <receiver android:name=".SdcardReceiver">
            <intent-filter>
                <action android:name="android.intent.action.MEDIA_MOUNTED" />
                <data android:scheme="file"/>
            </intent-filter>
        </receiver>
