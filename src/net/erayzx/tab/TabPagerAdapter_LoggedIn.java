package net.erayzx.tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter_LoggedIn extends FragmentStatePagerAdapter {
    public TabPagerAdapter_LoggedIn(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int i) {
		switch (i) {
        case 0:
            //Fragement for Android Tab
            return new Upload_frag();
        case 1:
           //Fragment for Ios Tab
            return new Feed_frag();
        case 2:
            //Fragment for Windows Tab
            return new Profile_frag();
        }
		return null;
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3; //No of Tabs
	}


    }