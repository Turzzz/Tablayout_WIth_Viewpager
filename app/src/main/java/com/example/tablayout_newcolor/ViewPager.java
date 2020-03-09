package com.example.tablayout_newcolor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class ViewPager extends AppCompatActivity {
        TabLayout tabLayout;
        ViewPager2 viewPager;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.test_tablayout);
            viewPager = findViewById(R.id.view_pager);
            tabLayout = findViewById(R.id.tabs);
            viewPager.setAdapter(createCardAdapter());
            new TabLayoutMediator(tabLayout, viewPager,
                    new TabLayoutMediator.TabConfigurationStrategy() {
                        @Override public void onConfigureTab( TabLayout.Tab tab, int  position) {

                            if(position == 0) {
                                tab.setText("Tab " + (position + 1));
                            }
                            else if(position == 1){
                                tab.setText("Tab " + (position + 1));
                            }

                            else if(position == 2){
                                tab.setText("Tab " + (position + 1));
                            }

                        }
                    }).attach();
        }
        private ViewPagerAdapter createCardAdapter() {
            ViewPagerAdapter adapter = new ViewPagerAdapter(this);
            return adapter;
        }
    }