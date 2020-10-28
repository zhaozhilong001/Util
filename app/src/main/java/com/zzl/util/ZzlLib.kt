package com.zzl.util

import android.content.Context
import android.widget.Toast

object ZzlLib {

    fun show(context: Context,str:String){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show()
    }

}