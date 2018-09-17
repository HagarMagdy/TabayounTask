package com.example.hagar.tabayontask.presenter;

import android.content.Context;

import com.example.hagar.tabayontask.activity.MainActivity;
import com.example.hagar.tabayontask.data_access_layer.HomeModel;
import com.example.hagar.tabayontask.view.HomePresenterInterface;

/**
 * Created by Hagar on 17/09/2018.
 */

public class HomePresenter implements HomePresenterInterface {
    HomeModel model;
    MainActivity view;

    public HomePresenter(MainActivity view) {
        this.view = view;
        initModel();
    }
    void initModel(){
        model = new HomeModel(this);
    }

    @Override
    public void playSound(Context context) {
        model.getSound(context);
    }
}
