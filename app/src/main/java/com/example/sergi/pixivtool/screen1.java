package com.example.sergi.pixivtool;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class screen1 extends AppCompatActivity {

    //Vars of the activity
    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText5;
    CheckBox checkBox;
    ClipboardManager Clipboard;
    ClipData Clip;
    String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        //Asociamos variables con su id
        textView = (TextView) this.findViewById(R.id.textView);
        textView2 = (TextView) this.findViewById(R.id.textView2);
        textView3 = (TextView) this.findViewById(R.id.textView3);
        textView4 = (TextView) this.findViewById(R.id.textView4);
        textView5 = (TextView) this.findViewById(R.id.textView5);
        textView6 = (TextView) this.findViewById(R.id.textView6);
        button = (Button) this.findViewById(R.id.button);
        button2 = (Button) this.findViewById(R.id.button2);
        button3 = (Button) this.findViewById(R.id.button3);
        button4 = (Button) this.findViewById(R.id.button4);
        button5 = (Button) this.findViewById(R.id.button5);
        button6 = (Button) this.findViewById(R.id.button6);
        editText = (EditText) this.findViewById(R.id.editText);
        editText2 = (EditText) this.findViewById(R.id.editText2);
        editText3 = (EditText) this.findViewById(R.id.editText3);
        editText5 = (EditText) this.findViewById(R.id.editText5);
        checkBox = (CheckBox) this.findViewById(R.id.checkBox);
        Clipboard = (ClipboardManager) this.getSystemService(CLIPBOARD_SERVICE);

        //Seteo de las funciones de los botones
        //Boton de pegar
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("boton pegar");

                Clip = Clipboard.getPrimaryClip();
                ClipData.Item item = Clip.getItemAt(0);
                editText.setText(item.getText().toString());
            }
        });

        //Boton de separar
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("boton separar");

                //pedimos que ingrese texto si deja la caja vacia
                if (editText.getText().toString().equals("")) {
                    textView5.setText("Por favor inserta texto");
                }
                //en caso de que no haya url valida
                else if (!editText.getText().toString().contains("http")) {
                    textView5.setText("No ingresaste un texto con url, falta https://~");
                }
                //en caso de que no haya url valida
                else if (!editText.getText().toString().contains("www.")) {
                    textView5.setText("No ingresaste un texto con url, falta www.~");
                }
                //en caso de que no tenga el caracter "|"
                else if (!editText.getText().toString().contains("|")) {
                    textView5.setText("Falta caracter \"|\", falta dibujante o titulo");
                } else if (editText.getText().toString().indexOf("|") > editText.getText().toString().indexOf("http")) {
                    textView5.setText("Porfavor ingresa el texto ordenadamente");
                }
                //en caso de que haya ingresado algo correcto
                else {
                    //inicializamos variables utiles
                    String publicacion;
                    String url;
                    int indice;
                    int indice2;
                    int indice3;
                    int indice4;

                    //obtenemos texto que fue escrito en la caja
                    texto = editText.getText().toString();

                    //obtenemos indice del caracter que separa url y publicacion
                    indice = texto.indexOf("http");
                    indice2 = texto.indexOf("|");
                    indice3 = texto.indexOf("www.");
                    indice4 = texto.indexOf("#pixiv");

                    //escribimos publicacion
                    publicacion = "<p><a href = \"" + texto.substring(indice) + "\">" + texto.substring(0, indice2 - 1) + "</a>" + texto.substring(indice2, indice - 1) + "</p>";
                    editText2.setText(publicacion);

                    //escribimos url
                    if (!checkBox.isChecked()) {
                        url = texto.substring(indice);
                        editText3.setText(url);
                    } else {
                        url = texto.substring(indice3);
                        editText3.setText(url);
                    }

                    //escribimos la publicacion virgen
                    editText5.setText( texto.substring(0, indice2 - 1) + texto.substring(indice2, indice - 1));

                    //agregamos url a la base de datos o en caso contrario avisamos que ya existe
                    addIfNotExist(texto.substring(indice3), texto.substring(0, indice2 - 1), texto.substring(indice2 + 2, indice4 - 1), screen1.this, textView5, textView6, textView);
                }
            }
        });

        //Boton de copiar publicacion
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("boton copiar publicacion");

                //copiamos el texto del cuadro a la variable
                texto = editText2.getText().toString();

                //Lo copiamos a un Clip para luego copiarlo al Clipboar
                Clip = ClipData.newPlainText("text", texto);
                Clipboard.setPrimaryClip(Clip);

                //avisamos al usuario
                Toast.makeText(screen1.this, "Texto copiado al portapapeles", Toast.LENGTH_SHORT).show();
            }
        });

        //Boton de copiar URL
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("boton copiar url");

                //copiamos el texto del cuadro a la variable
                texto = editText3.getText().toString();

                //Lo copiamos a un Clip para luego copiarlo al Clipboar
                Clip = ClipData.newPlainText("text", texto);
                Clipboard.setPrimaryClip(Clip);

                //avisamos al usuario
                Toast.makeText(screen1.this, "Texto copiado al portapapeles", Toast.LENGTH_SHORT).show();
            }
        });

        //Boton de copiar publicacion virgen
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("boton copiar texto virgen");

                //copiamos el texto del cuadro a la variable
                texto = editText5.getText().toString();

                //Lo copiamos a un Clip para luego copiarlo al Clipboar
                Clip = ClipData.newPlainText("text", texto);
                Clipboard.setPrimaryClip(Clip);

                //avisamos al usuario
                Toast.makeText(screen1.this, "Texto copiado al portapapeles", Toast.LENGTH_SHORT).show();
            }
        });


        //Boton de ir a gestionar base de datos
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("boton cambiar de actividad");

                Intent intent = new Intent(screen1.this,screen2.class);
                startActivity(intent);
            }
        });
    }

    //Metodos auxiliares para las funciones
    //Metodo que agrega elemento a la base de datos usando el manejo de bases de datos de sqlite
    public static void addIfNotExist(String url, String titulo, String artista, Context context, TextView textView5, TextView textView6, TextView textView) {

        System.out.println("annadir si no existe");

        //Abrimos base de datos y buscamos por url
        Database access = new Database(context,Database.DATABASE_NAME,null,Database.DATABASE_VERSION);
        SQLiteDatabase db = access.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + Database.Informacion.tableName + " WHERE " + Database.Informacion.column_URL + "= '" + url + "'", null);

        //Buscamos la url
        boolean existe = false;
        int urlIndex = cursor.getColumnIndex(Database.Informacion.column_URL);
        while (cursor.moveToNext()) {
            String urlBase = cursor.getString(urlIndex);
            if (url.equals(urlBase)) {
                existe = true;
                boolean update = false;

                //Updateamos si ya esta pero le falta informacion tanto para artista como para
                if (cursor.getString(cursor.getColumnIndex(Database.Informacion.column_artist)) == null) {
                    db.execSQL("UPDATE " + Database.Informacion.tableName + " SET " + Database.Informacion.column_artist + " = '" + artista + "' WHERE " + Database.Informacion.column_URL + " = '" + url + "';");
                    update = true;
                }
                if (cursor.getString(cursor.getColumnIndex(Database.Informacion.column_pictureTitle)) == null) {
                    db.execSQL("UPDATE " + Database.Informacion.tableName + " SET " + Database.Informacion.column_pictureTitle + " = '" + titulo + "' WHERE " + Database.Informacion.column_URL + " = '" + url+ "';");
                    update = true;
                }

                //colocamos un mensaje indicando el proceso
                if (update) {
                    textView5.setText("URL ya existe en la base de datos. Fue updateada.");
                    textView.setText("Artista: " + artista);
                    textView6.setText("Titulo: " + titulo);
                } else {
                    textView5.setText("URL ya existe en la base de datos.");
                    textView.setText("Artista: " + artista);
                    textView6.setText("Titulo: " + titulo);
                }
                break;
            }
        }

        //cerramos el cursor
        cursor.close();

        //En caso de no existir agregamos a la base de datos
        if (!existe) {
            System.out.println("no existe");

            //agregamos datos
            db.execSQL("INSERT INTO " + Database.Informacion.tableName + " ( " + Database.Informacion.column_URL + ", " + Database.Informacion.column_artist + ", " + Database.Informacion.column_pictureTitle + " ) VALUES ( '" + url + "', '" + artista + "', '" + titulo + "' ); ");
            textView5.setText("URL agregada a la base de datos");
            textView.setText("Artista: " + artista);
            textView6.setText("Titulo: " + titulo);
        }

    }

}
