package com.example.homefragment.ui.nuevo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NuevoFragmentoModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NuevoFragmentoModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es mi nuevo fragmento.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}