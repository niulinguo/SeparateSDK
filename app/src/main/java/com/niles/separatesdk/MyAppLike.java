package com.niles.separatesdk;

import com.niles.separate.activity.ActivityLike;
import com.niles.separate.application.AbsApplicationLike;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niles
 * Date 2018/11/26 09:28
 * Email niulinguo@163.com
 */
public class MyAppLike extends AbsApplicationLike {

    private static MyAppLike sInstance;
    private final List<ActivityLike> mCommonActivityLikes = new ArrayList<>();

    public static MyAppLike getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        mCommonActivityLikes.add(new LogActivityLike());
    }

    public List<ActivityLike> getCommonActivityLikes() {
        return mCommonActivityLikes;
    }
}
