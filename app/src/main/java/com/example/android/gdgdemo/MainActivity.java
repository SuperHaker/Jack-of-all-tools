package com.example.android.gdgdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends Activity implements DemoInterface {

	@Override public void onCreate(@Nullable Bundle savedInstanceState,
		@Nullable PersistableBundle persistentState) {
		super.onCreate(savedInstanceState, persistentState);
		setContentView(R.layout.recycler_activity);

		//Lambda demo
		Button b = new Button(this);
		b.setOnClickListener(view -> {
			//write your listener implementation
		});
	}

	//Try with resources demo

	public void withoutJava8(String filename) {

		InputStream is = null;
		try {
			is = new FileInputStream(filename);
		} catch (Exception ignored) {
		} finally {
			try {
				assert is != null;
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void withJava8(String filename) {
		try {
			InputStream is = new FileInputStream(filename);
			//is closes after try ends
		} catch (Exception ignored) {
		}
	}

	//OnClickListener created using tools:context
	public void doSomeStuff(View view) {
	}
}

