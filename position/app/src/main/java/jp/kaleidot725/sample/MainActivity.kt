package jp.kaleidot725.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        show_button.setOnClickListener {
            MainDialogFragment().show(supportFragmentManager, "MAIN_DIALOG_FRAGMENT")
        }
    }
}
