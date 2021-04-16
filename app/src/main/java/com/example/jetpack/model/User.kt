package com.example.jetpack.model

import android.util.Log
import androidx.databinding.ObservableField


/*class User {
    var name: ObservableField<String> = ObservableField("")
    set(value) {
        Log.i("TAG", "user:set ")
        field = value
    }
    get() {
        Log.i("TAG", "user:get ")
        return field
    }
    var age:ObservableField<String> = ObservableField("")
}*/

class User (var name:String,var age:String){

}