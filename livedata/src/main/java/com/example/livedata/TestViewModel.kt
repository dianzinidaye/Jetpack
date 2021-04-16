package com.example.livedata

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/*class PersonBean : ViewModel() {
    init {
        Log.i(TAG, "进入init")
    }

    companion object {
        val TAG = "TAG"
    }

    val person: MutableLiveData<User> by lazy {
        MutableLiveData<User>().apply { value = User() }

    }

    fun setUser(use: User) {
        Log.i(TAG, "setUser: ")
        person.value = use
    }

    fun setName(value: String) {
        Log.i(TAG, "setName: ")
        person.value!!.name = value
        person.value = person.value
    }

    fun getName(): String {
        Log.i(TAG, "getName: ")
        return person.value!!.name
    }

    fun setAge(value: String) {
        Log.i(TAG, "setAge: ")
        person.value!!.age = value
        var user = User(person!!.value!!.name,person!!.value!!.age)
        person.value = user
    }

    fun getAge(): String {
        Log.i(TAG, "getAge: ")
        return person.value!!.age
    }


}*/
class TestViewModel : ViewModel() {
    companion object {
        val TAG = "TAG"
    }

    val data: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}
