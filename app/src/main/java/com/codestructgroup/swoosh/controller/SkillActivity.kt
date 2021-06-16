package com.codestructgroup.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.codestructgroup.swoosh.databinding.ActivitySkillBinding
import com.codestructgroup.swoosh.model.Player
import com.codestructgroup.swoosh.utilities.EXTRA_PLAYER

class SkillActivity : BaseActivity() {
    private lateinit var binding: ActivitySkillBinding
    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!
        binding.beginnerSkillBtn.setOnClickListener {
            binding.ballerSkillBtn.isChecked = false
            player.skill = "beginner"
        }
        binding.ballerSkillBtn.setOnClickListener {
            binding.beginnerSkillBtn.isChecked = false
            player.skill = "baller"
        }
        binding.finishSkillBtn.setOnClickListener {
            if (player.skill != ""){
                val finishIntent = Intent(this, FinishActivity::class.java)
                finishIntent.putExtra(EXTRA_PLAYER, player)
                startActivity(finishIntent)
            }else{
                Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
            }

        }
        setContentView(binding.root)
    }
}