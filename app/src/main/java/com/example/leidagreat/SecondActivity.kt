package com.example.leidagreat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val hydro = findViewById<Button>(R.id.hydro)
        hydro.setOnClickListener {
            navigateToHydroActivity()
        }

        val pyro = findViewById<Button>(R.id.pyro)
        pyro.setOnClickListener {
            navigateToPyroActivity()
        }

        val electro = findViewById<Button>(R.id.electro)
        electro.setOnClickListener {
            navigateToElectroActivity()
        }
        val dendro = findViewById<Button>(R.id.dendro)
        dendro.setOnClickListener {
            navigateToDendroActivity()
        }
        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener {
            navigateToMainActivity()
        }
    }


    private fun navigateToHydroActivity() {
        val intent = Intent(this, HydroActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToPyroActivity() {
        val intent = Intent(this, PyroActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToElectroActivity() {
        val intent = Intent(this, ElectroActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToDendroActivity() {
        val intent = Intent(this, DendroActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
