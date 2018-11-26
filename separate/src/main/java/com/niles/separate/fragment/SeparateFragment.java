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
 * Date 2018/11/25 18:52
 * Email niulinguo@163.com
 */
public class SeparateFragment extends Fragment {

    private final FragmentLikeManager mLikeManager = new FragmentLikeManager();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onRegisterFragmentLike(mLikeManager);
        mLikeManager.onCreate(this, savedInstanceState);
    }

    protected void onRegisterFragmentLike(FragmentLikeManager likeManager) {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return mLikeManager.onCreateView(this, inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        mLikeManager.onResume(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        mLikeManager.onStart(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        mLikeManager.onPause(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        mLikeManager.onStop(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mLikeManager.onDestroy(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mLikeManager.onDestroyView(this);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mLikeManager.onViewCreated(this, view, savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        mLikeManager.onSaveInstanceState(this, outState);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mLikeManager.onActivityResult(this, requestCode, resultCode, data);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mLikeManager.onActivityCreated(this, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mLikeManager.onAttach(this, context);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mLikeManager.onOptionsItemSelected(this, item);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        mLikeManager.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLikeManager.onDetach(this);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        mLikeManager.onCreateOptionsMenu(this, menu, inflater);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        mLikeManager.onViewStateRestored(this, savedInstanceState);
    }
}
