package com.niles.separatesdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.niles.separate.activity.ActivityLike;

/**
 * Created by Niles
 * Date 2018/11/25 19:09
 * Email niulinguo@163.com
 */
public class LogActivityLike implements ActivityLike {

    @Override
    public void onCreate(Activity activity, @Nullable Bundle savedInstanceState) {
        Log.e(activity.getClass().getSimpleName(), "onCreate");
    }

    @Override
    public void onStart(Activity activity) {
        Log.e(activity.getClass().getSimpleName(), "onStart");
    }

    @Override
    public void onRestart(Activity activity) {
        Log.e(activity.getClass().getSimpleName(), "onRestart");
    }

    @Override
    public void onResume(Activity activity) {
        Log.e(activity.getClass().getSimpleName(), "onResume");
    }

    @Override
    public void onPause(Activity activity) {
        Log.e(activity.getClass().getSimpleName(), "onPause");
    }

    @Override
    public void onStop(Activity activity) {
        Log.e(activity.getClass().getSimpleName(), "onStop");
    }

    @Override
    public void onDestroy(Activity activity) {
        Log.e(activity.getClass().getSimpleName(), "onDestroy");
    }

    @Override
    public void onNewIntent(Activity activity, Intent intent) {
        Log.e(activity.getClass().getSimpleName(), "onNewIntent");
    }

    @Override
    public void onActivityResult(Activity activity, int requestCode, int resultCode, @Nullable Intent data) {
        Log.e(activity.getClass().getSimpleName(), "onActivityResult");
    }

    @Override
    public void onRequestPermissionsResult(Activity activity, int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        Log.e(activity.getClass().getSimpleName(), "onRequestPermissionsResult");
    }

    @Override
    public void onSaveInstanceState(Activity activity, Bundle outState) {
        Log.e(activity.getClass().getSimpleName(), "onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Activity activity, Bundle savedInstanceState) {
        Log.e(activity.getClass().getSimpleName(), "onRestoreInstanceState");
    }

    @Override
    public boolean onCreateOptionsMenu(Activity activity, Menu menu) {
        Log.e(activity.getClass().getSimpleName(), "onCreateOptionsMenu");
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(Activity activity, MenuItem item) {
        Log.e(activity.getClass().getSimpleName(), "onOptionsItemSelected");
        return false;
    }

    @Override
    public void onBackPressed(Activity activity) {
        Log.e(activity.getClass().getSimpleName(), "onBackPressed");
    }
}
