package com.example.tablayout_newcolor;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private static final int CARD_ITEM_SIZE = 3;
    public ViewPagerAdapter( FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @Override public Fragment createFragment(int position) {
        return CardFragment.newInstance(position);
    }
    @Override public int getItemCount() {
        return CARD_ITEM_SIZE;
    }
}
