package com.codestructgroup.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codestructgroup.swoosh.EXTRA_LEAGUE
import com.codestructgroup.swoosh.EXTRA_SKILL
import com.codestructgroup.swoosh.R
import com.codestructgroup.swoosh.databinding.ActivityFinishBinding

class FinishActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)
        binding.searchLeaguesText.text = getString(R.string.search_text, league, skill)
        setContentView(binding.root)
    }
}