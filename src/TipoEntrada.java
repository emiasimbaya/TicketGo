public class TipoEntrada {
    private int idTipoEntrada;
    private String nombre;
    private double precio;
    private int cupoTotal;
    private int cupoDisponible;

    /**Metodos propios de Java*/

    public int getIdTipoEntrada() {
        return idTipoEntrada;
    }

    public void setIdTipoEntrada(int idTipoEntrada) {
        this.idTipoEntrada = idTipoEntrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCupoTotal() {
        return cupoTotal;
    }

    public void setCupoTotal(int cupoTotal) {
        this.cupoTotal = cupoTotal;
    }

    public int getCupoDisponible() {
        return cupoDisponible;
    }

    public void setCupoDisponible(int cupoDisponible) {
        this.cupoDisponible = cupoDisponible;
    }
}
