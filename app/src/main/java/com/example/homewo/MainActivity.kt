package com.example.homewo

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
    }

    fun changeText1(view: View) {
        textView.text = "資管2A 411016848 郭家瑋"
    }

    fun changeText2(view: View) {
        textView.text = "打LOL跟遊戲王,平時喜歡在空餘時間看小說"
    }

    fun changeText3(view: View) {
        textView.text = "從小到現在,我在求學期間就和同學有良好的互動關係,擅長和別人溝通\n首先要保持傾聽其次是延後說話最後是溝通技巧, 表達清楚客觀事實，而不是夾雜個人情緒的主觀判斷，然後以謙卑之心、寬容溫和的態度去解決問題,\n對待朋友如對待家人般真心誠意。"
    }
}