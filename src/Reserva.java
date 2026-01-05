public class Reserva {
    private int idReserva;
    private Usuario usuario;
    private  Concierto concierto;
    private TipoEntrada tipoEntrada;
    private int cantidad;
    private double total;

    /**Metodos propios de Java*/

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
