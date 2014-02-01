package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseObject;

import com.parse.ParseACL;

import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		Parse.initialize(this, "kzbfFOcnKrrZPZi9k42grEMTkQaxskZTvWoJw5ZW", "vtinb3Uat5iudYT6PkhVww6FglD5vjG21ivPFDKV");


		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
		
		ParseObject testObject = new ParseObject("TestObject");
		testObject.put("foo", "bar");
		testObject.saveInBackground();
	}

}
