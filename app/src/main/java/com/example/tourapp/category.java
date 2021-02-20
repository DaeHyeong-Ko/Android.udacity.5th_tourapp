package com.example.tourapp;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class category extends FragmentPagerAdapter {

        private Context mContext;

        public category(Context context, FragmentManager fm) {
            super(fm);
            mContext = context;
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new shoppingFragment();
            } else if (position == 1) {
                return new beachFragment();
            } else if (position == 2) {
                return new parkFragment();
            } else {
                return new shoppingFragment();
            }
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return mContext.getString(R.string.tab1);
            } else if (position == 1) {
                return mContext.getString(R.string.tab2);
            } else if (position == 2) {
                return mContext.getString(R.string.tab3);
            } else {
                return mContext.getString(R.string.tab4);
            }
        }
    }