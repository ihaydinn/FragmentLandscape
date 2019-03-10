package com.ismailhakkiaydin.fragmentlandscape;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DigerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diger_activity);

        Intent intent=getIntent();
        int pos=intent.getIntExtra("position",0);
        FragmentDetay fragmentDetay= (FragmentDetay) getFragmentManager().findFragmentById(R.id.fragmentDigerDetay);
        fragmentDetay.changeKonu(pos);

    }

}