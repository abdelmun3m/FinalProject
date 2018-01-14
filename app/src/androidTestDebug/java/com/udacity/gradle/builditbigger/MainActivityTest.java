package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by abdelmun3m on 12/01/18.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest{

    @Test
    public void testFetchJokes(){

        final CountDownLatch signal = new CountDownLatch(1);

        fetchJoke  mytest = new fetchJoke(signal);
        mytest.execute();

        try {
            signal.await(30, TimeUnit.SECONDS);
            assertNotEquals("",mytest.getRes());
          //  assertEquals("",mytest.getRes());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}