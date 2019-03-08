package ro.magdamiu.myapplication.module4.complex;

import android.view.View;

public interface ContactClickListener{
     void onClick(View view, int position);
     void onLongClick(View view, int position);
}