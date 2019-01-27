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

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button mSendButton;
    private EditText mMessageEditText;

    private TextView test;
    private RecyclerView mMessageRecycler;
    private MessageListAdapter mMessageAdapter;
    List messageList = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot);
        mSendButton = (Button) findViewById(R.id.button_chatbox_send);
        mMessageEditText = findViewById(R.id.edittext_chatbox);

        //mMessageRecycler = (RecyclerView) findViewById(R.id.reyclerview_message_list);
//        mMessageAdapter = new MessageListAdapter(this, messageList);
//        mMessageRecycler.setLayoutManager(new LinearLayoutManager(this));
//        mSendButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }
}
