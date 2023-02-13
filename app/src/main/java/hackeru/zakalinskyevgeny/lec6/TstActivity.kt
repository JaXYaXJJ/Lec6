package hackeru.zakalinskyevgeny.lec6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import hackeru.zakalinskyevgeny.lec6.databinding.ActivityTstBinding

class TstActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityTstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTstBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btnMainActivity.setOnClickListener {
            onClickGoMain(bindingClass.btnMainActivity)
        }
    }

    fun onClickGoMain(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}