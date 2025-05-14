package com.maderacubicacion.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.maderacubicacion.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Acción del botón
        binding.btnAgregarCamion.setOnClickListener {
            val intent = Intent(this, AgregarCamionActivity::class.java)
            startActivity(intent)
        }
    }
}
