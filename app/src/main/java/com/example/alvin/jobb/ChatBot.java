package com.example.alvin.jobb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.alvin.jobb.Adapters.MessageListAdapter;
import com.sendbird.android.UserMessage;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ChatBot extends AppCompatActivity {
    private Button mSendButton;
    private EditText mMessageEditText;

    private TextView test;
    private LinearLayout lin;
    private RecyclerView mMessageRecycler;
    private MessageListAdapter mMessageAdapter;
    List messageList = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        View f = findViewById(R.id.text_message_time);
        f.setVisibility(View.VISIBLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot);
        mSendButton = (Button) findViewById(R.id.button_chatbox_send);
        mMessageEditText = findViewById(R.id.edittext_chatbox);

        lin = findViewById(R.id.firstlayout);

//        mMessageRecycler = (RecyclerView) findViewById(R.id.reyclerview_message_list);
//        mMessageAdapter = new MessageListAdapter(this, messageList);
//        mMessageRecycler.setLayoutManager(new LinearLayoutManager(this));
        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View f = findViewById(R.id.text_message_time);
                f.setVisibility(View.VISIBLE);
            }
        });
        View d = findViewById(R.id.firstlayout);
        d.setVisibility(View.GONE);
    }
}
