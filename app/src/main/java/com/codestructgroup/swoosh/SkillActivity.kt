package com.codestructgroup.swoosh

import android.os.Bundle
import com.codestructgroup.swoosh.databinding.ActivitySkillBinding

class SkillActivity : BaseActivity() {
    private lateinit var binding: ActivitySkillBinding
    private var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        val view = binding.root
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        setContentView(view)
    }
}