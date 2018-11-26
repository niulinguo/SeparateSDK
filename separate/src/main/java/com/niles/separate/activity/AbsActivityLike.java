package com.niles.separate.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Niles
 * Date 2018/11/25 18:48
 * Email niulinguo@163.com
 */
public class AbsActivityLike implements ActivityLike {

    @Override
    public void onCreate(Activity activity, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public void onStart(Activity activity) {

    }

    @Override
    public void onRestart(Activity activity) {

    }

    @Override
    public void onResume(Activity activity) {

    }

    @Override
    public void onPause(Activity activity) {

    }

    @Override
    public void onStop(Activity activity) {

    }

    @Override
    public void onDestroy(Activity activity) {

    }

    @Override
    public void onNewIntent(Activity activity, Intent intent) {

    }

    @Override
    public void onActivityResult(Activity activity, int requestCode, int resultCode, @Nullable Intent data) {

    }

    @Override
    public void onRequestPermissionsResult(Activity activity, int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

    }

    @Override
    public void onSaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onRestoreInstanceState(Activity activity, Bundle savedInstanceState) {

    }

    @Override
    public boolean onCreateOptionsMenu(Activity activity, Menu menu) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(Activity activity, MenuItem item) {
        return false;
    }

    @Override
    public void onBackPressed(Activity activity) {

    }
}
