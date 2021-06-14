package com.codestructgroup.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.codestructgroup.swoosh.EXTRA_LEAGUE
import com.codestructgroup.swoosh.EXTRA_SKILL
import com.codestructgroup.swoosh.databinding.ActivitySkillBinding

class SkillActivity : BaseActivity() {
    private lateinit var binding: ActivitySkillBinding
    private var league = ""
    private var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        binding.beginnerSkillBtn.setOnClickListener {
            binding.ballerSkillBtn.isChecked = false
            skill = "beginner"
        }
        binding.ballerSkillBtn.setOnClickListener {
            binding.beginnerSkillBtn.isChecked = false
            skill = "baller"
        }
        binding.finishSkillBtn.setOnClickListener {
            if (skill != ""){
                val finishIntent = Intent(this, FinishActivity::class.java)
                finishIntent.putExtra(EXTRA_LEAGUE, league)
                finishIntent.putExtra(EXTRA_SKILL, skill)
                startActivity(finishIntent)
            }else{
                Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
            }

        }
        setContentView(binding.root)
    }
}