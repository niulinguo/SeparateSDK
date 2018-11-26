package com.niles.separate.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niles
 * Date 2018/11/25 18:40
 * Email niulinguo@163.com
 */
public class ActivityLikeManager implements ActivityLike {

    private final List<ActivityLike> mActivityLikes = new ArrayList<>();

    public void register(ActivityLike like) {
        mActivityLikes.add(like);
    }

    @Override
    public void onCreate(Activity activity, @Nullable Bundle savedInstanceState) {
        for (ActivityLike like : mActivityLikes) {
            like.onCreate(activity, savedInstanceState);
        }
    }

    @Override
    public void onStart(Activity activity) {
        for (ActivityLike like : mActivityLikes) {
            like.onStart(activity);
        }
    }

    @Override
    public void onRestart(Activity activity) {
        for (ActivityLike like : mActivityLikes) {
            like.onRestart(activity);
        }
    }

    @Override
    public void onResume(Activity activity) {
        for (ActivityLike like : mActivityLikes) {
            like.onResume(activity);
        }
    }

    @Override
    public void onPause(Activity activity) {
        for (ActivityLike like : mActivityLikes) {
            like.onPause(activity);
        }
    }

    @Override
    public void onStop(Activity activity) {
        for (ActivityLike like : mActivityLikes) {
            like.onStop(activity);
        }
    }

    @Override
    public void onDestroy(Activity activity) {
        for (ActivityLike like : mActivityLikes) {
            like.onDestroy(activity);
        }
    }

    @Override
    public void onNewIntent(Activity activity, Intent intent) {
        for (ActivityLike like : mActivityLikes) {
            like.onNewIntent(activity, intent);
        }
    }

    @Override
    public void onActivityResult(Activity activity, int requestCode, int resultCode, @Nullable Intent data) {
        for (ActivityLike like : mActivityLikes) {
            like.onActivityResult(activity, requestCode, resultCode, data);
        }
    }

    @Override
    public void onRequestPermissionsResult(Activity activity, int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        for (ActivityLike like : mActivityLikes) {
            like.onRequestPermissionsResult(activity, requestCode, permissions, grantResults);
        }
    }

    @Override
    public void onSaveInstanceState(Activity activity, Bundle outState) {
        for (ActivityLike like : mActivityLikes) {
            like.onSaveInstanceState(activity, outState);
        }
    }

    @Override
    public void onRestoreInstanceState(Activity activity, Bundle savedInstanceState) {
        for (ActivityLike like : mActivityLikes) {
            like.onRestoreInstanceState(activity, savedInstanceState);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Activity activity, Menu menu) {
        boolean result = false;
        for (ActivityLike like : mActivityLikes) {
            if (like.onCreateOptionsMenu(activity, menu)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean onOptionsItemSelected(Activity activity, MenuItem item) {
        boolean result = false;
        for (ActivityLike like : mActivityLikes) {
            if (like.onOptionsItemSelected(activity, item)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public void onBackPressed(Activity activity) {
        for (ActivityLike like : mActivityLikes) {
            like.onBackPressed(activity);
        }
    }
}
