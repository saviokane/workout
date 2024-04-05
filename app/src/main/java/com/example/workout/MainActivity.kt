package com.example.workout

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var timeSelected : Int = 0
    private var timeCountDownTimer: CountDownTimer? = null
    private var timeProgress = 0
    private var pauseOffSet: Long = 0
    private var isStart = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addBtn: ImageButton = findViewById(R.id.btnAdd)
        addBtn.setOnClickListener{
            /// TODO ,,,,,,.....
        }
    }


    private fun setTimeFuncion()
    {
        val timeDialog = Dialog(this)
        timeDialog.setContentView(R.layout.add_dialog)
        val timeSet = timeDialog.findViewById<EditText>(R.id.EditTextGetTime)
        val timeLeftTv: TextView = findViewById(R.id.tvTimerLeft)
        val btnStart: Button = findViewById(R.id.ib_btnPlayPause)
        val progressBar = findViewById<ProgressBar>(R.id.pbTimer)
        timeDialog.findViewById<Button>(R.id.btnOk).setOnClickListener{
            if (timeSet.text.isEmpty())
            {
                Toast.makeText(this,"Coloque tempo duração",Toast.LENGTH_SHORT).show()
            }
            else
            {
                timeLeftTv.text = timeSet.text
                btnStart.text = "Começar"
                timeSelected = timeSet.text.toString().toInt()

                progressBar.max = timeSelected
            }
        }

    }

}