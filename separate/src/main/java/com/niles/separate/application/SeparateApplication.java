package com.niles.separate.application;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by Niles
 * Date 2018/11/25 16:41
 * Email niulinguo@163.com
 */
public class SeparateApplication extends Application {

    protected final ApplicationLikeManager mLikeManager = new ApplicationLikeManager();

    @Override
    public void onCreate() {
        super.onCreate();
        mLikeManager.setApplication(this);
        onRegisterApplicationLikeManager(mLikeManager);
        mLikeManager.onCreate();
    }

    protected void onRegisterApplicationLikeManager(ApplicationLikeManager likeManager) {

    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        mLikeManager.onTrimMemory(level);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        mLikeManager.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mLikeManager.onLowMemory();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mLikeManager.onConfigurationChanged(newConfig);
    }
}
