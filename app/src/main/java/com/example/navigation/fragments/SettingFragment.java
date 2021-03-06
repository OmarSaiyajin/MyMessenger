package com.example.navigation.fragments;

import android.app.ActionBar;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navigation.LanguageManager;
import com.example.navigation.R;

public class SettingFragment extends Fragment {

    @Nullable


    ImageButton deButton;
    ImageButton enButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_setting, container, false);
        LanguageManager languageManager = new LanguageManager(this.getActivity());

        getActivity().setTitle(R.string.app_name);

        enButton = rootView.findViewById(R.id.btn_en);
        enButton.setOnClickListener(v -> {
            languageManager.updateResource("en");
            getActivity().recreate();
        });

        deButton = rootView.findViewById(R.id.btn_de);
        deButton.setOnClickListener(v -> {
            languageManager.updateResource("de");
            getActivity().recreate();
        });

        return rootView;
    }


}
