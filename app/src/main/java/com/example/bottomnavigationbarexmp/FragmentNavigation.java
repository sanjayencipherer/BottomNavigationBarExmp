package com.example.bottomnavigationbarexmp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

class FragmentNavigation extends Fragment {

   public FragmentNavigation() {
   }

   public FragmentNavigation(int contentLayoutId) {
      super(R.layout.fragment_main);
   }

   @Nullable
   @Override
   public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      return super.onCreateView(inflater, container, savedInstanceState);
   }
}
