package com.example.kotlin.myapplication

import android.app.Application
import com.bugtags.library.Bugtags
import com.bugtags.library.BugtagsOptions



class MyApp:Application() {
    override fun onCreate() {
        super.onCreate()
        //在这里初始化
        val options = BugtagsOptions.Builder().trackingLocation(true).       //是否获取位置，默认 true
                trackingCrashLog(true).       //是否收集闪退，默认 true
                trackingConsoleLog(true).     //是否收集控制台日志，默认 true
                trackingUserSteps(true).      //是否跟踪用户操作步骤，默认 true
                crashWithScreenshot(true).    //收集闪退是否附带截图，默认 true
                trackingAnr(true).              //收集 ANR，默认 false
                trackingBackgroundCrash(true).  //收集 独立进程 crash，默认 false
                startAsync(false).    //设置 为 true 则 SDK 会在异步线程初始化，节省主线程时间，默认 false
                build()
        Bugtags.start(BuildConfig.appKey, this, if (BuildConfig.IS_DEBUG)Bugtags.BTGInvocationEventNone else Bugtags.BTGInvocationEventBubble,options)
    }
}