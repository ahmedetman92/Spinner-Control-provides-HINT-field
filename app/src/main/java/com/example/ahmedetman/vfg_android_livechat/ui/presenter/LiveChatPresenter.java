package com.example.ahmedetman.vfg_android_livechat.ui.presenter;

import com.example.ahmedetman.vfg_android_livechat.mvpcontracts.LiveChatContract;
import com.example.ahmedetman.vfg_android_livechat.model.LiveChatModel;

/**
 * Created by Ahmed Etman on 7/5/2017.
 */

public class LiveChatPresenter implements LiveChatContract.LiveChatPresenter
{
    LiveChatModel mLiveChatModel;
    LiveChatContract.LiveChatView mLiveChatView;

    public LiveChatPresenter(LiveChatContract.LiveChatView mLiveChatView)
    {
        this.mLiveChatView = mLiveChatView;
        this.mLiveChatModel = new LiveChatModel();
    }


    @Override
    public void onSpinnerItemSelected(int position)
    {

    }


    @Override
    public void onAddNewQuestion()
    {

    }
}
