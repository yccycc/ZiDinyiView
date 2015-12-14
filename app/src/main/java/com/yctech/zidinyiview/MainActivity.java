package com.yctech.zidinyiview;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    ActivityInfo activityInfo;
    PackageManager packageManager;
    int versionCode;
    String versionName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ComponentName componentName = new ComponentName("com.yctech.zidinyiview","com.yctech.zidinyiview.MainActivity");
        packageManager = getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName,PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        Bundle bundle = activityInfo.metaData;

        String shemale = bundle.getString("xing");
        Log.i("shemale", shemale+"***********"+bundle.size());

        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.yctech.zidinyiview", 0);
            versionCode = packageInfo.versionCode;
            versionName = packageInfo.versionName;
            Log.i("shemale", "***********"+versionName+"******"+versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
