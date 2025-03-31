package com.rrc.djiControlServer


import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

class MApplication: Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this);
        com.cySdkyc.clx.Helper.install(this);
    }

}