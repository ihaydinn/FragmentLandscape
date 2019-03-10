package com.ismailhakkiaydin.fragmentlandscape;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentKonu extends Fragment implements AdapterView.OnItemClickListener{

    ListView konuListesi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_konu, container, false);

        konuListesi= (ListView) v.findViewById(R.id.konuListe);

        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.baslik, android.R.layout.simple_list_item_1);
        konuListesi.setAdapter(adapter);
        konuListesi.setOnItemClickListener(this);


        return v;

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        MyListener listener= (MyListener) getActivity();

        listener.sendData(position);

    }
}