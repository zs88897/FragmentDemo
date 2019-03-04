package com.example.a17164.fragmentdemo;

import android.app.Activity;

import android.support.v4.app.FragmentManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Configuration config=getResources().getConfiguration();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        if(config.orientation==Configuration.ORIENTATION_LANDSCAPE){
            /**
             * 设备的横屏模式
            */
            LandscapeFragment ls_fragment=new LandscapeFragment();
            fragmentTransaction.replace(android.R.id.content,ls_fragment);
        }else {
            /**
             * 设备的竖屏模式
             * */
            PortraitFragment pm_fragment=new PortraitFragment();
            fragmentTransaction.replace(android.R.id.content,pm_fragment);
        }
        fragmentTransaction.commit();
    }
}
