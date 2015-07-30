package com.example.omikuji.omikuji;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class OmikujiActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView omikujiResultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //findViewByIdをsetContentViewの前に実行するとnullが返るので注意する
        setContentView(R.layout.activity_omikuji);
        findViewById(R.id.omikuji).setOnClickListener(this);
        omikujiResultView = (TextView) findViewById(R.id.omikuji_result);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.omikuji:
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        omikuji();
                    }
                }, 3000); // 3秒後におみくじを実行する
                break;
        }
    }

    private void omikuji() {
        Random random = new Random();
        int result = random.nextInt() % 2;
        switch (result) {
            case 1:
                omikujiResultView.setText(R.string.omikuji_result_daikichi);
                break;
            case 0:
            default:
                omikujiResultView.setText(R.string.omikuji_result_kichi);
        }
    }

}
