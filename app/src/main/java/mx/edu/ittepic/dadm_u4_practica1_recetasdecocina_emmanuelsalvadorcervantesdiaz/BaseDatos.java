package mx.edu.ittepic.dadm_u4_practica1_recetasdecocina_emmanuelsalvadorcervantesdiaz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {
    public BaseDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se ejecuta cuando la aplicación se ejecuta en el Celular
        //Sirve para construir en el SQLite que está en el celular las tablas que la app requiere para funcionar
        db.execSQL("CREATE TABLE RECETAS (ID INTEGER NOT NULL PRIMARY KEY, NOMBRE VARCHAR(200), INGREDIENTES VARCHAR(1000), PREPARACION VARCHAR(1000), OBSERVACIONES VARCHAR(500));");
        //funciona para insert, create, table, delete, update
        //db.rawQuery();
        //funciona con el select
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //cuando se modifica la estructura de la tabla

    }
}
