package com.bunyatov.retirementcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bunyatov.retirementcalculator.databinding.ActivityMainBinding
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCenter.start(application, "6d78db5a-e36e-4b1f-ab63-916972a1d10a", Analytics::class.java, Crashes::class.java)

        binding.calculateButton.setOnClickListener {
            Crashes.generateTestCrash()
        }
    }
}