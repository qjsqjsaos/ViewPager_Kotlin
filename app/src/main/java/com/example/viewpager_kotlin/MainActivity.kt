package com.example.viewpager_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager_idol : ViewPager2 = findViewById(R.id.viewPager_idol)

        viewPager_idol.adapter = ViewPagerAdapter(getIdolList()) // 어댑터 생성
        viewPager_idol.orientation = ViewPager2.ORIENTATION_HORIZONTAL // 방향을 가로로
    }

    // 뷰 페이저에 들어갈 아이템
    private fun getIdolList(): ArrayList<Int> {
        return arrayListOf<Int>(R.drawable.idol1, R.drawable.idol2, R.drawable.idol3)
    }
}