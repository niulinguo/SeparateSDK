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
 * Date 2018/11/25 16:33
 * Email niulinguo@163.com
 */
public interface ActivityLike {

    void onCreate(Activity activity, @Nullable Bundle savedInstanceState);

    void onStart(Activity activity);

    void onRestart(Activity activity);

    void onResume(Activity activity);

    void onPause(Activity activity);

    void onStop(Activity activity);

    void onDestroy(Activity activity);

    void onNewIntent(Activity activity, Intent intent);

    void onActivityResult(Activity activity, int requestCode, int resultCode, @Nullable Intent data);

    void onRequestPermissionsResult(Activity activity, int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults);

    void onSaveInstanceState(Activity activity, Bundle outState);

    void onRestoreInstanceState(Activity activity, Bundle savedInstanceState);

    boolean onCreateOptionsMenu(Activity activity, Menu menu);

    boolean onOptionsItemSelected(Activity activity, MenuItem item);

    void onBackPressed(Activity activity);
}
