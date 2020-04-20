package com.example.mad_level_1_task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mad_level_1_task2.databinding.ActivityTruthTableBinding

class TruthTableActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTruthTableBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTruthTableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.btnSubmit.setOnClickListener { onSubmitClick() }
    }

    /**
     * submit button is clicked
     */
    private fun onSubmitClick() {
        if(binding.etRow1.text.toString() == "T" && binding.etRow2.text.toString() == "F"
            && binding.etRow3.text.toString() == "F" && binding.etRow4.text.toString() == "F"){
            onCorrect()
        } else {
            onIncorrect()
        }

    }

    /**
     * answer is incorrect
     */
    private fun onIncorrect() {
        Toast.makeText(this, "Incorrect, make sure to answer with T and F only",
            Toast.LENGTH_SHORT).show()
    }

    /**
     * answer is correct
     */
    private fun onCorrect() {
        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
    }
}
