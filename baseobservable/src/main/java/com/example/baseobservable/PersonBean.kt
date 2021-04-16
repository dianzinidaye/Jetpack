package com.example.baseobservable

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable


class PersonBean() : BaseObservable() {
    //@Bindable的作用是生成一个Int的ID,这个ID在局部刷新notifyPropertyChanged(int fieldId)中使用
    @Bindable
    var name: String = ""
        set(value) {
            println("调用了setName")
            //局部刷新,测试是否会刷新Age,事实证明不会
           // age = "局部刷新"  //这里必须注释掉,因为在setAge中设置了name = "全部刷新",这样会进入死循环
            field = value
            notifyPropertyChanged(BR.name)
        }
        get() {
            println("Name的get方法")
            return field
        }


    var age: String = "1"
        set(value) {
            println("调用了setAge")
            //全部刷新,测试是否连name也一起刷新
            name = "全部刷新"
            field = value
            notifyChange()
        }
    get() {
        println("Age的get方法")
        return field
    }


}



