package com.example.library_hios.hioscommon;


import com.example.library_hios.hoisjump.HiosAlias;

public class HiosRegister {

    private static final String PKG_SFNATION = "com.example.p022_hois";

    public static void load() {

        //for example
        HiosAlias.register("jump.twomainactivity", PKG_SFNATION, ".activity.DemoTwoMainActivity");
        HiosAlias.register("jump.webviewmainactivity", PKG_SFNATION, ".activity.DemoWebViewMainActivity");

    }
}
