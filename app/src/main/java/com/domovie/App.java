package com.domovie;

import android.app.Application;

/**
 * Created by lebang on 16/6/8.
 */
public class App extends Application {

    private static App instace;

    public static App getInstace(){
        return instace;
    }
}
