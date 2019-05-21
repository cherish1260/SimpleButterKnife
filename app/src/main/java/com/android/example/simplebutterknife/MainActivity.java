package com.android.example.simplebutterknife;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.example.apt_annotation.BindView;

public class MainActivity extends Activity {

    @BindView(R.id.tv_text)
    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvText.setText("hhhhhhhhhhh");
    }
}
