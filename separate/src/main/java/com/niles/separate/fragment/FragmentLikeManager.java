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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niles
 * Date 2018/11/25 18:59
 * Email niulinguo@163.com
 */
public class FragmentLikeManager implements FragmentLike {

    private final List<FragmentLike> mFragmentLikes = new ArrayList<>();
    private Fragment mFragment;

    public void register(FragmentLike like) {
        like.setFragment(mFragment);
        mFragmentLikes.add(like);
    }

    @Override
    public Fragment getFragment() {
        return mFragment;
    }

    @Override
    public void setFragment(Fragment fragment) {
        mFragment = fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        for (FragmentLike like : mFragmentLikes) {
            like.onCreate(savedInstanceState);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View result = null;
        for (FragmentLike like : mFragmentLikes) {
            View view = like.onCreateView(inflater, container, savedInstanceState);
            if (view != null) {
                result = view;
            }
        }
        return result;
    }

    @Override
    public void onResume() {
        for (FragmentLike like : mFragmentLikes) {
            like.onResume();
        }
    }

    @Override
    public void onStart() {
        for (FragmentLike like : mFragmentLikes) {
            like.onStart();
        }
    }

    @Override
    public void onPause() {
        for (FragmentLike like : mFragmentLikes) {
            like.onPause();
        }
    }

    @Override
    public void onStop() {
        for (FragmentLike like : mFragmentLikes) {
            like.onStop();
        }
    }

    @Override
    public void onDestroy() {
        for (FragmentLike like : mFragmentLikes) {
            like.onDestroy();
        }
    }

    @Override
    public void onDestroyView() {
        for (FragmentLike like : mFragmentLikes) {
            like.onDestroyView();
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        for (FragmentLike like : mFragmentLikes) {
            like.onViewCreated(view, savedInstanceState);
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        for (FragmentLike like : mFragmentLikes) {
            like.onSaveInstanceState(outState);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        for (FragmentLike like : mFragmentLikes) {
            like.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        for (FragmentLike like : mFragmentLikes) {
            like.onActivityCreated(savedInstanceState);
        }
    }

    @Override
    public void onAttach(Context context) {
        for (FragmentLike like : mFragmentLikes) {
            like.onAttach(context);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean result = false;
        for (FragmentLike like : mFragmentLikes) {
            if (like.onOptionsItemSelected(item)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        for (FragmentLike like : mFragmentLikes) {
            like.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override
    public void onDetach() {
        for (FragmentLike like : mFragmentLikes) {
            like.onDetach();
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        for (FragmentLike like : mFragmentLikes) {
            like.onCreateOptionsMenu(menu, inflater);
        }
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        for (FragmentLike like : mFragmentLikes) {
            like.onViewStateRestored(savedInstanceState);
        }
    }
}
