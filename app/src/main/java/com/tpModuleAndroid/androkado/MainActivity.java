package com.tpModuleAndroid.androkado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Nous sommes dans la fonction onCreate");
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Création de la vue");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "Nous sommes dans la fonction onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "Nous sommes dans la fonction onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "Nous sommes dans la fonction onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "Nous sommes dans la fonction onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG, "Nous sommes dans la fonction onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "Nous sommes dans la fonction onDestroy");
        super.onDestroy();
    }

    public void onClickAdd(View view) {
        Log.i(TAG, "Vous avez cliqué sur le bouton Acheté");


    }

    public void onClickWord(View view) {
        Toast.makeText(this, "URL de l'article", Toast.LENGTH_SHORT).show();
    }
}