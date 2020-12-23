package com.example.project1.ui.menu3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.project1.R;

public class Menu3_Fragment extends Fragment {

    private Menu3_ViewModel menu3ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        menu3ViewModel =
                ViewModelProviders.of(this).get(Menu3_ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu3, container, false);
        final TextView textView = root.findViewById(R.id.text_menu3);
        menu3ViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
