package com.github.muravyova.githubreporeader.util;

import android.arch.lifecycle.LiveData;

public class AbsentLiveData extends LiveData {

    private AbsentLiveData(){
        postValue(null);
    }

    public static <T> LiveData<T> create(){
        return new AbsentLiveData();
    }
}