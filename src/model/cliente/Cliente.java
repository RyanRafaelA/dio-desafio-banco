package model.cliente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char sexo;

    public Cliente(String nome, String dataNascimento, String cpf, char sexo) throws ParseException {
        this.nome = nome;
        this.dataNascimento = sdf.parse(dataNascimento);
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getNome(){ return nome; }
    public Date getDataNascimento() { return dataNascimento; }
    public String getCpf(){ return cpf; }
    public char getSexo() { return sexo; }

    @Override
    public String toString() {
        return getNome()+" - "+String.valueOf(getSexo()).toUpperCase()
                +"\n"+getDataNascimento()+" - "+getCpf();
    }
}