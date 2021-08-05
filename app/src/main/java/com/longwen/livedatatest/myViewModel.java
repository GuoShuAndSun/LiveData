package com.longwen.livedatatest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class myViewModel extends ViewModel {

    private MutableLiveData<Integer> LikedNumber;

    public MutableLiveData<Integer> getLikedNumber() {

        if (LikedNumber==null){
            LikedNumber = new MutableLiveData<>();
            LikedNumber.setValue(0);
        }
        return LikedNumber;
    }
    public void addLikedNumber(int n){
        LikedNumber.setValue(LikedNumber.getValue()+n);//相当于LikedNumber++
    }
}
