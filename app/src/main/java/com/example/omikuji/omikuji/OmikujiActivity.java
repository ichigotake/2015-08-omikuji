package com.example.omikuji.omikuji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OmikujiActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //findViewByIdをsetContentViewの前に実行するとnullが返るので注意する
        setContentView(R.layout.activity_omikuji);
        findViewById(R.id.omikuji).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.omikuji:
                Toast.makeText(this, "クリックイベントの動作確認", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
