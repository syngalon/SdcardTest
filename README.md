# SdcardTest
监听android.intent.action.MEDIA_MOUNTED必须加入<data android:scheme="file"/>，否则无法监听sdcard插入消息

        <receiver android:name=".SdcardReceiver">
            <intent-filter>
                <action android:name="android.intent.action.MEDIA_MOUNTED" />
                <data android:scheme="file"/>
            </intent-filter>
        </receiver>
