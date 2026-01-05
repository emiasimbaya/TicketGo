public class Concierto {
    private int idConcierto;
    private String fechaHora;
    private Artista artista;
    private EstadoConcierto estadoConcierto;
    private Sede sede;

    /**Metodos propios de Java*/

    public int getIdConcierto() {
        return idConcierto;
    }

    public void setIdConcierto(int idConcierto) {
        this.idConcierto = idConcierto;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }
}
