package main.java.model;
import java.time.LocalDate;

public class Emprestimo {
    private int idEmprestimo;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;


    public Emprestimo(int idEmprestimo, LocalDate dataEmprestimo) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = null;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo() {
        this.idEmprestimo = idEmprestimo;
    }

    public LocalDate getdataEmprestimo() {
        return dataEmprestimo;
    }

    public void setdataEmprestimo() {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getdataDevolucao() {
        return dataDevolucao;
    }


}