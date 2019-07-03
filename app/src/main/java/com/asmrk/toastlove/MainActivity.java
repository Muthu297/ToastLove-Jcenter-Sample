package com.asmrk.toastlove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.asmrk.toastlovesdk.ToastLove;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastLove.display("Muthuraman HelloWorld");
    }
}
