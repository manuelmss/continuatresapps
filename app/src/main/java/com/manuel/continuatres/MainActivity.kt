package com.manuel.continuatres

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.manuel.continuatres.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtHello.text="Bienvenido!!"

        binding.fabAddNote.setOnClickListener{
            val intent= Intent(this, AddNoteActivity::class.java)
            startActivity(intent)
        }

        val navHostFragment=supportFragmentManager.findFragmentById(R.id.fcv_note) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bnvMenu.setupWithNavController(navController)


    }
}