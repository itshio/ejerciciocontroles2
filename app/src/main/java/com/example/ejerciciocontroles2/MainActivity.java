package com.example.ejerciciocontroles2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spTest;
    RadioGroup srRespuesta;
    CheckBox cbRepetida;
    Button btnaceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificacion de vistas

        spTest = (Spinner)findViewById(R.id.sp_principal);
        srRespuesta= (RadioGroup)findViewById(R.id.rgroup_respuestas);
        cbRepetida= (CheckBox)findViewById(R.id.cbox_principal);
        btnaceptar= (Button)findViewById(R.id.btn_aceptar);


        //Rellenar Spinner

        String[] tipos={"Selecciona","Seguridad","Velocidad","Mecanica","Vial"};

        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,tipos);

        spTest.setAdapter(adaptador);








    }//Fin OnCreate

    public void clickvertipo (View view){

        //Recoger el Item seleccionado de un Spinner

        String tiposeleccionado = spTest.getSelectedItem().toString();

        /*Validacion: Si el tipo seleccionado es igual a "Selecciona" avisaremos
        al usuario de que tiene que seleccionar algun tipo, sino lo mostraremos en un toast*/

        if(tiposeleccionado.equals("Selecciona")){
            Toast.makeText(this,"Debes selccionar un tipo test",Toast.LENGTH_LONG).show();
        }else{
            /*Toast.makeText(this,"Test seleccionado: "+tiposeleccionado,Toast.LENGTH_LONG).show()*/;
            btnaceptar.setEnabled(true);
        }

    }

    public void clickaceptar (View view){


    }

}//No Borrar
