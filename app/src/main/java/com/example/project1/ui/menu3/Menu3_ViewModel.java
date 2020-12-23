package com.example.project1.ui.menu3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Menu3_ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Menu3_ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is menu3 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}