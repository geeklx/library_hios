package com.example.library_hios.activity;

import android.os.Bundle;
import android.text.TextUtils;

import com.example.library_hios.base.WebViewActivity;


public class DemoWebViewMainActivity extends WebViewActivity {

    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String adId = getIntent().getStringExtra("aid");
        if (TextUtils.isEmpty(adId)) {
            finish();
            return;
        }
        if (adId.equals("1")) {
            url = "http://liangxiao.blog.51cto.com/";
        } else {
            url = "https://www.baidu.com/";
        }
//        setup();

        loadUrl(url);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
