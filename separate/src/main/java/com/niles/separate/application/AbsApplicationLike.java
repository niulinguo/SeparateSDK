package com.niles.separate.application;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by Niles
 * Date 2018/11/25 18:31
 * Email niulinguo@163.com
 */
public class AbsApplicationLike implements ApplicationLike {

    private Application mApplication;

    @Override
    public Application getApplication() {
        return mApplication;
    }

    @Override
    public void setApplication(Application application) {
        if (mApplication != null) {
            throw new RuntimeException("Only Set Application Once");
        }
        mApplication = application;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onTrimMemory(int level) {

    }

    @Override
    public void onTerminate() {

    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {

    }
}
