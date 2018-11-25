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

    private Activity mActivity;
    private String mTag;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        mTag = mActivity.getClass().getSimpleName();
        Log.e(mTag, "onCreate");
    }

    @Override
    public void onStart() {
        Log.e(mTag, "onStart");
    }

    @Override
    public void onRestart() {
        Log.e(mTag, "onRestart");
    }

    @Override
    public void onResume() {
        Log.e(mTag, "onResume");
    }

    @Override
    public void onPause() {
        Log.e(mTag, "onPause");
    }

    @Override
    public void onStop() {
        Log.e(mTag, "onStop");
    }

    @Override
    public void onDestroy() {
        Log.e(mTag, "onDestroy");
    }

    @Override
    public void onNewIntent(Intent intent) {
        Log.e(mTag, "onNewIntent");
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Log.e(mTag, "onActivityResult");
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        Log.e(mTag, "onRequestPermissionsResult");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.e(mTag, "onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.e(mTag, "onRestoreInstanceState");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e(mTag, "onCreateOptionsMenu");
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.e(mTag, "onOptionsItemSelected");
        return false;
    }

    @Override
    public void onBackPressed() {
        Log.e(mTag, "onBackPressed");
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
