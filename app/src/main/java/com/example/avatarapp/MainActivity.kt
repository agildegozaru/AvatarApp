package com.example.avatarapp

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var ivBrow: ImageView
    private lateinit var ivEye: ImageView
    private lateinit var ivNose: ImageView
    private lateinit var ivMouth: ImageView

    private lateinit var cbBrow: CheckBox
    private lateinit var cbEye: CheckBox
    private lateinit var cbNose: CheckBox
    private lateinit var cbMouth: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi ImageView
        ivBrow = findViewById(R.id.ivBrow)
        ivEye = findViewById(R.id.ivEye)
        ivNose = findViewById(R.id.ivNose)
        ivMouth = findViewById(R.id.ivMouth)

        // Inisialisasi CheckBox
        cbBrow = findViewById(R.id.cbBrow)
        cbEye = findViewById(R.id.cbEye)
        cbNose = findViewById(R.id.cbNose)
        cbMouth = findViewById(R.id.cbMouth)

        // Set listener untuk setiap checkbox
        cbBrow.setOnCheckedChangeListener { _, isChecked ->
            ivBrow.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbEye.setOnCheckedChangeListener { _, isChecked ->
            ivEye.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbNose.setOnCheckedChangeListener { _, isChecked ->
            ivNose.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbMouth.setOnCheckedChangeListener { _, isChecked ->
            ivMouth.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }
    }
}