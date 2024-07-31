import java.util.Date;

public class Estudiante extends Persona {
    private Date fecha_N;
    private String estado;

    public Estudiante(int id, String nombre, String apellido, Date fecha_N, String estado) {
        super(id, nombre, apellido);
        this.fecha_N = fecha_N;
        this.estado = estado;
    }

    public Date getfecha_N() {
        return fecha_N;
    }

    public void setfecha_N(Date fecha_N) {
        this.fecha_N = fecha_N;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante:" + "id=" + getId() + ", nombre=" + getNombre() + ", apellido=" + getApellido()  + ", fecha_N=" + fecha_N + ", estado=" + estado  ;

    }
}