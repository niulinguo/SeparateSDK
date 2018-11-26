package com.niles.separatesdk;

import com.niles.separate.activity.ActivityLike;
import com.niles.separate.activity.ActivityLikeManager;
import com.niles.separate.activity.SeparateActivity;

import java.util.List;

/**
 * Created by Niles
 * Date 2018/11/26 09:45
 * Email niulinguo@163.com
 */
public abstract class BaseActivity extends SeparateActivity {

    @Override
    protected void onRegisterActivityLikeManager(ActivityLikeManager likeManager) {
        List<ActivityLike> commonActivityLikes = MyAppLike.getInstance().getCommonActivityLikes();
        for (ActivityLike commonActivityLike : commonActivityLikes) {
            likeManager.register(commonActivityLike);
        }
    }
}
