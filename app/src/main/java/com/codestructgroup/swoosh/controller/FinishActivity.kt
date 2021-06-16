package com.codestructgroup.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codestructgroup.swoosh.R
import com.codestructgroup.swoosh.databinding.ActivityFinishBinding
import com.codestructgroup.swoosh.model.Player
import com.codestructgroup.swoosh.utilities.EXTRA_PLAYER

class FinishActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        if (player != null) {
            binding.searchLeaguesText.text = getString(R.string.search_text, player.league, player.skill)
        }
        setContentView(binding.root)
    }
}