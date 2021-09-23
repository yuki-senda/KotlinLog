package jp.techacademy.yuki.senda.kotlinlog

import android.util.Log

class BigDog: Dog{
    //引数付きコンストラクタ
    constructor(name: String, age: Int, hobby:String):super(name,age,hobby){
    }

    override fun say(){
        super.say()
        Log.d("kotlintest", "大きな犬です。")
    }
}