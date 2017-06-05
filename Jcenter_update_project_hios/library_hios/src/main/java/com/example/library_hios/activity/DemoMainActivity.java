package com.example.library_hios.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.library_hios.R;
import com.example.library_hios.hioscommon.AdListItem;
import com.example.library_hios.hoisjump.HiosHelper;


public class DemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hios activity跳转
                AdListItem adListItem = new AdListItem();
                adListItem.setAid("1");
                adListItem.setBanner("imgUrl");
//                adListItem.setUrl("hios://jump.twomainactivity");
//                hios://com.haiersmart.sfnation.ui.ec.ShopIndexActivity?act={i}1&sku_id={s}341703311759500256
                adListItem.setUrl("hios://jump.twomainactivity?sku_id={s}1000252");//带参数
                HiosHelper.click(DemoMainActivity.this, DemoTwoMainActivity.class, adListItem);// 第一个是当前Activity 第二个是Fragment
            }
        });

        findViewById(R.id.tv2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hios webview跳转
                AdListItem adListItem = new AdListItem();
                adListItem.setAid("1");
                adListItem.setBanner("imgUrl");
                adListItem.setUrl("");
                HiosHelper.configWebActivity(DemoWebViewMainActivity.class);
                HiosHelper.click(DemoMainActivity.this, adListItem);//
            }
        });


    }
}
