package com.example.administrator.myapplication_9_21;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication_9_21.adapter.ViewPageAdapter;
import com.example.administrator.myapplication_9_21.layout.SlidingTabLayout;
import com.example.administrator.myapplication_9_21.sliding_fragment.SlidingFragment1;
import com.example.administrator.myapplication_9_21.sliding_fragment.SlidingFragment2;
import com.example.administrator.myapplication_9_21.sliding_fragment.SlidingFragment3;

import java.util.ArrayList;
import java.util.List;

public class CenterMain extends Fragment {
    private View view;
    private Toolbar toobar;
   private ViewPager viewPager;
    private SlidingTabLayout tabLayout;/** 引用了下载的两个固定的类*/
   private List<Fragment>list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_center_main,container,false);
        initView();
       return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initDate();
    }
    private void initView(){
        toobar=(Toolbar)view.findViewById(R.id.toolbar);
        viewPager=(ViewPager)view .findViewById(R.id.viewPager);
        tabLayout=(SlidingTabLayout)view.findViewById(R.id.tabLayout);
    }
    private void initDate(){
        list=new ArrayList<>();
        list.add(new SlidingFragment1());
        list.add(new SlidingFragment2());
        list.add(new SlidingFragment3());
        ViewPageAdapter adapter=new ViewPageAdapter(getFragmentManager(),list,view.getContext());
        viewPager.setAdapter(adapter);
        tabLayout.setDistributeEvenly(true);//平铺标签
        tabLayout.setViewPager(viewPager);
        tabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return Color.WHITE;
            }
        });
    }
}
