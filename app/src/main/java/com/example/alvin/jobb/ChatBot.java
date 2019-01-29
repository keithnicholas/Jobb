package com.example.alvin.jobb;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot);
        Button mSendButton = (Button) findViewById(R.id.button_chatbox_send);
        final EditText editText = findViewById(R.id.edittext_chatbox);
        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatBot.this, Companies.class);
                startActivity(intent);

            }

        });



    }
}
