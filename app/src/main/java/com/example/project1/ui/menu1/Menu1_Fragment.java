package com.example.project1.ui.menu1;

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

public class Menu1_Fragment extends Fragment {

    private Menu1_ViewModel menu1ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        menu1ViewModel =
                ViewModelProviders.of(this).get(Menu1_ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu1, container, false);
        final TextView textView = root.findViewById(R.id.text_menu1);
        menu1ViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
