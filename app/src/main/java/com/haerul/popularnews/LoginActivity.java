package com.haerul.popularnews;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.haerul.popularnews.database.DbAccessObj;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName() ;
    public static final String MYPREFS = "myprefs";
    public static final String NAMEKEY = "namekey";
    public static final String PWDKEY = "pwdkey";
    CheckBox remember;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    //private SharedPreferences loginPreferences;
    //private SharedPreferences.Editor loginPrefsEditor;
    DbAccessObj dbAccessObj;
    EditText nameEditText,pwdEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Log.i(TAG,"onCreate");
        nameEditText =  findViewById(R.id.editTextName);
        pwdEditText = findViewById(R.id.editTextPwd);
        remember = findViewById(R.id.checkbox);
        dbAccessObj = new DbAccessObj(this);
        dbAccessObj.openDb();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    /* if(remember.isChecked())
       {
           restoreData();
      }*/
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onpause");
        if(remember.isChecked()) {
            int i = 1;
        }
        else{
            restoreData();
        }
    }
    /**
     * this method will save data from edittexts into a sharedprefs
     */
    
}

