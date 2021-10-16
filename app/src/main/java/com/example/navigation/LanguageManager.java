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

    public void updateResource(String language){
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Resources resources = ct.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
