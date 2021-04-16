package com.example.observablefield

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField


/*class UserViewModel() {
    private var user: User = User("Hu")
    var userObservableField: ObservableField<User> = ObservableField<User>()

    init {
        userObservableField.set(user)
    }

    fun getUserName(): String {
        println("名字已经获取")
        return userObservableField.get()!!.name
    }

    fun setUserName(name: String) {
        Log.i("TAG", "setUserName: 名字已经改变:$name")
        userObservableField.get()!!.name = name
        userObservableField.notifyChange()
    }


}*/



/**
 * 这里不需要继承于
 * */
class PersonBean()  {
    val TAG =  "TAG"
var name : ObservableField<String> = ObservableField<String>("")
    //这种方式不会调用到set方法,只用到get方法,所以可以将name和age设置为val
    set(value) {
        Log.i(TAG, "Name的set方法")
       field = value
    }
    get() {
        Log.i(TAG, "Name的get方法")
        return field
    }
var age : ObservableField<String> = ObservableField<String>("0")
    //这种方式不会调用到set方法,只用到get方法,所以可以将name和age设置为val
    set(value) {
        Log.i(TAG, "Age的set方法")
        field = value
    }
    get() {
        Log.i(TAG, "Age的get方法 ")
        return field
    }

}



