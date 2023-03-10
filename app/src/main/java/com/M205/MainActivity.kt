package com.M205

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    var age: EditText?=null
    var name: EditText?=null
    var radio1: RadioButton? = null
    var radio2: RadioButton? = null
    var check1: CheckBox?=null
    var check2: CheckBox?=null
    var btnToggle: ToggleButton?=null
    var btnSwitch: Switch?=null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnInit:Button = findViewById(R.id.btn1)
        var btnImg: ImageButton = findViewById(R.id.btnImg)


        age = findViewById(R.id.inputAge)
        name = findViewById(R.id.inputName)
        radio1 = findViewById(R.id.radio1)
        radio2 = findViewById(R.id.radio2)
        check1 = findViewById(R.id.checkBox1)
        check2 = findViewById(R.id.checkBox2)
        btnToggle = findViewById(R.id.btnToggle)
        btnSwitch= findViewById(R.id.btnSwitch)



        btnInit.setOnClickListener { showData() }
        btnImg.setOnClickListener{funImg() }
    }

    private fun  funImg(){
        Toast.makeText(this, "Diste click al Image Button" , Toast.LENGTH_LONG).show()
    }


    private  fun  showData(){
        var cad: String = "Seleccionado: "
        var inputNumber:String = age!!.text.toString()
        var nameUser: String? = name!!.text.toString()



        if (radio1?.isChecked==true){
            cad+="\nradio1 "
        }
        if (radio2?.isChecked==true){
            cad+="\nradio2 "
        }


        if (check1?.isChecked==true){
            cad+="\nSeleccionado:Check 1"
        }
        if (check2?.isChecked==true){
            cad+="\nSeleccionado:Check 2"
        }

        if (btnToggle?.isChecked==true) {
            cad+="\nToggle On"
        }else{
            cad+="\nToggle Off"
        }

        if (btnSwitch?.isChecked==true){
            cad+="\nSwitch on"
        }else{
            cad+="\nSwitch off"
        }

        Toast.makeText(this, "Hola $nameUser\n$inputNumber \n$cad" , Toast.LENGTH_LONG).show()


    }





}