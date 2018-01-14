package com.udacity.gradle.builditbigger.free;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.udacity.gradle.builditbigger.BuildConfig;
import com.udacity.gradle.builditbigger.R;

/**
 * A placeholder fragment containing a simple view.
 */

public class MainActivityFragment extends Fragment {

    private static final String FreeVersionID = "com.udacity.gradle.builditbigger.free";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        if(BuildConfig.APPLICATION_ID.equals(FreeVersionID)){
            AdView mAdView = (AdView) root.findViewById(R.id.adView);
            mAdView.setVisibility(View.VISIBLE);
            AdRequest adRequest = new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .build();
            mAdView.loadAd(adRequest);
        }
        return root;
    }
}
