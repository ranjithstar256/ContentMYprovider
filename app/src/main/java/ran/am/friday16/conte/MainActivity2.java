package ran.am.friday16.conte;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



import ran.am.friday16.R;

public class MainActivity2 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
	}


	 public void onClickAddName(View view) {
	  ContentValues values = new ContentValues();
	  values.put(MyProvider.name, ((EditText) findViewById(R.id.txtName)).getText().toString());
	  getContentResolver().insert(MyProvider.CONTENT_URI, values);


	  Toast.makeText(getBaseContext(), "New record inserted", Toast.LENGTH_LONG).show();
	 }
}
