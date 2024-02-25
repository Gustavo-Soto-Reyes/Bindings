package com.example.binding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ButtonClickHandler {
    Context context;

    public ButtonClickHandler(Context context) {
        this.context = context;
    }

    public void onClickHandle(View view){
        Toast.makeText(context, "Button Clicked", Toast.LENGTH_LONG).show();
    }
}
