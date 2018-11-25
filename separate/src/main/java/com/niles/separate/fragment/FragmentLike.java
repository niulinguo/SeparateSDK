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

    void setFragment(Fragment fragment);

    Fragment getFragment();

    void onCreate(@Nullable Bundle savedInstanceState);

    View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    void onResume();

    void onStart();

    void onPause();

    void onStop();

    void onDestroy();

    void onDestroyView();

    void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState);

    void onSaveInstanceState(@NonNull Bundle outState);

    void onActivityResult(int requestCode, int resultCode, Intent data);

    void onActivityCreated(@Nullable Bundle savedInstanceState);

    void onAttach(Context context);

    boolean onOptionsItemSelected(MenuItem item);

    void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults);

    void onDetach();

    void onCreateOptionsMenu(Menu menu, MenuInflater inflater);

    void onViewStateRestored(@Nullable Bundle savedInstanceState);

}
