package com.nam.myapplication;

// Taken from Hello Testing Tutorial
// http://developer.android.com/resources/tutorials/testing/helloandroid_test.html

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import com.nam.myapplication.HelloAndroid;

public class HelloAndroidTest extends
		ActivityInstrumentationTestCase2<HelloAndroid> {

	private HelloAndroid mActivity;
	private TextView mView;
	private String resourceString;

	public HelloAndroidTest() {
		super("com.nam.myapplication", HelloAndroid.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mActivity = this.getActivity();
		mView = (TextView) mActivity.findViewById(com.nam.myapplication.R.id.textview);
		resourceString = mActivity.getString(com.nam.myapplication.R.string.hello);
	}

	public void testPreconditions() {
		assertNotNull(mView);
	}

	public void testText() {
	      assertEquals(resourceString,(String)mView.getText());
	    }
	
	
}
