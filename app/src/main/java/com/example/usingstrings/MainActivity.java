package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView2;
    private Log log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log.i("Lifecycle","onCreate() invoked");

    txtView2 = findViewById(R.id.textView2);
    txtView2.setText(R.string.Msg2);
    }
    public void onStart() {

        super.onStart();
        log.i("Lifecycle", "onStart() invoked");

    }

    public void onRestart() {
        super.onRestart();
        log.i("Lifecycle", "onRestart() invoked");
    }

    public void onResume() {
        super.onResume();
        log.i("Lifecycle","onResume() invoked");

    }
    public void onPause() {
        super.onPause();
        log.i("Lifecycle","onPause() invoked");

    }

    public void onStop() {
        super.onStop();
        log.i("Lifecycle","onStop() invoked");
    }

    public void onDestroy() {

        super.onDestroy();
        log.i("Lifecycle", "onDestroy() invoked");

    }
}