package com.example.sergi.pixivtool;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by sergi on 11-06-2018.
 */

public final class Database extends SQLiteOpenHelper {

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "PixivInfo.db";

    //CONSTRUCTOR
    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //TABLAS
    //clase interna que define los elementos de una tabla de la base de datos.
    public static class Informacion implements BaseColumns {
        public static final String tableName = "Info";
        public static final String column_artist = "Artista";
        public static final String column_pictureTitle = "Titulo";
        public static final String column_URL = "URL";
    }


    //FUNCIONES DE LA BASE DE DATOS

    //Se llama solo una vez en toda la app y es cuando se crea por primera vez la tabla
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //creamos las tablas al crear la base de datos
        sqLiteDatabase.execSQL("CREATE TABLE " + Informacion.tableName + " (" + Informacion._ID + " INTEGER PRIMARY KEY," + Informacion.column_artist + " TEXT," + Informacion.column_pictureTitle + " TEXT," + Informacion.column_URL + " TEXT)");
        //Agregamos datos de la base de datos antigua
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=22547444&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=51118493&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=57172130&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63969512&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63949923&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63976337&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61661855&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64003016&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=52663883&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63228582&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53453341&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64047362&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61538792&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63981144&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=34553736&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=24756849&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=35658947&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=52037043&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=9015051&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=22275771&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62939224&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=60928867&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50734260&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=57012215&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63405851&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=37149944&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=45062199&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=47139094&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61282633&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=1441901&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53279642&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=49903276&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62114629&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=22856506&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63797914&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=39991002&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=41894972&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53849401&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64328929&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=60466463&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=30515802&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56464073&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=57087112&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59904041&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59954872&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=49540364&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61447232&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55426840&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=41824781&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=57808384&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59296136&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=45205070&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=57886409&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53692129&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=46885739&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=46980318&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=44122113&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=36322800&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=26521811&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=51750031&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59775059&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=57215699&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64572361&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64588804&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64584929&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50392497&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53015879&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59561247&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=57180155&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61524956&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59235482&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=44155301&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62513137&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63133206&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56369307&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=58606396&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64680228&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64688902&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64698005&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64646828&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61738590&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62709879&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=60642401&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50779194&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=35883142&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62084697&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=52561582&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=20259255&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56243091&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=51360755&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56141664&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64066596&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=57409833&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=52010346&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=33288849&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=32173680&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=36149833&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55115441&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=11560879&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=46745178&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=40392827&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=45793589&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59302008&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55021478&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64941522&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=45634561&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=41327549&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=40386584&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=58561807&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64742478&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=47255476&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55404606&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=46455353&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=46073131&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50314387&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63741601&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=58236269&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=54906952&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61645396&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=35806136&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50856157&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64959520&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=36391543&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=43455415&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62564814&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64585758&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63471797&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=39402837&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64974242&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59740832&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53510373&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63568291&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65051146&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=57285446&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55958488&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=54126856&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65034175&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50639674&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=38293356&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50511188&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50552784&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=49803194&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=47287720&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=45966530&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=30632170&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63438440&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=28530063&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=25629044&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=60040479&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=37804345&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=41795746&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62797005&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=39376830&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59339657&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=52818222&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55609455&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56998505&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=45167847&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56761984&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=15206188&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=58028444&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=48423985&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=13876500&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=47180507&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55080312&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64795252&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=52967774&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=42354820&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64738732&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61704867&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=37744388&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56557020&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65684465&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65501991&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65639728&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=45415453&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62658493&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=60800344&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64330431&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=31464518&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56456930&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64901842&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62720166&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=52021332&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=38755515&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62352452&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=24041979&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63568986&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53014029&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65874654&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65874778&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65783126&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65963701&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=31354932&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64572123&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56955861&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=28309560&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61445634&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=31324991&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=58941269&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53942457&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=13390534&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=60123890&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61147544&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=66108648&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=66138887&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55248487&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=39216579&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59441321&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=51500670&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62377478&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=48538430&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=60566421&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55665424&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64786984&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=41092716&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65872539&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=37284595&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53660274&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=60979450&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=66345093&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=47032033&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64895337&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=52889636&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=46653978&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61496075&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61465134&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=39188254&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56000870&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53279702&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=47138290&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=38668133&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=66617489&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=42004990&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=46783413&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=51210041&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=58836990&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59067689&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65188562&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55472238&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61499371&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=66751809&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64900437&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65349105&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61853365&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50823875&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=54071805&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=64805885&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=54367456&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65233561&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56048493&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=35926730&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65247806&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=25766537&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61950458&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56534429&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65037289&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=56414969&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65109018&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=67130155&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=60599198&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65939154&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=38987647&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=46767745&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63703028&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55739768&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53335050&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=62433585&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=57413064&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=66108162&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=59691370&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61204381&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=65045500&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=30924425&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=54969368&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=37259509&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=36677690&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=36709831&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=47261511&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=52649165&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=43633809&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=48265231&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=67733443&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55872831&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=53752998&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=51128104&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=25737920&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=26636196&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50115816&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=37359409&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=39666804&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=35158850&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=28362047&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=51929937&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=52129318&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=55115338&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=52158808&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=37331081&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=12463727&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=57328545&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=37419404&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=46768688&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50621988&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=45651315&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50828426&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=48017410&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=50063112&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=61156598&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=25035589&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=67195544&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=58759098&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=63902299&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=66225927&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=38177640&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=35550027&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=68851768&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=30690196&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=33591865&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=31008158&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=32775179&mode=medium'" + " );");
        sqLiteDatabase.execSQL("INSERT INTO " + Informacion.tableName + " ( " + Informacion.column_URL + " ) " + "VALUES ( " + "'www.pixiv.net/member_illust.php?illust_id=35698853&mode=medium'" + " );");
    }

    //Se llama cuando se cambia la version de la base de datos y mantiene los datos anteriores con la posibilidad de agregar mas datos en futuro
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        //borramos la anterior y creamos una nueva (Puede variar dependiendo de los upgrades)
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Informacion.tableName);
        onCreate(sqLiteDatabase);
    }

}

