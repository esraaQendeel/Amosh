package menus.menus.menus;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ImageView;
import android.widget.Toast;

public class Main extends Activity {

	ImageView iv, iv2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		iv = (ImageView) findViewById(R.id.imageView1);
		iv2 = (ImageView) findViewById(R.id.imageView2);
		registerForContextMenu(iv);
		registerForContextMenu(iv2);
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
		
		
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.item1:
			Toast.makeText(getApplicationContext(), "item1", Toast.LENGTH_SHORT).show();
			break;
		case R.id.item2:
			Toast.makeText(getApplicationContext(), "item2", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
		return super.onContextItemSelected(item);
	}
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		if (v.getId() ==  R.id.imageView1) {
			MenuInflater inflater = getMenuInflater();
			inflater.inflate(R.menu.img_context_menu, menu);
		}else if (v.getId() ==  R.id.imageView2){
			MenuInflater inflater = getMenuInflater();
			inflater.inflate(R.menu.main, menu);
		}
		
		super.onCreateContextMenu(menu, v, menuInfo);
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.one:
			Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
			break;
		case R.id.tow:
			Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
			break;
		case R.id.three:
			Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
			break;
		case R.id.fouur:
			Toast.makeText(getApplicationContext(), "4", Toast.LENGTH_SHORT).show();
			break;
		case R.id.five:
			Toast.makeText(getApplicationContext(), "5", Toast.LENGTH_SHORT).show();
			break;
		case R.id.sex:
			Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
			break;
		case R.id.seven:
			Toast.makeText(getApplicationContext(), "7", Toast.LENGTH_SHORT).show();
			break;
		case R.id.eight:
			Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	
	

	

	

	
}
