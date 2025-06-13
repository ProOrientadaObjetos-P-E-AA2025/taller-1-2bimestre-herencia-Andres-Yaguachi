package ejecutarprestamos;

public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa tipoInstitucion;
    private double valorCarrera;
    private double valormensualPrestamoedu;

    public PrestamoEducativo(String nivelEstudio, double valorCarrera, int tiempoPrestamo, String ciudad, String nombre, String apellido, String username, String nombre1, String siglas) {
        super(tiempoPrestamo, ciudad, nombre, apellido, username);
        this.nivelEstudio = nivelEstudio;
        this.tipoInstitucion = new InstitucionEducativa(nombre1, siglas);
        this.valorCarrera = valorCarrera;

    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public InstitucionEducativa getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(InstitucionEducativa tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public void calcularvalormensualEducativo() {
        this.valormensualPrestamoedu = (double) (valorCarrera / tiempoPrestamo) * 0.90;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrestamoEducativo{");
        sb.append(" \nNivel de Estudio=").append(nivelEstudio);
        sb.append(" \ntipoInstitucion=").append(tipoInstitucion);
        sb.append(" \nvalorCarrera=").append(valorCarrera);
        sb.append(" \nvalormensualPrestamoedu=").append(valormensualPrestamoedu);
        return sb.toString();
    }
}
