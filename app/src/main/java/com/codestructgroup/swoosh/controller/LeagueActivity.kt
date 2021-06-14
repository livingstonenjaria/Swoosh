package com.codestructgroup.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.codestructgroup.swoosh.EXTRA_LEAGUE
import com.codestructgroup.swoosh.databinding.ActivityLeagueBinding

class LeagueActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLeagueBinding
    private var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        val view = binding.root
        binding.leagueNextBtn.setOnClickListener {
            if (selectedLeague != ""){
                val skillIntent = Intent(this, SkillActivity::class.java)
                skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
                startActivity(skillIntent)
            }else{
                Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
            }
        }
        binding.mensLeagueBtn.setOnClickListener {
            selectedLeague = "mens"
            binding.womensLeagueBtn.isChecked = false
            binding.coedLeagueBtn.isChecked = false
        }
        binding.womensLeagueBtn.setOnClickListener {
            selectedLeague = "women"
            binding.mensLeagueBtn.isChecked = false
            binding.coedLeagueBtn.isChecked = false
        }
        binding.coedLeagueBtn.setOnClickListener {
            selectedLeague = "co-ed"
            binding.mensLeagueBtn.isChecked = false
            binding.womensLeagueBtn.isChecked = false
        }
        setContentView(view)
    }
}