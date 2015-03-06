package com.titlepageindicatordemo;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ViewPager viewpager=(ViewPager) findViewById(R.id.viewpager);
		viewpager.setAdapter(new ViewpagerAdapter(getSupportFragmentManager()));
		
		TitlePageIndicator TitlePageIndicator=(TitlePageIndicator) findViewById(R.id.title);
		TitlePageIndicator.setViewPager(viewpager);
		
		TitlePageIndicator.setOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				Toast.makeText(MainActivity.this, "第"+arg0+"项", Toast.LENGTH_SHORT).show();
				
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
