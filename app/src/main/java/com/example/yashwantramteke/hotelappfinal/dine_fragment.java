package com.example.yashwantramteke.hotelappfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class dine_fragment extends Fragment implements View.OnClickListener {
    ImageButton americanBreakfast, americanLunch, americanDinner, britishBreakfast, britishLunch, britishDinner, japaneseBreakfast, japaneseLunch, japaneseDinner, extras;

    public dine_fragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dine, container, false);

        ImageButton americanBreakfast = view.findViewById(R.id.american_breakfast);
        ImageButton americanLunch = view.findViewById(R.id.american_lunch);
        ImageButton americanDinner = view.findViewById(R.id.american_dinner);

        ImageButton britishBreakfast = view.findViewById(R.id.british_breakfast);
        ImageButton britishLunch = view.findViewById(R.id.british_lunch);
        ImageButton britishDinner = view.findViewById(R.id.british_dinner);

        ImageButton japaneseBreakfast = view.findViewById(R.id.japanese_breakfast);
        ImageButton japaneseLunch = view.findViewById(R.id.japanese_lunch);
        ImageButton japaneseDinner = view.findViewById(R.id.japanese_dinner);

        americanBreakfast.setOnClickListener(this);
        americanLunch.setOnClickListener(this);
        americanDinner.setOnClickListener(this);

        britishBreakfast.setOnClickListener(this);
        britishLunch.setOnClickListener(this);
        britishDinner.setOnClickListener(this);

        japaneseBreakfast.setOnClickListener(this);
        japaneseLunch.setOnClickListener(this);
        japaneseDinner.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch(viewId) {
            case R.id.american_breakfast:
                startActivity(new Intent(getActivity(), customize_a_breakfast.class));
                break;
            case R.id.american_lunch:
                startActivity(new Intent(getActivity(), customize_a_lunch.class));
                break;
            case R.id.american_dinner:
                startActivity(new Intent(getActivity(), customize_a_dinner.class));
                break;
            case R.id.british_breakfast:
                startActivity(new Intent(getActivity(), customize_b_breakfast.class));
                break;
            case R.id.british_lunch:
                startActivity(new Intent(getActivity(), customize_b_lunch.class));
                break;
            case R.id.british_dinner:
                startActivity(new Intent(getActivity(), customize_b_dinner.class));
                break;
            case R.id.japanese_breakfast:
                startActivity(new Intent(getActivity(), customize_j_breakfast.class));
                break;
            case R.id.japanese_lunch:
                startActivity(new Intent(getActivity(), customize_j_lunch.class));
                break;
            case R.id.japanese_dinner:
                startActivity(new Intent(getActivity(), customize_j_dinner.class));
                break;
            case R.id.extras:
                startActivity(new Intent(getActivity(), customize_extras.class));
                break;
        }
    }
}
