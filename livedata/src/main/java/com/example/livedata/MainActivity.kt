package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.livedata.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding
    //通过viewModels()创建ViewModel要activity-ktx库
    // 在gradle中添加:implementation "androidx.activity:activity-ktx:1.2.0"
    //在fragment中使用添加:implementation "androidx.fragment:fragment-ktx:1.3.0"
    //
    val testViewModel: TestViewModel by viewModels()
    var current = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        dataBinding.st = testViewModel.data.value
        dataBinding.bt.setOnClickListener {
            testViewModel.data.value = (++current).toString()
        }
        testViewModel.data.observe(this, Observer<String> { t ->
            Log.i("TAG", "onChanged: 数据改变了$t")
            dataBinding.st = t
        })

    }
}