package modelos;

import java.util.Objects;
import java.lang.*;

public class Pessoa implements Comparable<Pessoa> {
    private int id;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return getId() == pessoa.getId() && Objects.equals(getNome(), pessoa.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome());
    }

    @Override
    public int compareTo(Pessoa o) {
        //0 : Os objetos são considerados iguais;
        //
        if(this.getId()==o.getId()){
            return 0;
        }

        if(this.getId()<o.getId()){
            return -1;
        }

        return 1;
    }
}
