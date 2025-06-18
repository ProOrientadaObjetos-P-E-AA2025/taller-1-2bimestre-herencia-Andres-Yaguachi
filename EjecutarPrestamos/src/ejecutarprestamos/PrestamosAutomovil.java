package ejecutarprestamos;

public class PrestamosAutomovil extends Prestamo {

    protected String tipoAutomovil;
    protected String marcaAutomovil;
    protected Persona garante;
    protected double valorAutomovil;
    protected double valorMensual;

    public PrestamosAutomovil(String tipoAutomovil, String marcaAutomovil, Persona garante, double valorAutomovil, int tiempoPrestamo, String ciudad, String nombre, String apellido, String username) {
        super(tiempoPrestamo, ciudad, nombre, apellido, username);
        this.tipoAutomovil = tipoAutomovil;
        this.garante = garante;
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
        sb.append("------------------------------------");
        sb.append("\nDatos de Beneficiario y Garante");
        sb.append("\n------------------------------------");
        sb.append(" \nBeneficiario: ").append(beneficiario);
        sb.append(" \nGarante: ").append(garante);
        sb.append(" \nCiudad: ").append(ciudad);
        sb.append("\n------------------------------------");
        sb.append("\nDatos del vehiculo y prestamo");
        sb.append("\n------------------------------------");
        sb.append(" \nTipo de Automovil:").append(tipoAutomovil);
        sb.append(" \nMarca del Automovil: ").append(marcaAutomovil);
        sb.append(" \nValor del Automovil: ").append(valorAutomovil);
        sb.append(" \nTiempo de Prestamo:").append(tiempoPrestamo);
        sb.append(String.format(" \nvalor mensual del Prestamo: %.2f", valorMensual));
        return sb.toString();
    }

}
