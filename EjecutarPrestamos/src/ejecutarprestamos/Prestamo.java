package ejecutarprestamos;

public class Prestamo {

    Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudad;
    protected float interes;

    public Prestamo(int tiempoPrestamo, String ciudad, String nombre, String apellido, String username) {
        beneficiario = new Persona(nombre, apellido, username);
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudad = ciudad;
        interes = (float) (0.17);
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
