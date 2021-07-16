package ran.am.friday16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Basic components of Android
    //1. Activity
    //2. Intent
    //3. Broadcast Receivers
    //4. Content Providers
    //5. Services
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerReceiver( batteryReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED) );

    }
    private BroadcastReceiver batteryReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent )
        {
            int level = intent.getIntExtra( "level", 0 );
            String bat= String.valueOf(level) + "%" ;
            Toast.makeText(context, "battery level "+bat, Toast.LENGTH_LONG).show();

        }
    };
}