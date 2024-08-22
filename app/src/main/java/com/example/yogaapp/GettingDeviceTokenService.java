package com.example.yogaapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;

public class GettingDeviceTokenService extends FirebaseMessagingService {
    @Override
    public void onNewToken(String DeviceToken) {
        super.onNewToken(DeviceToken);
        Log.e("DEVICE TOKEN:",DeviceToken);
    }
}