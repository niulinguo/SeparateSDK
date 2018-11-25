package com.niles.separate.application;

import android.app.Application;
import android.content.res.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niles
 * Date 2018/11/25 16:38
 * Email niulinguo@163.com
 */
public class ApplicationLikeManager implements ApplicationLike {

    private final List<ApplicationLike> mApplicationLikes = new ArrayList<>();
    private Application mApplication;

    public void register(ApplicationLike like) {
        like.setApplication(mApplication);
        mApplicationLikes.add(like);
    }

    @Override
    public Application getApplication() {
        return mApplication;
    }

    @Override
    public void setApplication(Application application) {
        mApplication = application;
    }

    @Override
    public void onCreate() {
        for (ApplicationLike like : mApplicationLikes) {
            like.onCreate();
        }
    }

    @Override
    public void onTrimMemory(int level) {
        for (ApplicationLike like : mApplicationLikes) {
            like.onTrimMemory(level);
        }
    }

    @Override
    public void onTerminate() {
        for (ApplicationLike like : mApplicationLikes) {
            like.onTerminate();
        }
    }

    @Override
    public void onLowMemory() {
        for (ApplicationLike like : mApplicationLikes) {
            like.onLowMemory();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        for (ApplicationLike like : mApplicationLikes) {
            like.onConfigurationChanged(newConfig);
        }
    }
}
