package Parcialfinal;

// import java.util.Locale;
// import java.util.Scanner;

// CLASE ESTUDIANTE

class Estudiante {

    private String codigo;
    private String nombre;
    private double promedio;

    private int horasDeporte;
    private int horasCultura;
    private int horasSalud;

    private int cicloDeporte;
    private int cicloCultura;
    private int cicloSalud;

    public Estudiante(String codigo, String nombre, double promedio) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;

        horasDeporte = 0;
        horasCultura = 0;
        horasSalud = 0;

        cicloDeporte = 0;
        cicloCultura = 0;
        cicloSalud = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getHorasDeporte() {
        return horasDeporte;
    }

    public int getHorasCultura() {
        return horasCultura;
    }

    public int getHorasSalud() {
        return horasSalud;
    }

    public void registrarAprobacion(String categoria, int horas) {

        if (categoria.equalsIgnoreCase("Deporte")) {

            horasDeporte += horas;
            cicloDeporte++;

            if (cicloDeporte == 3) {
                horasDeporte += 5;
                System.out.println("BONO +5 HORAS DEPORTE");
                cicloDeporte = 0;
            }

        } else if (categoria.equalsIgnoreCase("Cultura")) {

            horasCultura += horas;
            cicloCultura++;

            if (cicloCultura == 3) {
                horasCultura += 5;
                System.out.println("BONO +5 HORAS CULTURA");
                cicloCultura = 0;
            }

        } else if (categoria.equalsIgnoreCase("Salud")) {

            horasSalud += horas;
            cicloSalud++;

            if (cicloSalud == 3) {
                horasSalud += 5;
                System.out.println("BONO +5 HORAS SALUD");
                cicloSalud = 0;
            }
        }
    }

    public void aplicarPenalizacion() {

        if (horasDeporte >= 2) {
            horasDeporte -= 2;
        } else if (horasCultura >= 2) {
            horasCultura -= 2;
        } else if (horasSalud >= 2) {
            horasSalud -= 2;
        }

        System.out.println("Penalización aplicada");
    }
}


// CLASE ACTIVIDAD

class Actividad {

    private String id;
    private String nombre;
    private String categoria;
    private int horario;
    private int cupoMaximo;
    private int cupoActual;
    private boolean esAltoImpacto;

    public Actividad(String id, String nombre, String categoria,
                     int horario, int cupoMaximo,
                     boolean esAltoImpacto) {

        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.horario = horario;
        this.cupoMaximo = cupoMaximo;
        this.cupoActual = 0;
        this.esAltoImpacto = esAltoImpacto;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getHorario() {
        return horario;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public int getCupoActual() {
        return cupoActual;
    }

    public void setCupoActual(int cupoActual) {
        this.cupoActual = cupoActual;
    }

    public boolean getEsAltoImpacto() {
        return esAltoImpacto;
    }
}

// CLASE INSCRIPCION

class Inscripcion {

    private Estudiante estudiante;
    private Actividad actividad;
    private boolean activa;

    public Inscripcion(Estudiante estudiante, Actividad actividad) {

        this.estudiante = estudiante;
        this.actividad = actividad;
        activa = true;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public boolean isActiva() {
        return activa;
    }

    public void desactivar() {
        activa = false;
    }
}

// CLASE PRINCIPAL

class BienestarUniajc {

    static Estudiante[] estudiantes = new Estudiante[50];
    static Actividad[] actividades = new Actividad[20];
    // Línea corregida (le puse 100 de tamaño, puedes cambiarlo si necesitas otro límite)
    static Inscripcion[] inscripciones = new Inscripcion[100]; 
    
    // Agregué el método main para que puedas ejecutar el programa desde aquí
    public static void main(String[] args) {
        System.out.println("Sistema compilado sin errores.");
        // Aquí puedes empezar a programar la lógica o el menú
    }
}


