package com.example.setwallpaper

import android.app.WallpaperManager
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.setwallpaper.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.white_wallpaper) // 배경 화면으로 설정할 이미지를 Bitmap 타입으로 변경

        val wallpaperManager = WallpaperManager.getInstance(this) // 배경 화면 변경을 위한 인스턴스
        try {
            wallpaperManager.setBitmap(bitmap) // 배경화면 설정
        } catch (e: Exception) {
            Log.e("MainActivity", "setBitmap -> e.message: " + e.message.toString())
        }
    }
}