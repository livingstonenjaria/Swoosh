package com.codestructgroup.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.codestructgroup.swoosh.databinding.ActivityLeagueBinding
import com.codestructgroup.swoosh.model.Player
import com.codestructgroup.swoosh.utilities.EXTRA_PLAYER

class LeagueActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLeagueBinding
    var player = Player("", "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        val view = binding.root
        binding.leagueNextBtn.setOnClickListener {
            if (player.league != ""){
                val skillIntent = Intent(this, SkillActivity::class.java)
                skillIntent.putExtra(EXTRA_PLAYER, player)
                startActivity(skillIntent)
            }else{
                Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
            }
        }
        binding.mensLeagueBtn.setOnClickListener {
            player.league = "mens"
            binding.womensLeagueBtn.isChecked = false
            binding.coedLeagueBtn.isChecked = false
        }
        binding.womensLeagueBtn.setOnClickListener {
            player.league = "women"
            binding.mensLeagueBtn.isChecked = false
            binding.coedLeagueBtn.isChecked = false
        }
        binding.coedLeagueBtn.setOnClickListener {
            player.league = "co-ed"
            binding.mensLeagueBtn.isChecked = false
            binding.womensLeagueBtn.isChecked = false
        }
        setContentView(view)
    }
}