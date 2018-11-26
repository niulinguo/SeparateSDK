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

    public void register(FragmentLike like) {
        mFragmentLikes.add(like);
    }

    @Override
    public void onCreate(Fragment fragment, @Nullable Bundle savedInstanceState) {
        for (FragmentLike like : mFragmentLikes) {
            like.onCreate(fragment, savedInstanceState);
        }
    }

    @Override
    public View onCreateView(Fragment fragment, @NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View result = null;
        for (FragmentLike like : mFragmentLikes) {
            View view = like.onCreateView(fragment, inflater, container, savedInstanceState);
            if (view != null) {
                result = view;
            }
        }
        return result;
    }

    @Override
    public void onResume(Fragment fragment) {
        for (FragmentLike like : mFragmentLikes) {
            like.onResume(fragment);
        }
    }

    @Override
    public void onStart(Fragment fragment) {
        for (FragmentLike like : mFragmentLikes) {
            like.onStart(fragment);
        }
    }

    @Override
    public void onPause(Fragment fragment) {
        for (FragmentLike like : mFragmentLikes) {
            like.onPause(fragment);
        }
    }

    @Override
    public void onStop(Fragment fragment) {
        for (FragmentLike like : mFragmentLikes) {
            like.onStop(fragment);
        }
    }

    @Override
    public void onDestroy(Fragment fragment) {
        for (FragmentLike like : mFragmentLikes) {
            like.onDestroy(fragment);
        }
    }

    @Override
    public void onDestroyView(Fragment fragment) {
        for (FragmentLike like : mFragmentLikes) {
            like.onDestroyView(fragment);
        }
    }

    @Override
    public void onViewCreated(Fragment fragment, @NonNull View view, @Nullable Bundle savedInstanceState) {
        for (FragmentLike like : mFragmentLikes) {
            like.onViewCreated(fragment, view, savedInstanceState);
        }
    }

    @Override
    public void onSaveInstanceState(Fragment fragment, @NonNull Bundle outState) {
        for (FragmentLike like : mFragmentLikes) {
            like.onSaveInstanceState(fragment, outState);
        }
    }

    @Override
    public void onActivityResult(Fragment fragment, int requestCode, int resultCode, Intent data) {
        for (FragmentLike like : mFragmentLikes) {
            like.onActivityResult(fragment, requestCode, resultCode, data);
        }
    }

    @Override
    public void onActivityCreated(Fragment fragment, @Nullable Bundle savedInstanceState) {
        for (FragmentLike like : mFragmentLikes) {
            like.onActivityCreated(fragment, savedInstanceState);
        }
    }

    @Override
    public void onAttach(Fragment fragment, Context context) {
        for (FragmentLike like : mFragmentLikes) {
            like.onAttach(fragment, context);
        }
    }

    @Override
    public boolean onOptionsItemSelected(Fragment fragment, MenuItem item) {
        boolean result = false;
        for (FragmentLike like : mFragmentLikes) {
            if (like.onOptionsItemSelected(fragment, item)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public void onRequestPermissionsResult(Fragment fragment, int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        for (FragmentLike like : mFragmentLikes) {
            like.onRequestPermissionsResult(fragment, requestCode, permissions, grantResults);
        }
    }

    @Override
    public void onDetach(Fragment fragment) {
        for (FragmentLike like : mFragmentLikes) {
            like.onDetach(fragment);
        }
    }

    @Override
    public void onCreateOptionsMenu(Fragment fragment, Menu menu, MenuInflater inflater) {
        for (FragmentLike like : mFragmentLikes) {
            like.onCreateOptionsMenu(fragment, menu, inflater);
        }
    }

    @Override
    public void onViewStateRestored(Fragment fragment, @Nullable Bundle savedInstanceState) {
        for (FragmentLike like : mFragmentLikes) {
            like.onViewStateRestored(fragment, savedInstanceState);
        }
    }
}
