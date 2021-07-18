package com.example.pushnotificationserver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    TextInputLayout title, message;
    Button sendBtn;
    String Title, Message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.title);
        message = findViewById(R.id.message);
        sendBtn = findViewById(R.id.sendBtn);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Title = title.getEditText().getText().toString();
                Message = message.getEditText().getText().toString();
                if(Title.equals("") || Message.equals("")) {
                    Toast.makeText(MainActivity.this, "Please Fill the details!!", Toast.LENGTH_SHORT).show();
                }else {
                    NotificationSender notificationSender = new NotificationSender("/topics/all",Title,Message,
                            getApplicationContext(), MainActivity.this);
                    notificationSender.SendNotifications();
                }
            }
        });
    }
}