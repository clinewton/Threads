package com.newton.threads.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.newton.threads.MainActivity;
import com.newton.threads.R;

public class CheckoutFragment extends Fragment {

    private Button btn_checkout;
    private RelativeLayout relativeLayout;

    public CheckoutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_checkout, container, false);
        btn_checkout = root.findViewById(R.id.btn_checkout);

        btn_checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_bottom,R.anim.exit_to_bottom);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.add(R.id.frame_layout, new SuccessFragment(), "Success").commit();
            }
        });

        return root;
    }
}