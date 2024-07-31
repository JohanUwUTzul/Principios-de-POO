public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private int credito;
    private String version;

    public Curso(int id, String nombre, String descripcion, int credito, String version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.credito = credito;
        this.version = version;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getcredito() {
        return credito;
    }

    public void setcredito(int credito) {
        this.credito = credito;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Curso:" + "id=" + id + ", nombre=" + nombre +  ", descripcion=" + descripcion + ", credito=" + credito +  ", version=" + version ;
    }
}