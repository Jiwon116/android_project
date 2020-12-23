package com.example.project1.ui.menu2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Menu2_ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Menu2_ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is menu2 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}