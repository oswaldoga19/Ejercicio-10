public class MatriculaUniversidad {
    private int numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estrato;

    public MatriculaUniversidad(int numeroInscripcion, String nombres, double patrimonio, int estrato) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }

    public double calcularPagoMatricula() {
        double valorConstante = 50000;
        double pagoMatricula = valorConstante;

        if (patrimonio > 2000000 && estrato > 3) {
            double incremento = 0.03 * patrimonio;
            pagoMatricula += incremento;
        }

        return pagoMatricula;
    }

    // Getters para obtener los datos en la interfaz gráfica si es necesario
    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public String getNombres() {
        return nombres;
    }
}
