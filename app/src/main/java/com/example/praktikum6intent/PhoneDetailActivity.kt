package com.example.praktikum6intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_detail.*

class PhoneDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstaceState: Bundle?) {
        super.onCreate(savedInstaceState)
        setContentView(R.layout.activity_phone_detail)

        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partId = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partId2 = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            tv_item_id.text = partId
            tv_item_id2.text = partId2
        }
    }
}