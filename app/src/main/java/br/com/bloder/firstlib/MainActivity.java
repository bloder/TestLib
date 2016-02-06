package br.com.bloder.firstlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.bloder.messagelib.MessageProvider;

public class MainActivity extends AppCompatActivity {

    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = (TextView) findViewById(R.id.messages);

        message.setText(MessageProvider.fetchMessages().get(0).message);
    }
}
