package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by abdelmun3m on 12/01/18.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest{
    fetchJoke mytest = new fetchJoke(null);

    @Before
    public void testFetch(){
        Log.d("A7A","test : testfetch");
        mytest.fetch();
    }
    @Test
    public void t(){
        Log.d("A7A","test : t");
        assertNotEquals("",mytest.getRes());
    }

}