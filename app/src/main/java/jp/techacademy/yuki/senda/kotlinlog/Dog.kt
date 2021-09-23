package jp.techacademy.yuki.senda.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {
    //引数付きコンストラクタ
    constructor(name: String, age: Int, hobby:String):super(name,age,hobby){
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say(){
        Log.d("kotlintest", this.name + "(" + this.age + "歳）" + "「ワンワン」" )
    }

    //Movableインターフェースのメソッドをオーバーライド
    override fun move(){
        Log.d("kotlintest", this.name + "(" + this.age + ")" + "は全力で走った")
    }
}