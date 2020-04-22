package ke.co.afixus.shuleplus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class nav_frag extends Fragment {
    Button acad_btn;
    Button announce_btn;
    Button cocaricular_btn;
    Button health_btn;
    Button schoolfees_btn;
    Button suggestion_btn;
    Button behaviour_btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_nav, container, false);
       acad_btn = view.findViewById(R.id.academics_btn);
       announce_btn = view.findViewById(R.id.notifications_btn);
       cocaricular_btn = view.findViewById(R.id.cocaricular_btn);
       health_btn= view.findViewById(R.id.health_btn);
       schoolfees_btn= view.findViewById(R.id.fees_btn);
       suggestion_btn = view.findViewById(R.id.suggestions_btn);
       behaviour_btn= view.findViewById(R.id.behavioral_btn);


       acad_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FragmentTransaction ft = getFragmentManager().beginTransaction();
               ft.addToBackStack(null);
               ft.add(R.id.fragment_main_std, new acad_frag());
               ft.commit();
           }
       });


        announce_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main_std, new anouncements_frag());
                ft.commit();
            }
        });

        cocaricular_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main_std, new cocaricular_frag());
                ft.commit();
            }
        });

        health_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main_std, new health_frag());
                ft.commit();
            }
        });

        schoolfees_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main_std, new schoolfees_frag());
                ft.commit();
            }
        });


        suggestion_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main_std, new suggestions_frag());
                ft.commit();
            }
        });


        behaviour_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main_std, new behaviour_frag());
                ft.commit();
            }
        });


        acad_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.fragment_main_std, new acad_frag());
                ft.commit();
            }
        });



       return view;
    }
}
