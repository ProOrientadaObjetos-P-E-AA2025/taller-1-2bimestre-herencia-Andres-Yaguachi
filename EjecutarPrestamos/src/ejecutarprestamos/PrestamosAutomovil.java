package ejecutarprestamos;

public class PrestamosAutomovil extends Prestamo {

    protected String tipoAutomovil;
    protected String marcaAutomovil;
    Persona garante;
    protected double valorAutomovil;
    protected double valorMensual;

    public PrestamosAutomovil(String tipoAutomovil, String marcaAutomovil, Persona garante, double valorAutomovil, int tiempoPrestamo, String ciudad, String nombre, String apellido, String username) {
        super(tiempoPrestamo, ciudad, nombre, apellido, username);
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.valorAutomovil = valorAutomovil;
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void calcularValorMensual() {
        this.valorMensual = (double) valorAutomovil / tiempoPrestamo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de Automovil:").append(tipoAutomovil);
        sb.append(" \nMarcaAutomovil: ").append(marcaAutomovil);
        sb.append(" \nValor Automovil: ").append(valorAutomovil);
        sb.append(" \nValorMensual: ").append(valorMensual);
        sb.append(" \nGarante: ").append(garante);
        sb.append("Beneficiario: ").append(beneficiario);
        sb.append(" \nTiempo de Prestamo:").append(tiempoPrestamo);
        sb.append(" \nCiudad: ").append(ciudad);

        return sb.toString();
    }

}
