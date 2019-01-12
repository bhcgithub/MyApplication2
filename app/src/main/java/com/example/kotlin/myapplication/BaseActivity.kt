package com.example.kotlin.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import com.bugtags.library.Bugtags

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        //注：回调 1
        Bugtags.onResume(this)
    }

    override fun onPause() {
        super.onPause()
        //注：回调 2
        Bugtags.onPause(this)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        //注：回调 3
        Bugtags.onDispatchTouchEvent(this, ev)
        return super.dispatchTouchEvent(ev)
    }
}