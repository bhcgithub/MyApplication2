package com.example.kotlin.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when (v?.id) {
            R.id.button -> toasts("第一个按钮1")
            R.id.button2 -> toasts(getout("按钮2"))
            R.id.button3 -> varargs("我", "是", "第", "3", "个", "按钮3")
            R.id.button4 -> ts.text=ss
            R.id.button5 -> ts.text=s
        }
    }

    /**
     * 定义常量与常量
     */

    //var 标识符：类型=初始化值    可变变量定义：var 关键字
    //val 标识符：类型=初始化值    不可变变量定义：val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)

    val number: Int = 1//常量
    val b = 2//常量
    var d = 2//变量
    val s: String = "$b+$d"
    val ss:String="${getout("哈哈哈哈哈")}"

    /**
     * null检查机制
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.text = "第二个按钮"
        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
    }

    fun getout(name: String): String {
        return "第二个$name"
    }

    /**
     * 函数定义
     */
    //fun 函数定义使用的关键字参数格式为：参数 : 类型
    fun toasts(name: String): Unit {//  :Unit无返回值可忽略不写
        Toast.makeText(this, "点击了$name", Toast.LENGTH_SHORT).show()
    }

    //表达式作为函数体，返回类型自动推断：
    fun sun(num1: Int, num2: Int) = num1 + num2

    // public 方法则必须明确写出返回类型
    public fun sum(a: Int, b: Int): Int = a + b

    /**
     * 可变长参数
     * 函数的变长参数可以用vararg关键字进行标识
     */

    fun varargs(vararg arrs: String) {
        for (a in arrs) {
            toasts(a)
        }
    }


}
