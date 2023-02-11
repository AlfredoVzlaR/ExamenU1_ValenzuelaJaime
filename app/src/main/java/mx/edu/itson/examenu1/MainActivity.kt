package mx.edu.itson.examenu1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnC: Button = findViewById(R.id.btnGC)
        val btnF: Button = findViewById(R.id.btnGF)
        val btnK: Button = findViewById(R.id.btnGK)
        val btnReset: Button = findViewById(R.id.btnReset)

        val etC: EditText = findViewById(R.id.etC)
        val etF: EditText = findViewById(R.id.etF)
        val etK: EditText = findViewById(R.id.etK)

        btnF.setOnClickListener{
            if(!etC.text.isEmpty()&&!etK.text.isEmpty()){
                etF.setText("Solo se puede convertir un tipo de grado.")
            }else if(!etC.text.isEmpty()){
                gradosCTOF()
            }else if(!etK.text.isEmpty()){
                gradosKTOF()
            }else {
                etF.setText("No hay ° que convertir")
            }
        }
        btnK.setOnClickListener {
            if(!etC.text.isEmpty()&&!etF.text.isEmpty()){
                etK.setText("Solo se puede convertir un tipo de grado.")
            }else if(!etC.text.isEmpty()){
                gradosCTOK()
            }else if(!etF.text.isEmpty()){
                gradosFTOK()
            }else{
                etK.setText("No hay ° que convertir")
            }
        }
        btnC.setOnClickListener {
            if(!etF.text.isEmpty()&&!etK.text.isEmpty()){
                etC.setText("Solo se puede convertir un tipo de grado.")
            }else if(!etF.text.isEmpty()){
                gradosFTOC()
            }else if(!etK.text.isEmpty()){
                gradosKTOC()
            }else{
                etC.setText("No hay ° que convertir")
            }
        }
        btnReset.setOnClickListener {
            etF.setText("")
            etC.setText("")
            etK.setText("")
        }

    }

    fun gradosCTOF(){
        try {
            val etC: EditText = findViewById(R.id.etC)
            val etF: EditText = findViewById(R.id.etF)

            var gC = etC.text.toString().toDouble()

            var K: Double = gC + 273.15
            var F: Double = ((9 * (K - 273.15)) / 5) + 32

            etF.setText(F.toString())

        }catch(e:java.lang.Exception){}
    }
    fun gradosCTOK(){
        try {
            val etC: EditText = findViewById(R.id.etC)
            val etK: EditText = findViewById(R.id.etK)

            var gC = etC.text.toString().toDouble()

            var K: Double = gC + 273.15

            etK.setText(K.toString())

        }catch(e:java.lang.Exception){}
    }
    fun gradosKTOF(){
        try {
            val etC: EditText = findViewById(R.id.etC)
            val etF: EditText = findViewById(R.id.etF)
            val etK: EditText = findViewById(R.id.etK)

            var gK = etK.text.toString().toDouble()

            var F: Double = ((9 * (gK - 273.15)) / 5) + 32

            etF.setText(F.toString())

        }catch(e:java.lang.Exception){}
    }
    fun gradosKTOC(){
        try {
            val etC: EditText = findViewById(R.id.etC)
            val etF: EditText = findViewById(R.id.etF)
            val etK: EditText = findViewById(R.id.etK)

            var gK = etK.text.toString().toDouble()

            var C: Double = gK-273.15

            etC.setText(C.toString())

        }catch(e:java.lang.Exception){}
    }
    fun gradosFTOC(){
        try {
            val etC: EditText = findViewById(R.id.etC)
            val etF: EditText = findViewById(R.id.etF)
            val etK: EditText = findViewById(R.id.etK)

            var gF = etF.text.toString().toDouble()

            var K: Double = ((5*(gF-32))/9)+273.15
            var C: Double = K-273.15

            etC.setText(C.toString())

        }catch(e:java.lang.Exception){}
    }
    fun gradosFTOK(){
        try {
            val etC: EditText = findViewById(R.id.etC)
            val etF: EditText = findViewById(R.id.etF)
            val etK: EditText = findViewById(R.id.etK)

            var gF = etF.text.toString().toDouble()

            var K: Double = ((5*(gF-32))/9)+273.15

            etK.setText(K.toString())

        }catch(e:java.lang.Exception){}
    }

}