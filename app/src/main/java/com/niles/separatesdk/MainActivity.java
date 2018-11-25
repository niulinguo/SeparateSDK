package com.niles.separatesdk;

import android.os.Bundle;

import com.niles.separate.activity.ActivityLikeManager;
import com.niles.separate.activity.SeparateActivity;

public class MainActivity extends SeparateActivity {

    @Override
    protected void onRegisterActivityLikeManager(ActivityLikeManager likeManager) {
        likeManager.register(new LogActivityLike());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
