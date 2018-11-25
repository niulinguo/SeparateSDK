package com.niles.separate.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Niles
 * Date 2018/11/25 18:33
 * Email niulinguo@163.com
 */
public class SeparateActivity extends AppCompatActivity {

    private final ActivityLikeManager mLikeManager = new ActivityLikeManager();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLikeManager.setActivity(this);
        onRegisterActivityLikeManager(mLikeManager);
        mLikeManager.onCreate(savedInstanceState);
    }

    protected void onRegisterActivityLikeManager(ActivityLikeManager likeManager) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        mLikeManager.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mLikeManager.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mLikeManager.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mLikeManager.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mLikeManager.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLikeManager.onDestroy();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mLikeManager.onNewIntent(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mLikeManager.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        mLikeManager.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mLikeManager.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mLikeManager.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return mLikeManager.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mLikeManager.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mLikeManager.onBackPressed();
    }

}
