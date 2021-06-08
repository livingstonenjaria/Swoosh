package com.codestructgroup.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codestructgroup.swoosh.databinding.ActivityLeagueBinding

class LeagueActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLeagueBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        val view = binding.root
        binding.leagueNextBtn.setOnClickListener {
            val skillIntent = Intent(this, SkillActivity::class.java)
            startActivity(skillIntent)
        }
        setContentView(view)
    }
}