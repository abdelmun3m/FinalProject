package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.abdelmun3m.jokediaplay.DisplayActivity;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by abdelmun3m on 12/01/18.
 */

public class fetchJoke extends AsyncTask<Void , Void , String> {

    Context context =null;
    ProgressBar load  = null;
    CountDownLatch signal = null;

    private String result = "";
    fetchJoke(MainActivity activity){
        this.context = (Context) activity;
        this.load = activity.load;
    }
    fetchJoke(CountDownLatch signal){
        this.signal = signal;
    }
    @Override
    protected String doInBackground(Void... voids) {
        return fetch();
    }
    @Override
    protected void onPostExecute(String s) {
        if(context != null){
            load.setVisibility(View.INVISIBLE);
            Intent i = new Intent(context, DisplayActivity.class);
            i.putExtra("joke",s);
            context.startActivity(i);
        }else if(signal != null){
            signal.countDown();
        }
    }
    public String getRes(){
        return result;
    }
    public String fetch(){
        MyApi myApiService = null;
        Log.d("A7A","inback");
        MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                new AndroidJsonFactory(), null)
                .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                    @Override
                    public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                        abstractGoogleClientRequest.setDisableGZipContent(true);
                    }
                });

        myApiService = builder.build();

        String res = "" ;
        try {
            res = myApiService.getJoke().execute().getData();
        } catch (IOException e) {
            res  = e.getMessage();
        }
        result = res;
        return res;
    }
}
