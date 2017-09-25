package com.example.administrator.myapplication_9_21;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    DrawerLayout drawerLayout;
    ImageView click_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
        click_image=(ImageView)findViewById(R.id.center_main_title_image) ;
        click_image.setOnClickListener(this);
        initData();
    }
    private void initData() {
        addFragmentToStack(new CenterMain());

    }
    private void addFragmentToStack(Fragment fragment) {

        /**  --------------------------------------------------------这儿不懂 -----------------------------------------------------------------------------------------------*/

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.center_main_title_image:
                drawerLayout.openDrawer(Gravity.LEFT);
                break;
        }
    }
}
