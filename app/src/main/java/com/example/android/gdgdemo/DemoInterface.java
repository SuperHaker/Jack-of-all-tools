package com.example.android.gdgdemo;

public interface DemoInterface {

	//static method demo
	static String doSomething(String input) {

		return "This is some input" + input;
	}

	//default method demo
	default String defaultMethod(String input) {
		return input;
	}
}
