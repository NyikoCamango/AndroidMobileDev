package com.example.project1;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {
    private static final String PREF_NAME = "UserSession";
    private static final String KEY_TOKEN = "token";
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public SessionManager(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveAuthToken(String token) {
        editor.putString(KEY_TOKEN, token);
        editor.apply();
    }

    public String getAuthToken() {
        return sharedPreferences.getString(KEY_TOKEN, null);
    }

    public void clearAuthToken() {
        editor.remove(KEY_TOKEN);
        editor.apply();
    }

    public boolean isLoggedIn() {
        return getAuthToken() != null;
    }
}
