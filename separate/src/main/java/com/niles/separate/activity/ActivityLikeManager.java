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
    private Activity mActivity;

    public void register(ActivityLike like) {
        like.setActivity(mActivity);
        mActivityLikes.add(like);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        for (ActivityLike like : mActivityLikes) {
            like.onCreate(savedInstanceState);
        }
    }

    @Override
    public void onStart() {
        for (ActivityLike like : mActivityLikes) {
            like.onStart();
        }
    }

    @Override
    public void onRestart() {
        for (ActivityLike like : mActivityLikes) {
            like.onRestart();
        }
    }

    @Override
    public void onResume() {
        for (ActivityLike like : mActivityLikes) {
            like.onResume();
        }
    }

    @Override
    public void onPause() {
        for (ActivityLike like : mActivityLikes) {
            like.onPause();
        }
    }

    @Override
    public void onStop() {
        for (ActivityLike like : mActivityLikes) {
            like.onStop();
        }
    }

    @Override
    public void onDestroy() {
        for (ActivityLike like : mActivityLikes) {
            like.onDestroy();
        }
    }

    @Override
    public void onNewIntent(Intent intent) {
        for (ActivityLike like : mActivityLikes) {
            like.onNewIntent(intent);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        for (ActivityLike like : mActivityLikes) {
            like.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        for (ActivityLike like : mActivityLikes) {
            like.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        for (ActivityLike like : mActivityLikes) {
            like.onSaveInstanceState(outState);
        }
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        for (ActivityLike like : mActivityLikes) {
            like.onRestoreInstanceState(savedInstanceState);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean result = false;
        for (ActivityLike like : mActivityLikes) {
            if (like.onCreateOptionsMenu(menu)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean result = false;
        for (ActivityLike like : mActivityLikes) {
            if (like.onOptionsItemSelected(item)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public void onBackPressed() {
        for (ActivityLike like : mActivityLikes) {
            like.onBackPressed();
        }
    }

    @Override
    public Activity getActivity() {
        return mActivity;
    }

    @Override
    public void setActivity(Activity activity) {
        mActivity = activity;
    }
}
