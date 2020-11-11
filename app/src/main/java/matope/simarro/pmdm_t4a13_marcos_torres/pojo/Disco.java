package matope.simarro.pmdm_t4a13_marcos_torres.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class Disco implements Serializable {
    private String nombre;
    private String anyo;
    private String numCanciones;
    private ArrayList<Cancion> listaCanciones;

    public Disco(String nombre, String anyo, String numCanciones, ArrayList<Cancion> listaCanciones) {
        this.nombre = nombre;
        this.anyo = anyo;
        this.numCanciones = numCanciones;
        this.listaCanciones = listaCanciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    public String getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(String numCanciones) {
        this.numCanciones = numCanciones;
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }
}


