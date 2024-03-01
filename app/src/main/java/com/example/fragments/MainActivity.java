package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    FragmentManager fragmentManager = getSupportFragmentManager();
    public void onClickingMoviesbtn(View view){

        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,MoviesFragment.class,null)
                .setReorderingAllowed(true)
                .disallowAddToBackStack()
                .commit();
    }
    public void onClickingSeriesbtn(View view){
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,SeriesFragment.class,null)
                .setReorderingAllowed(true)
                .disallowAddToBackStack()
                .commit();
    }
    public void onClickingAnimationsbtn(View view){
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,AnimationsFragment.class,null)
                .setReorderingAllowed(true)
                .disallowAddToBackStack()
                .commit();
    }

}