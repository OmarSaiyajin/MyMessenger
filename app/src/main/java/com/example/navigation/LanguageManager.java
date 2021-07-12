package com.example.navigation;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;

import java.util.Locale;

public class LanguageManager {

    private Context ct;

    public LanguageManager(Context ct) {
        this.ct = ct;
    }

    public void updateResource(String code){
        Locale locale = new Locale(code);
        Locale.setDefault(locale);
        Resources resources = ct.getResources();
        Configuration configuration = resources.getConfiguration();
        if(Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(locale);
        }else {
            configuration.locale = locale;
        }
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}