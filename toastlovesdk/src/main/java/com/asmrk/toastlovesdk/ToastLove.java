package com.asmrk.toastlovesdk;

import timber.log.Timber;

public class ToastLove {

    public static void display(String args) {
        try {
            Timber.plant(new Timber.DebugTree());

            Timber.d(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
