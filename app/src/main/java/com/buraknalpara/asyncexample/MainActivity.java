package com.buraknalpara.asyncexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);

        progressBar.setIndeterminate(false);
        progressBar.setProgress(0);
        progressBar.setMax(10);
    }

    public void start(View view){
        AsyncTask task = new AsyncTask();
        task.setProgressBar(progressBar);
        task.execute(10);
    }
}
