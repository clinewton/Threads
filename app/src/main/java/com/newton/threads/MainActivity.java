package com.newton.threads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.newton.threads.fragments.CategoriesFragment;
import com.newton.threads.fragments.CheckoutFragment;
import com.newton.threads.fragments.HomeFragment;
import com.newton.threads.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private CardView home, items, cart, profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = findViewById(R.id.home);
        items = findViewById(R.id.items);
        cart = findViewById(R.id.shopping_cart);
        profile = findViewById(R.id.profile);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_right,R.anim.enter_from_right,R.anim.exit_to_right);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.add(R.id.frame_layout, new HomeFragment(), "Home").commit();
            }
        });

        items.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_right,R.anim.enter_from_right,R.anim.exit_to_right);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.add(R.id.frame_layout, new CategoriesFragment(), "Categories").commit();
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_right,R.anim.enter_from_right,R.anim.exit_to_right);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.add(R.id.frame_layout, new CheckoutFragment(), "Shopping Cart").commit();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_right,R.anim.enter_from_right,R.anim.exit_to_right);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.add(R.id.frame_layout, new ProfileFragment(), "Profile").commit();
            }
        });

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_right,R.anim.enter_from_right,R.anim.exit_to_right);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.add(R.id.frame_layout, new HomeFragment(), "Home").commit();
    }
}
