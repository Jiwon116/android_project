package com.example.project1.ui.menu1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Menu1_ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Menu1_ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Menu1 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}