package com.example.administrator.myapplication_9_21.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class ViewPageAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> list;
    private Context context;
    private String[] main_titles={"第一页","第二页","第三页"};
    public ViewPageAdapter(FragmentManager fm,List<Fragment> list,Context context) {
        super(fm);
        this.list=list;
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        if(list!=null){
            return list.size();
        }
        return 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return main_titles[position];
    }
}
