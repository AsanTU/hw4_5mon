package com.example.hw4_5mon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.hw4_5mon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        counterOperations()
    }

    private fun counterOperations() {
        viewModel.counter.observe(this) { value ->
            binding.resTv.text = value.toString()
        }

        binding.minusBtn.setOnClickListener {
            viewModel.decrement()
        }
        binding.plusBtn.setOnClickListener {
            viewModel.increment()
        }
    }
}