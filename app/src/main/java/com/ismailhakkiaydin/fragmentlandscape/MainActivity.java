package com.ismailhakkiaydin.fragmentlandscape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MyListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(int position) {

        FragmentDetay fragmentDetay= (FragmentDetay) getFragmentManager().findFragmentById(R.id.fragmentDetay);

        if(fragmentDetay!=null && fragmentDetay.isVisible())
        {
            fragmentDetay.changeKonu(position);
        }else
        {

            Intent i=new Intent(this,DigerActivity.class);

            i.putExtra("position", position);

            startActivity(i);
        }



    }
}