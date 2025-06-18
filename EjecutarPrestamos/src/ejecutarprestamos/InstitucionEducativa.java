package ejecutarprestamos;

public class InstitucionEducativa {

    protected String nombre;
    protected String siglas;

    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Institucion Educativa: ").append(nombre);
        sb.append("\nSiglas: ").append(siglas);
        return sb.toString();
    }

}
