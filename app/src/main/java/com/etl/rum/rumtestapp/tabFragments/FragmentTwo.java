package com.etl.rum.rumtestapp.tabFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.etl.rum.rumtestapp.R;

public class FragmentTwo extends Fragment {
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        Log.e(getActivity().getClass().getSimpleName(), "onCreateView FragmentTwo");
        return view;
    }
}