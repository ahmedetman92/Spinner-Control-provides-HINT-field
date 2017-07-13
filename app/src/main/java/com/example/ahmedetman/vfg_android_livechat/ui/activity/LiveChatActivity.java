package com.example.ahmedetman.vfg_android_livechat.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import com.example.ahmedetman.vfg_android_livechat.R;
import com.example.ahmedetman.vfg_android_livechat.mvpcontracts.LiveChatContract;
import com.example.ahmedetman.vfg_android_livechat.ui.adapter.HintedSpinnerAdapter;
import com.example.ahmedetman.vfg_android_livechat.ui.presenter.LiveChatPresenter;

import java.util.Arrays;

public class LiveChatActivity extends AppCompatActivity implements LiveChatContract.LiveChatView
{

    Spinner liveChatSpinner;
    LiveChatPresenter liveChatPresenter;
    Button startChatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_chat);

        startChatButton = (Button) findViewById(R.id.start_chat_button);
        liveChatPresenter =  new LiveChatPresenter(this);

        HintedSpinnerAdapter adapter =  new HintedSpinnerAdapter(this,R.layout.spinner_row_item,
               Arrays.asList(getResources().getStringArray(R.array.chat_options_list)),
                        getString(R.string.live_chat_options_title));
        liveChatSpinner = (Spinner) findViewById(R.id.live_chat_options);
        liveChatSpinner.setAdapter(adapter);
        liveChatSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                liveChatPresenter.onSpinnerItemSelected(position);
            }
        });
    }



    @Override
    public void selectChatOption()
    {

    }

    @Override
    public void typeQuestionClick()
    {

    }

    @Override
    public void startChattingClick()
    {

    }
}
