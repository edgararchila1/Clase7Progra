package org.example;

import pkgAlumnos.Alumno;
import pkgAlumnos.CursoAsignado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CursoAsignado> cat_cursos = new ArrayList<>();
        cat_cursos.add(new CursoAsignado(101, "Programacion",500));
        cat_cursos.add(new CursoAsignado(105, "Derecho",1));
        cat_cursos.add(new CursoAsignado(110, "Estadistica",450));
        cat_cursos.add(new CursoAsignado(120, "Electronica", 400));

        double total;

//        CursoAsignado curso1 = new CursoAsignado(101, "Programacion",500);
//        CursoAsignado curso2 = new CursoAsignado(105, "Derecho",1);
//        CursoAsignado curso3 = new CursoAsignado(110, "Estadistica",450);
//        CursoAsignado curso4 = new CursoAsignado(120, "Electronica", 400);

//        Alumno al1 = new Alumno("123456789", "Andrea", "987654321", "su casa");
//        al1.agregarCursoAsignado(curso2);
//        al1.agregarCursoAsignado(curso3);

        Alumno al1 = new Alumno("123456789", "Andrea", "987654321", "su casa");
        al1.agregarCursoAsignado(cat_cursos.get(1));
        al1.agregarCursoAsignado(cat_cursos.get(2));

        Alumno al2 = new Alumno("15472", "Rony", "55347772", "mi casa");
        al2.agregarCursoAsignado(cat_cursos.get(0));
        al2.agregarCursoAsignado(cat_cursos.get(2));
        al2.agregarCursoAsignado(cat_cursos.get(3));

        Alumno al3 = new Alumno("4730", "Archila", "11112222", "El progreso pa");
        al3.agregarCursoAsignado(cat_cursos.get(0));
        al3.agregarCursoAsignado(cat_cursos.get(1));
        al3.agregarCursoAsignado(cat_cursos.get(2));

        Alumno al4 = new Alumno("16583", "Oscar", "78442286", "Jutiapa, Jutiapa");
        al4.agregarCursoAsignado(cat_cursos.get(0));
        al4.agregarCursoAsignado(cat_cursos.get(1));
        al4.agregarCursoAsignado(cat_cursos.get(2));
        al4.agregarCursoAsignado(cat_cursos.get(3));


        //Alumno1
        for(CursoAsignado curso : al1.getCursoAsignados()){
            System.out.println("nombre del curso " + curso.getNombreCurso());
            System.out.println("Costo:" + curso.getCostoCurso());
        }
        al1.ImprimirMatricula();

        //Alumno2
        for(CursoAsignado curso : al2.getCursoAsignados()){
            System.out.println("nombre del curso " + curso.getNombreCurso());
            System.out.println("Costo:" + curso.getCostoCurso());
        }
        al2.ImprimirMatricula();

        //Alumno3
        for(CursoAsignado curso : al3.getCursoAsignados()){
            System.out.println("nombre del curso " + curso.getNombreCurso());
            System.out.println("Costo:" + curso.getCostoCurso());
        }
        al3.ImprimirMatricula();

        //Alumno4
        for(CursoAsignado curso : al4.getCursoAsignados()){
            System.out.println("nombre del curso " + curso.getNombreCurso());
            System.out.println("Costo:" + curso.getCostoCurso());
        }
        al4.ImprimirMatricula();

        //TOTAL DE LA UNIVERSIDAD
        total = al1.getMatricula() + al2.getMatricula() + al3.getMatricula() + al4.getMatricula();
        System.out.println("Gran Total = " + total);

    }
}