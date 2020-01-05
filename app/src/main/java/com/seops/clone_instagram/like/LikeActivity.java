package com.seops.clone_instagram.like;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.seops.clone_instagram.R;
import com.seops.clone_instagram.utils.BottomNavigationViewHelper;

public class LikeActivity extends AppCompatActivity {
    private static final String TAG = "LikeActivity";
    private static final int ACTIVITY_NUM = 3;

    private Context mContext = LikeActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: Starting");

        setBottomNavigationView();
    }

    private void setBottomNavigationView() {
        Log.d(TAG, "setBottomNavigationView: setting-up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);

        // Set ui moving when button clicked
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);

        // Set button when button clicked
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}
