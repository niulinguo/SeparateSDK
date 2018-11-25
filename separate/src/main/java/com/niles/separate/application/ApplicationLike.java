package com.niles.separate.application;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by Niles
 * Date 2018/11/25 16:33
 * Email niulinguo@163.com
 */
public interface ApplicationLike {

    Application getApplication();

    void setApplication(Application application);

    void onCreate();

    void onTrimMemory(int level);

    void onTerminate();

    void onLowMemory();

    void onConfigurationChanged(Configuration newConfig);
}
