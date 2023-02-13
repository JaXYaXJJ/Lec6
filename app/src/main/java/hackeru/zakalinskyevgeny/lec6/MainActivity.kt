package hackeru.zakalinskyevgeny.lec6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import hackeru.zakalinskyevgeny.lec6.databinding.ActivityMainBinding

//class MainActivity extends AppCompatActivity{}
class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //selecting the design file
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btnActivityTst.setOnClickListener {
            onClickGoTst(bindingClass.btnActivityTst)
        }

        val p1 = Person("Dave", "Green")
        //same as getFirstName()
        println(p1.firstName)

        //same as p1.setLastName("Cohen")        p1.lastName = "Cohen"
    }

    fun onClickGoTst(view: View) {
        val intent = Intent(this, TstActivity::class.java)
        startActivity(intent)
    }

    //method
    fun efg(){}

}
//function in Java
//void abc(String x){}

//function in Kotlin
fun abc(x: String){}