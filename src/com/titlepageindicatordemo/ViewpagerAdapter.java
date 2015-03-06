package com.titlepageindicatordemo;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewpagerAdapter extends FragmentPagerAdapter{
	 protected static final String[] CONTENT = new String[] { "0", "1", "2", "3","4"};
	
	private int mcount=CONTENT.length;
	 
	public ViewpagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		MyFragment myFragment=new MyFragment();
		return myFragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mcount;
	}
	

    @Override
    public CharSequence getPageTitle(int position) {
      return ViewpagerAdapter.CONTENT[position % CONTENT.length];
    }


}
