package Modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Unidad {
    private int id;
    private int intervaloMinimoPrestamo;
    private HorarioDisponibilidad horarioDisponible;
    private List<Administrador> administradores;
    private List<Empleado> empleados;
    private List<Recurso> recursos;

    public Unidad(int id, int intervaloMinimoPrestamo, HorarioDisponibilidad horarioDisponible,
                  List<Administrador> administradores, List<Empleado> empleados, List<Recurso> recursos) {
        this.id = id;
        this.intervaloMinimoPrestamo = intervaloMinimoPrestamo;
        this.horarioDisponible = horarioDisponible;
        this.administradores = administradores;
        this.empleados = empleados;
        this.recursos = recursos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIntervaloMinimoPrestamo() {
        return intervaloMinimoPrestamo;
    }

    public void setIntervaloMinimoPrestamo(int intervaloMinimoPrestamo) {
        this.intervaloMinimoPrestamo = intervaloMinimoPrestamo;
    }

    public HorarioDisponibilidad getHorarioDisponible() {
        return horarioDisponible;
    }

    public void setHorarioDisponible(HorarioDisponibilidad horarioDisponible) {
        this.horarioDisponible = horarioDisponible;
    }

    public List<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    public List<Recurso> consultarRecursosDisponibles(Date fecha, int hora, int minuto) {
        List<Recurso> recursosDisponibles = new ArrayList<>();
        for (Recurso recurso : recursos) {
            if (recurso.getHorarioDisponible().estaDisponible(fecha, hora, minuto)) {
                recursosDisponibles.add(recurso);
            }
        }
        return recursosDisponibles;
    }
}

