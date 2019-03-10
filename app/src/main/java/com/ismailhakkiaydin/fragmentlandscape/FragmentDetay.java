package com.ismailhakkiaydin.fragmentlandscape;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentDetay extends Fragment {

    TextView aciklama;
    String[] detaylar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_aciklama, container, false);

        aciklama = (TextView) v.findViewById(R.id.tvAciklama);
        detaylar=getResources().getStringArray(R.array.aciklama);
        aciklama.setText(detaylar[0]);


        return v;
    }




    public void changeKonu(int position) {

        String[] detaylar=getResources().getStringArray(R.array.aciklama);

        aciklama.setText(detaylar[position]);

    }
}