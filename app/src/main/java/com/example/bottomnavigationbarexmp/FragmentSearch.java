package com.example.bottomnavigationbarexmp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

class FragmentSearch extends Fragment {

   public FragmentSearch() {
      super(R.layout.fragment_main);
   }

   @Nullable
   @Override
   public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view =  inflater.inflate(R.layout.fragment_main, container, false);
      TextView fragmentMainTV = view.findViewById(R.id.fragmentMainTV);
      fragmentMainTV.setText(R.string.menu_search);
      return view;
   }
}
