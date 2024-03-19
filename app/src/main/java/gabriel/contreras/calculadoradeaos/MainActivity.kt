package gabriel.contreras.calculadoradeaos

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //1: Mandar a llamar a todos los elementos

        val FechaNacimiento = findViewById<EditText>(R.id.txtFechaN)


        val txtEdad = findViewById<TextView>(R.id.txtEdad)

        val botonEdad = findViewById<Button>(R.id.btnEdad)



        val objCalcEdad= CalcEdad()

        botonEdad.setOnClickListener {
            val result = objCalcEdad.Rest(FechaNacimiento.text.toString().toInt())


            txtEdad.text= "Tienes: $result Años"
    }
}
}