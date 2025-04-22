import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import android.widget.ToggleButton
import com.pertemuan.modul1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //button view
        val btnOpen = findViewById<View>(R.id.btnOpen) as Button
        btnOpen.setOnClickListener { DisplayToast("You have click the Open  button") }
        val btnSave = findViewById<View>(R.id.btnSave) as Button
        btnSave.setOnClickListener { DisplayToast("You have click the Save  Button") }
        val checkBox = findViewById<View>(R.id.chkAutoSave) as CheckBox
        checkBox.setOnClickListener { v ->
            if ((v as CheckBox).isChecked) DisplayToast("Chekbox is checked")  else DisplayToast(
                "Checkbox is unchecked"
            )
        }
        val radioGroup = findViewById<View>(R.id.rdGp1) as RadioGroup
        radioGroup.setOnCheckedChangeListener { group, checkedId ->  val rb1 = findViewById<View>(R.id.rdb1) as RadioButton
            if (rb1.isChecked) {
            DisplayToast("Option 1 is checked")
        } else {
            DisplayToast("Option 2 is checked")
        }
        }
        val toggleButton = findViewById<View>(R.id.toggle1) as ToggleButton
        toggleButton.setOnClickListener { v ->
            if ((v as ToggleButton).isChecked) DisplayToast("Toggle button is  On")
            else DisplayToast(
                "Toggle button is Off"
            )
        }
    }
    private fun DisplayToast(msg: String) {
        Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()  }
}
