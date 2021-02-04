package com.example.loggingactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Lifecycle";
    private static final String KEY = "Key";
    private TextView text;
    private String method;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);

        method = "onCreate";
        Log.d(TAG, method);
        text.append("\n" + method);

        if (savedInstanceState != null && savedInstanceState.containsKey(KEY)) {
            text.setText(savedInstanceState.getString(KEY));
        } else if (savedInstanceState == null) {
            method = "Параметр равен null";
            Log.d(TAG, method);
            text.append("\n" + method);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        method = "onStart";
        Log.d(TAG, method);
        text.append("\n" + method);
    }

    @Override
    protected void onResume() {
        super.onResume();
        method = "onResume";
        Log.d(TAG, method);
        text.append("\n" + method);
    }

    @Override
    protected void onStop() {
        super.onStop();
        method = "onStop";
        Log.d(TAG, method);
        text.append("\n" + method);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        method = "onDestroy";
        Log.d(TAG, method);
        text.append("\n" + method);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        method = "onRestart";
        Log.d(TAG, method);
        text.append("\n" + method);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        method = "onPostCreate";
        Log.d(TAG, method);
        text.append("\n" + method);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        method = "onPostResume";
        Log.d(TAG, method);
        text.append("\n" + method);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        method = "onKeyDown";
        Log.d(TAG, method);
        text.append("\n" + method);
        return true;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        super.onKeyLongPress(keyCode, event);
        method = "onKeyLongPress";
        Log.d(TAG, method);
        text.append("\n" + method);
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        method = "onBackPressed";
        Log.d(TAG, method);
        text.append("\n" + method);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        method = "onSaveInstanceState";
        Log.d(TAG, method);
        text.append("\n" + method);

        savedInstanceState.putString(KEY, text.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        method = "onRestoreInstanceState";
        Log.d(TAG, method);
        text.append("\n" + method);
    }
}