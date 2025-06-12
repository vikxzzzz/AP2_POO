package control;

import model.*;
import java.util.HashSet;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {

        // Locais
        Sala sala1 = new Sala("Sala Grande", 50, "Bloco Principal", 101, true);
        Auditorio auditorio1 = new Auditorio("Auditorio Central", 300, "Bloco de Eventos", true, true);
        Laboratorio lab1 = new Laboratorio("Lab de Programação", 25, "Bloco de Tecnologia", 20, "informatica");

        // Pessoas Responsáveis
        Instrutor instrutor1 = new Instrutor("Prof. Carlos", "carlos@univ.com", "Doutorado", "Desenvolvimento Web");
        Organizador organizador1 = new Organizador("Julia Mendes", "julia@univ.com", "Secretaria de Eventos");

        // Palestrantes Convidados
        PalestranteConvidado palestrante1 = new PalestranteConvidado("Dra. Sofia Lima", "sofia.lima@empresa.com", "Tech Solutions Ltda.");

        // Participantes (Alunos)
        Participante p1 = new Participante("Aluno A", "111.111.111-11", "alunoA@aluno.com", "Engenharia de Software");
        Participante p2 = new Participante("Aluno B", "222.222.222-22", "alunoB@aluno.com", "Ciência da Computação");
        Participante p3 = new Participante("Aluno C", "333.333.333-33", "alunoC@aluno.com", "Análise de Sistemas");



        // Materiais para Minicurso
        Set<String> materiaisMinicurso = new HashSet<>();
        materiaisMinicurso.add("Livro Básico de Java");
        materiaisMinicurso.add("Slides do Curso");

        // Eventos
        Palestra palestra1 = new Palestra("Introdução à POO", "2025-07-10", 2, "R$ 500.00", sala1, palestrante1);
        Minicurso minicurso1 = new Minicurso("Java Avançado", "2025-07-15", 4, "R$ 800.00", lab1, instrutor1, 8, materiaisMinicurso);
        Seminario seminario1 = new Seminario("Carreiras em TI", "2025-07-20", 3, "R$ 600.00", auditorio1, "Mercado de Trabalho", p1, organizador1);



        // Adicionar eventos ao organizador
        organizador1.addEvento(palestra1);
        organizador1.addEvento(minicurso1);
        organizador1.addEvento(seminario1);


        // Adicionar participantes aos eventos
        palestra1.addParticipante(p1);
        palestra1.addParticipante(p2);

        // Adicionar participante no minicurso
        minicurso1.addParticipante(p1);
        minicurso1.addParticipante(p3);

        seminario1.addParticipante(p2);
        seminario1.addParticipante(p3);


    }
}