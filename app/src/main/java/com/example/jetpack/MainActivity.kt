package com.example.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.example.jetpack.databinding.ActivityMainBinding
import com.example.jetpack.listener.EditTextListener
import com.example.jetpack.model.User
import com.example.jetpack.viewmodel.DataBean
import com.example.jetpack.viewmodel.PersonBean
import com.example.jetpack.viewmodel.UserViewModel


class MainActivity : AppCompatActivity() {


    private var dataBingding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        println("开始")
        dataBingding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
       dataBingding!!.model = UserViewModel()
        /*   dataBingding!!.data = DataBean(ObservableField("HU"))*/
        //dataBingding!!.person = PersonBean()
        //dataBingding!!.editText.addTextChangedListener(object :EditTextListener(dataBingding!!.textView){})
    }
}