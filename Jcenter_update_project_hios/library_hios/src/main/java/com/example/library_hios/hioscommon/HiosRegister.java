package com.example.library_hios.hioscommon;


import com.example.library_hios.hoisjump.HiosAlias;

public class HiosRegister {

    private static final String PKG_SFNATION = "com.example.p022_hois";

    public static void load() {

        HiosAlias.register("jump.twomainactivity", PKG_SFNATION, ".activity.TwoMainActivity");
        HiosAlias.register("jump.webviewmainactivity", PKG_SFNATION, ".activity.WebViewMainActivity");

    }
}
