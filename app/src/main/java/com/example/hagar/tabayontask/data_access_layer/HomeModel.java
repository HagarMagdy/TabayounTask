package com.example.hagar.tabayontask.data_access_layer;

import android.content.Context;
import android.media.MediaPlayer;

import com.example.hagar.tabayontask.R;
import com.example.hagar.tabayontask.presenter.HomePresenter;
import com.example.hagar.tabayontask.view.HomeModelInterface;

/**
 * Created by Hagar on 17/09/2018.
 */

public class HomeModel implements HomeModelInterface {
    HomePresenter presenter;

    public HomeModel(HomePresenter presenter){
        this.presenter = presenter;

    }

    @Override
    public void getSound(Context context) {
        final MediaPlayer mp = MediaPlayer.create(context, R.raw.fountain);
        mp.start();
    }
}
