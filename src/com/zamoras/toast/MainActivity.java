package com.zamoras.toast;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button button1,button2;
	Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1=(Button)findViewById(R.id.btnshort);
		button2=(Button)findViewById(R.id.btnlong);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		//return super.onOptionsItemSelected(item);
		switch(item.getItemId()){
		case R.id.item1:
			Toast.makeText(this, "Say Hello!",Toast.LENGTH_SHORT).show(); break;
		case R.id.item2:
			Toast.makeText(this, "They aint us coz they hate us!",Toast.LENGTH_SHORT).show(); break;
		case R.id.item3:
			Toast.makeText(this, "Android is awesome!",Toast.LENGTH_SHORT).show(); break;
			
			default:
			break;
		}
		return true;
	}

	public void toastShort(View view){
		String msg="This is short";
		Toast.makeText(this, msg,Toast.LENGTH_SHORT).show();
	}

	public void toastLong(View view){
		String msg2="This is long";
		Toast t= Toast.makeText(this,msg2, Toast.LENGTH_LONG);
		t.setGravity(Gravity.CENTER, 0, 0);
		t.show();
		
		
	}
}
