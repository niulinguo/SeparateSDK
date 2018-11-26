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
 * Date 2018/11/25 16:33
 * Email niulinguo@163.com
 */
public interface FragmentLike {

    void onCreate(Fragment fragment, @Nullable Bundle savedInstanceState);

    View onCreateView(Fragment fragment, @NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    void onResume(Fragment fragment);

    void onStart(Fragment fragment);

    void onPause(Fragment fragment);

    void onStop(Fragment fragment);

    void onDestroy(Fragment fragment);

    void onDestroyView(Fragment fragment);

    void onViewCreated(Fragment fragment, @NonNull View view, @Nullable Bundle savedInstanceState);

    void onSaveInstanceState(Fragment fragment, @NonNull Bundle outState);

    void onActivityResult(Fragment fragment, int requestCode, int resultCode, Intent data);

    void onActivityCreated(Fragment fragment, @Nullable Bundle savedInstanceState);

    void onAttach(Fragment fragment, Context context);

    boolean onOptionsItemSelected(Fragment fragment, MenuItem item);

    void onRequestPermissionsResult(Fragment fragment, int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults);

    void onDetach(Fragment fragment);

    void onCreateOptionsMenu(Fragment fragment, Menu menu, MenuInflater inflater);

    void onViewStateRestored(Fragment fragment, @Nullable Bundle savedInstanceState);

}
