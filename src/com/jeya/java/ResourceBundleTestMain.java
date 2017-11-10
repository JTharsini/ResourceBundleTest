package com.jeya.java;

import java.util.ResourceBundle;

public class ResourceBundleTestMain {
	static ResourceBundle mybundle = ResourceBundle.getBundle("com.jeya.java.resources.lang.test");
	public static void main(String[] args) {
		System.out.println(getTranslation());
	}
	private static String getTranslation() {
		return mybundle.getString("miyaav");
	}
}