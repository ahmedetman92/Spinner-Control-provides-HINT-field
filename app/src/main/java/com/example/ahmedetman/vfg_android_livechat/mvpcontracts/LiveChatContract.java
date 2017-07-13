package com.example.ahmedetman.vfg_android_livechat.mvpcontracts;

/**
 * Created by Ahmed Etman on 7/5/2017.
 */

public interface LiveChatContract
{
    interface LiveChatView
    {
        void selectChatOption();
        void typeQuestionClick();
        void startChattingClick();
    }

    interface LiveChatPresenter
    {
        void onSpinnerItemSelected(int position);
        void onAddNewQuestion();
    }
}
