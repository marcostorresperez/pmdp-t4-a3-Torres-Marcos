package matope.simarro.pmdm_t4a13_marcos_torres.pojo;

public class Cancion {
    private String titulo;
    private String duración;
    private String posicion;

    public Cancion(String titulo, String duración, String posicion) {
        this.titulo = titulo;
        this.duración = duración;
        this.posicion = posicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

}
