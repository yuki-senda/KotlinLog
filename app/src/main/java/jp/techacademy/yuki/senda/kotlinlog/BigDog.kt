package jp.techacademy.yuki.senda.kotlinlog

import android.util.Log

class BigDog: Dog{
    //引数付きコンストラクタ
    constructor(name: String, age: Int):super(name,age)

    override fun say(){
        super.say()
        Log.d("kotlintest", "大きな犬です。")
    }
}