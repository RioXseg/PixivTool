package com.example.sergi.pixivtool;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class screen2 extends AppCompatActivity {


    //Vars of the activity
    TextView textView7;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;

    Cursor cursor;

    int state = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        System.out.println("Asociamos los elementos con su id");
        textView7 = (TextView) this.findViewById(R.id.textView7);
        button6 = (Button) this.findViewById(R.id.button6);
        button7 = (Button) this.findViewById(R.id.button7);
        button8 = (Button) this.findViewById(R.id.button8);
        button9 = (Button) this.findViewById(R.id.button9);
        button10 = (Button) this.findViewById(R.id.button10);
        button11 = (Button) this.findViewById(R.id.button11);

        //Funcion de los botones

        //Boton anterior
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("boton anterior");
                if (state == 0) {
                    if (cursor.moveToPrevious()) {
                        String id = cursor.getString(cursor.getColumnIndex(Database.Informacion._ID));
                        String title = cursor.getString(cursor.getColumnIndex(Database.Informacion.column_pictureTitle));
                        String artist = cursor.getString(cursor.getColumnIndex(Database.Informacion.column_artist));
                        String url = cursor.getString(cursor.getColumnIndex(Database.Informacion.column_URL));

                        if (title == null) {
                            title = "Desconocido";
                        }
                        if (artist == null) {
                            artist = "Desconocido";
                        }
                        if (url == null) {
                            url = "Desconocido";
                        }

                        textView7.setText("ID: " + id + "\nTitulo: " + title + "\nArtista: " + artist + "\nURL: " + url);
                    } else {
                        textView7.setText("No hay anterior.");
                    }
                }
                if (state == 1) {
                    if (cursor.moveToPrevious()) {
                        //Obtenemos el artista
                        String artist = cursor.getString(cursor.getColumnIndex(Database.Informacion.column_artist));
                        int cuenta = 0;

                        //Contamos la cantidad de elementos, para ello hay que hacer otra busqueda
                        Database access = new Database(screen2.this, Database.DATABASE_NAME, null, Database.DATABASE_VERSION);
                        SQLiteDatabase db = access.getReadableDatabase();
                        Cursor cursorAux = db.rawQuery("SELECT count(*) FROM " + Database.Informacion.tableName + " WHERE " + Database.Informacion.column_artist + " = '" + artist + "'", null);
                        cursorAux.moveToFirst();
                        cuenta = cursorAux.getInt(0);
                        cursorAux.close();

                        //Escribimos mensaje
                        textView7.setText("Artista: " + artist + "\nCuenta: " + cuenta);
                    } else {
                        textView7.setText("No hay anterior.");
                    }
                }
            }
        });

        //Boton siguiente
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("boton siguiente");
                if (state == 0) {
                    if (cursor.moveToNext()) {
                        String id = cursor.getString(cursor.getColumnIndex(Database.Informacion._ID));
                        String title = cursor.getString(cursor.getColumnIndex(Database.Informacion.column_pictureTitle));
                        String artist = cursor.getString(cursor.getColumnIndex(Database.Informacion.column_artist));
                        String url = cursor.getString(cursor.getColumnIndex(Database.Informacion.column_URL));

                        if (title == null) {
                            title = "Desconocido";
                        }
                        if (artist == null) {
                            artist = "Desconocido";
                        }
                        if (url == null) {
                            url = "Desconocido";
                        }

                        textView7.setText("ID: " + id + "\nTitulo: " + title + "\nArtista: " + artist + "\nURL: " + url);
                    } else {
                        textView7.setText("No hay siguiente.");
                    }
                }
                if (state == 1) {
                    if (cursor.moveToNext()) {
                        //Obtenemos el artista
                        String artist = cursor.getString(cursor.getColumnIndex(Database.Informacion.column_artist));
                        int cuenta = 0;

                        //Contamos la cantidad de elementos, para ello hay que hacer otra busqueda
                        Database access = new Database(screen2.this, Database.DATABASE_NAME, null, Database.DATABASE_VERSION);
                        SQLiteDatabase db = access.getReadableDatabase();
                        Cursor cursorAux = db.rawQuery("SELECT count(*) FROM " + Database.Informacion.tableName + " WHERE " + Database.Informacion.column_artist + " = '" + artist + "'", null);
                        cursorAux.moveToFirst();
                        cuenta = cursorAux.getInt(0);
                        cursorAux.close();

                        //Escribimos mensaje
                        textView7.setText("Artista: " + artist + "\nCuenta: " + cuenta);
                    } else {
                        textView7.setText("No hay siguiente.");
                    }
                }
            }
        });

        //Boton para ver toda la base de datos
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Boton ver toda la base de datos");
                Database access = new Database(screen2.this, Database.DATABASE_NAME, null, Database.DATABASE_VERSION);
                SQLiteDatabase db = access.getReadableDatabase();
                cursor = db.rawQuery("SELECT * FROM " + Database.Informacion.tableName, null);
                state = 0;
                textView7.setText("Vista de toda la base de datos.\nPresiona siguiente para continuar.");
            }
        });

        //Boton para ver artistas y cantidad de obras utilizadas
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Boton ver artista y cantidad de obras");
                Database access = new Database(screen2.this, Database.DATABASE_NAME, null, Database.DATABASE_VERSION);
                SQLiteDatabase db = access.getReadableDatabase();
                cursor = db.rawQuery("SELECT DISTINCT " + Database.Informacion.column_artist + " FROM " + Database.Informacion.tableName + " WHERE " + Database.Informacion.column_artist + " IS NOT NULL", null);
                state = 1;
                textView7.setText("Vista de los artistas y número de obras.\nPresiona siguiente para continuar.");
            }
        });

        //Boton para guardar base de datos en un archivo
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Database access = new Database(screen2.this, Database.DATABASE_NAME, null, Database.DATABASE_VERSION);
                SQLiteDatabase db = access.getReadableDatabase();
                cursor = db.rawQuery("SELECT * FROM " + Database.Informacion.tableName, null);

                //Calculamos el numero de elementos
                Cursor cursorAux = db.rawQuery("SELECT COUNT( " + Database.Informacion._ID + " ) " + " FROM " + Database.Informacion.tableName, null);
                cursorAux.moveToFirst();
                int nElementos = cursorAux.getInt(0);

                //Creamos o abrimos archivo
                File data = new File(screen2.this.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "db.txt");
                String[] texto = new String[nElementos];

                //Obtenemos los datos de la tabla de datos y los almacenamos
                int i = 0;
                while (cursor.moveToNext()) {

                    String titulo = cursor.getString(cursor.getColumnIndex(Database.Informacion.column_pictureTitle));
                    String artista = cursor.getString(cursor.getColumnIndex(Database.Informacion.column_artist));
                    String url = cursor.getString(cursor.getColumnIndex(Database.Informacion.column_URL));

                    if (titulo != null && artista != null && url != null) {
                        texto[i] = url + " " + artista + " " + titulo;
                    } else if (url != null && artista != null) {
                        texto[i] = url + " " + artista + " NoData";
                    } else if (url != null && titulo != null) {
                        texto[i] = url + " NoData " + titulo;
                    } else if (url != null) {
                        texto[i] = url + " NoData NoData";
                    }

                    //pasamos a la siguiente linea
                    i++;
                }

                //guardamos el string en un texto
                Save(data, texto);
            }
        });

        //Boton de archivo a base de datos
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Abrimos el archivo
                File data = new File(screen2.this.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "db.txt");
                String[] texto = Load(data);

                for (int j = 0; j < texto.length; j++) {
                    String[] columnas = texto[j].split(" ");
                    addIfNotExist(columnas[0], columnas[2], columnas[1], screen2.this);
                }
            }
        });
    }

    @Override
    public void onDestroy() {

        System.out.println("Cerramos el cursor principal de la actividad");
        cursor.close();

        super.onDestroy();
    }


    //Funciones para manejar archivos de texto
    public static void Save(File file, String[] data) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            try {
                for (int i = 0; i < data.length; i++) {
                    fos.write(data[i].getBytes());
                    if (i < data.length - 1) {
                        fos.write("\n".getBytes());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String[] Load(File file) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String test;
        int anzahl = 0;
        try {
            while ((test = br.readLine()) != null) {
                anzahl++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fis.getChannel().position(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] array = new String[anzahl];

        String line;
        int i = 0;
        try {
            while ((line = br.readLine()) != null) {
                array[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    //Metodo que agrega elemento a la base de datos usando el manejo de bases de datos de sqlite
    public static void addIfNotExist(String url, String titulo, String artista, Context context) {

        System.out.println("annadir si no existe");

        //Abrimos base de datos y buscamos por url
        Database access = new Database(context, Database.DATABASE_NAME, null, Database.DATABASE_VERSION);
        SQLiteDatabase db = access.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + Database.Informacion.tableName + " WHERE " + Database.Informacion.column_URL + "= '" + url + "'", null);

        //Buscamos la url
        boolean existe = false;
        int urlIndex = cursor.getColumnIndex(Database.Informacion.column_URL);
        while (cursor.moveToNext()) {
            String urlBase = cursor.getString(urlIndex);
            if (url.equals(urlBase)) {
                existe = true;

                //Updateamos si ya esta pero le falta informacion tanto para artista como para titulo
                if (cursor.getString(cursor.getColumnIndex(Database.Informacion.column_artist)) == null && !artista.equals("NoData")) {
                    db.execSQL("UPDATE " + Database.Informacion.tableName + " SET " + Database.Informacion.column_artist + " = '" + artista + "' WHERE " + Database.Informacion.column_URL + " = '" + url + "';");
                }
                if (cursor.getString(cursor.getColumnIndex(Database.Informacion.column_pictureTitle)) == null && !titulo.equals("NoData")) {
                    db.execSQL("UPDATE " + Database.Informacion.tableName + " SET " + Database.Informacion.column_pictureTitle + " = '" + titulo + "' WHERE " + Database.Informacion.column_URL + " = '" + url + "';");
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
            if (url.equals("NoData") && titulo.equals("NoData") && artista.equals("NoData")){
                //DoNothing
            }else if (titulo.equals("NoData") && artista.equals("NoData")){
                db.execSQL("INSERT INTO " + Database.Informacion.tableName + " ( " + Database.Informacion.column_URL + " ) VALUES ( '" + url + "' ); ");
            }else if (titulo.equals("NoData")){
                db.execSQL("INSERT INTO " + Database.Informacion.tableName + " ( " + Database.Informacion.column_URL + ", " + Database.Informacion.column_artist + " ) VALUES ( '" + url + "', '" + artista + "' ); ");
            }else if (artista.equals("NoData")){
                db.execSQL("INSERT INTO " + Database.Informacion.tableName + " ( " + Database.Informacion.column_URL + ", " + Database.Informacion.column_pictureTitle + " ) VALUES ( '" + url + "', '" + titulo + "' ); ");
            }
            else {
                db.execSQL("INSERT INTO " + Database.Informacion.tableName + " ( " + Database.Informacion.column_URL + ", " + Database.Informacion.column_artist + ", " + Database.Informacion.column_pictureTitle + " ) VALUES ( '" + url + "', '" + artista + "', '" + titulo + "' ); ");
            }
        }
    }
}
