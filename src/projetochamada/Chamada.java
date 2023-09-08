/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetochamada;

/**
 *
 * @author guilherme.silva
 */
public class Chamada {

    private String codigo;
    private String turma;
    private String nomealuno;

    public Chamada(String codigo, String turma, String nomealuno) {
        this.codigo = codigo;
        this.turma = turma;
        this.nomealuno = nomealuno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getNomeAluno() {
        return nomealuno;
    }

    public void setNomeAluno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public String toString() {
        return "Codigo do aluno :" + this.codigo + "Turma :" + this.turma
                + "Nome do Aluno : " + this.nomealuno;
    }

    void Add(Chamada chamada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void add(Chamada chamada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
