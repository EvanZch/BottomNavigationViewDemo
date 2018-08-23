package com.evan.demo.bottomnavigationdemo;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.evan.demo.bottomnavigationdemo.utils.BottomNavigationViewHelper;


/**
 * @author Evan_zch
 */
public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    public void initView() {
        mToolbar = findViewById(R.id.toolbar);
        mBottomNavigationView = findViewById(R.id.bv_bottomNavigation);
    }

    public void initData() {
        setSupportActionBar(mToolbar);
        BottomNavigationViewHelper.disableShiftMode(mBottomNavigationView);
    }
}
