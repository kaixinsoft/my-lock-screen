package com.animate.lockscreen.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

import com.animate.lockscreen.theme.pattern.ThemePatternOne;
import com.animate.lockscreen.theme.slide.SlideToUnlock;
import com.animate.lockscreen.theme.tap.TapToUnlockView;

public class UnlockScreenFactory {

	public static UnlockScreenFactory INSTANCE = null;
	
	private UnlockScreenFactory() {
		INSTANCE = this;
	}
	
	/**
	 * get Instance of DatabaseController to work with data
	 * @author HuanND
	 * @return
	 */
	public static UnlockScreenFactory getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new UnlockScreenFactory();
		}
		return INSTANCE;
	}
	
	public Fragment getUnlockScreen(Context context){
		return new ThemePatternOne();
	}
}
