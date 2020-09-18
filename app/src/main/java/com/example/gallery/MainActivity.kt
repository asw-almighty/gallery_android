package com.example.gallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**버튼을 클릭했을 때*/
        name1.setOnClickListener {
            /**텍스트가 보인다.*/
            Toast.makeText(this, "버튼을 눌렀습니다.", Toast.LENGTH_LONG).show()

            /** this Activity에서 PhotoActivity로 간다는 의미*/
            val intent = Intent(this, PhotoActivity::class.java)
            startActivity(intent)
        }
    }
}