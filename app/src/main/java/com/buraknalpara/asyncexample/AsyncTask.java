package com.buraknalpara.asyncexample;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.SystemClock;
import android.widget.ProgressBar;

public class AsyncTask extends android.os.AsyncTask<Integer, Integer, String> {

    ProgressBar pb;
    int status = 0;
    private String[] value;


    public void setProgressBar(ProgressBar progressBar) {
        this.pb = progressBar;
    }

    @Override
    protected String doInBackground(Integer[] objects) {
        for (int i = 0; i < objects[0]; i++){
            status++;
            try {
                publishProgress(status);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer[] values) {
        pb.setProgress(values[0]);

        super.onProgressUpdate(values);

    }
}
