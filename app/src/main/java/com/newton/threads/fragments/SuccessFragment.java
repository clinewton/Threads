package com.newton.threads.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.newton.threads.R;

public class SuccessFragment extends Fragment {

    private Button btn_continue;
    public SuccessFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_success, container, false);


        btn_continue = root.findViewById(R.id.btn_continue);

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_right);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.add(R.id.frame_layout, new HomeFragment(), "Home").commit();
            }
        });

        return root;
    }
}