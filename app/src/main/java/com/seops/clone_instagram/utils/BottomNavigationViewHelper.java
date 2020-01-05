package com.seops.clone_instagram.utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.seops.clone_instagram.home.HomeActivity;
import com.seops.clone_instagram.like.LikeActivity;
import com.seops.clone_instagram.profile.ProfileActivity;
import com.seops.clone_instagram.R;
import com.seops.clone_instagram.search.SearchActivity;
import com.seops.clone_instagram.share.ShareActivity;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavViewHelper";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx) {
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");

        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx bottomNavigationViewEx) {
        Log.d(TAG, "enableNavigation: Enable Navigation");
        bottomNavigationViewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Intent intent = null;

                switch (menuItem.getItemId()) {
                    case R.id.ic_home:
                        intent = new Intent(context, HomeActivity.class);
                        break;

                    case R.id.ic_search:
                        intent = new Intent(context, SearchActivity.class);
                        break;

                    case R.id.ic_share:
                        intent = new Intent(context, ShareActivity.class);
                        break;

                    case R.id.ic_alert:
                        intent = new Intent(context, LikeActivity.class);
                        break;

                    case R.id.ic_android:
                        intent = new Intent(context, ProfileActivity.class);
                        break;
                }

                context.startActivity(intent);

                return false;
            }
        });
    }
}
