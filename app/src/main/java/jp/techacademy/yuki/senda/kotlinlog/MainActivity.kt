package jp.techacademy.yuki.senda.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest","ログへの出力テスト")

        //整数型の変数をnumという名前で作成して、10を代入する。
        var num = 10
        Log.d("kotlintest", Integer.toString(num))

        //numに50を代入する。
        //変数や定数に、.toString()と記述する方法もある。
        num = 50
        Log.d("kotlintest", num.toString())

        var num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest" ,"10 + 5 - 2 * 4 / 2 = " + num1)

        var flag1 = true
        var flag2 = false
        Log.d("kotlintest" , "flag1 && flag2 = " + (flag1 && flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))

        num = 60
        if(num >= 90){
            Log.d("kotlintest","優")
        }else if(num >= 75){
            Log.d("kotlintest", "良")
        }else if(num >= 60){
            Log.d("kotlintest", "可")
        }else{
            Log.d("kotlintest","不可")
        }

        val drink = 1
        when(drink){
            0 -> {
                Log.d ("kotlintest", "コーヒーを注文しました。")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました。")
            2 -> Log.d("kotlintest", "ミルクを注文しました。")
            else -> Log.d("kotlintest", "オーダーミスです。")
        }

        val message = when(drink){
            0 -> "コーヒーを注文しました。"
            1 -> "紅茶を注文しました。"
            2 -> "ミルクを注文しました。"
            else -> "オーダーミスです。"
        }

        for (i in 1.until(6)){
            Log.d("kotlintest","for文の" + i + "回目")
        }

        num = 1
        while(num < 6){
            Log.d("kotlintest", "while文の" + num + "回目")
            num++
        }

        for (i in 1 .. 3){
            Log.d("kotlintest","..演算子の" + i + "回目")
        }

        for (i in 6 downTo 0 step 2) {
            Log.d("kotlintest","for文の" + i + "回目")
        }

        val point = arrayOf(10, 6, 15, 23, 17)
        for(i in point){
            Log.d("kotlintest", i.toString())
        }
        for(i in point.indices){
            Log.d("kotlintest", point[i].toString())
        }

        val numA = 100
        val numB = 0
        var ans = 0

        Log.d("kotlintest", "ans = " + ans.toString())

        try{
            ans = numA / numB
        }catch(e:Exception){
            Log.d("kotlintest", "0で割ろうとしました。")
            Log.d("kotlintest",e.message.toString())
        }finally {
            Log.d("kotlintest","ans=" + ans.toString())
        }

//        total(50, 1000)
//        total(1, 1111)

        val t = total(10, 100)
        Log.d("kotlintest", t.toString())

        val lmb = {x: Int, y:Int -> x + y}
        val z = lmb(100, 200)
        //val z = {x: Int, y:Int -> x + y}(100,200)

        val anf = fun(x:Int, y:Int):Int{return x + y}
        val q = anf(100,200)
        //val q = fun(x:Int, y:Int):Int{return x + y}(100,200)

        val dog = Dog("ポチ", 3, "")
        dog.say()
        dog.move()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest","犬の年齢は" + dog.age + "歳です。")

        val dog2 = Dog("ハチ", 10, "")
        dog2.say()
        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
        Log.d("kotlintest","犬の年齢は" + dog2.age + "歳です。")

        val bigDog = BigDog("ヨーゼフ", 15, "")
        bigDog.say()
        Log.d("kotlintest","犬の名前は" + bigDog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigDog.age + "歳です。")

        val human1 = Human("佐藤二郎",20,"漫画")
        human1.say()
        human1.think()

        val human2 = Human("山田太郎", 35, "映画鑑賞")
        human2.say()
        human2.think()

        val str1 = "Hello"
        val str2 = "World"
        val str3 = "Hello"

        if (str1.equals(str2)){
            Log.d("kotlintest", "str1とstr2は一緒です。")
        }else {
            Log.d("kotlintest", "str1とstr2は異なります。")
        }

        if (str1.equals(str3)){
            Log.d("kotlintest", "str1とstr3は一緒です。")
        }else {
            Log.d("kotlintest", "str1とstr3は異なります。")
        }

        val i = 100
        val str4 = i.toString() + " * 100 = ${i * 100}"
        Log.d("kotlintest", str4)

        var str5:String? = null
        Log.d("kotlintest", str5.toString())

        val str6: String? = "kotlin"
//        Log.d("kotlintest", str6.length.toString())

        if (str6 != null){
            Log.d("kotlintest", str6.length.toString())
        }

        var str7: String? = null
        if(str7?.length == null){
            Log.d("kotlintest", "str7?.lengthの結果はnull")
        } else {
            Log.d("kotlintest", "str7?.lengthの結果は" + str7.length)
        }

        var str8: String? = "kotlin"
        Log.d("kotlintest", "str.lengthの結果は" + str8!!.length)

        val items = arrayListOf<String?>("こんにちは！", "Hello", "こんばんわ", "Good Evening")
        for(item in items) {
            item?.let {
                Log.d("kotlintest", "キラメキさん、${item}")
            }
        }
    }

    private fun total(first: Int, last: Int = 1000) : Int{
        var sum = 0
        for (i in first..last) {
            sum += i
        }
        return sum
    }
}