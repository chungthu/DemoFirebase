package fpt.edu.com.demofirebase;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class mApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
