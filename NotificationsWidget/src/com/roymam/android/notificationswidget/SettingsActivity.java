package com.roymam.android.notificationswidget;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity 
{
	public static String TURNSCREENON = "turnscreenon";
	public static String SHOW_CLOCK = "showclock";
	public static String SHOW_CLEAR_BUTTON= "showclearbutton";
	
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
