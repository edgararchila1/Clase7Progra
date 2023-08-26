package pkgAlumnos;

import java.util.ArrayList;

public class Alumno {

    private String carnet;
    public String nombre;
    public String telefono;
    public String direccion;
    private ArrayList<CursoAsignado> cursoAsignados;
    //constructor

    public double TotalCurso()
    {
        double t = 0;
        for (CursoAsignado c : cursoAsignados)
        {
            t = t + c.getCostoCurso();
        }
        return  t;
    }

    public Alumno (String carnet, String nombre, String telefono, String direccion)
    {
        this.nombre = nombre;
        this.carnet = carnet;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cursoAsignados = new ArrayList<>();
    }

    public void agregarCursoAsignado(CursoAsignado curso)
    {
        cursoAsignados.add(curso);
    }

    @Override
    public String toString()
    {
        return "Carnet: " + this.carnet + "Nombre: " + this.nombre  + "Direccion: " + this.direccion;
    }

    public void mostrarInformacion()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Curso Asignado: ");
        for (CursoAsignado curso : cursoAsignados)
        {
            System.out.println("--------------------------------");
            System.out.println("Curso: " + curso.getNombreCurso());
            System.out.println("Precio: " + curso.getCostoCurso());
            System.out.println("--------------------------------");
        }
    }

    double matricula;
    public void ImprimirMatricula()
    {
        for (CursoAsignado curso : cursoAsignados)
        {
            matricula = matricula + curso.getCostoCurso();
        }
        System.out.println(matricula);
    }
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<CursoAsignado> getCursoAsignados() {
        return cursoAsignados;
    }

    public void setCursoAsignados(ArrayList<CursoAsignado> cursoAsignados) {
        this.cursoAsignados = cursoAsignados;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
}
