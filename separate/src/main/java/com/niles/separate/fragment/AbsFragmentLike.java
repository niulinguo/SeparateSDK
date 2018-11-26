package com.niles.separate.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Niles
 * Date 2018/11/25 18:58
 * Email niulinguo@163.com
 */
public class AbsFragmentLike implements FragmentLike {

    @Override
    public void onCreate(Fragment fragment, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public View onCreateView(Fragment fragment, @NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }

    @Override
    public void onResume(Fragment fragment) {

    }

    @Override
    public void onStart(Fragment fragment) {

    }

    @Override
    public void onPause(Fragment fragment) {

    }

    @Override
    public void onStop(Fragment fragment) {

    }

    @Override
    public void onDestroy(Fragment fragment) {

    }

    @Override
    public void onDestroyView(Fragment fragment) {

    }

    @Override
    public void onViewCreated(Fragment fragment, @NonNull View view, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public void onSaveInstanceState(Fragment fragment, @NonNull Bundle outState) {

    }

    @Override
    public void onActivityResult(Fragment fragment, int requestCode, int resultCode, Intent data) {

    }

    @Override
    public void onActivityCreated(Fragment fragment, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public void onAttach(Fragment fragment, Context context) {

    }

    @Override
    public boolean onOptionsItemSelected(Fragment fragment, MenuItem item) {
        return false;
    }

    @Override
    public void onRequestPermissionsResult(Fragment fragment, int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

    }

    @Override
    public void onDetach(Fragment fragment) {

    }

    @Override
    public void onCreateOptionsMenu(Fragment fragment, Menu menu, MenuInflater inflater) {

    }

    @Override
    public void onViewStateRestored(Fragment fragment, @Nullable Bundle savedInstanceState) {

    }
}
