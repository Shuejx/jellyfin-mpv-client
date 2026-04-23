package com.custom.jellyfinmpv
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import is.xyz.mpv.MPVLib
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MPVLib.create(this)
        MPVLib.init()
    }
    override fun onDestroy() {
        super.onDestroy()
        MPVLib.destroy()
    }
}