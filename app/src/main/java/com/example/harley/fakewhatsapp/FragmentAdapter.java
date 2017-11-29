package com.example.harley.fakewhatsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter{

    public FragmentAdapter(FragmentManager _fragmento){
        super(_fragmento);
    }

    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FragmentCamera();
            case 1:
                return new FragmentDialog();
            case 2:
                return new FragmentStatus();
            case 3:
                return new FragmentCall();
            default:
                return null;
        }
    }

    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return "";
            case 1:
                return "CONVERSAS";
            case 2:
                return "STATUS";
            case 3:
                return "CHAMADAS";
            default:
                return "NULL";
        }
    }


    public int getCount() {
        return 4;
    }
}

