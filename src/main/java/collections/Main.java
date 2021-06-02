package collections;

import modelos.Pessoa;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
          List<Pessoa> pessoas = new ArrayList<Pessoa>();
          pessoas.add(new Pessoa(1,"Lucas"));
          pessoas.add(new Pessoa(2,"Pedro"));
          pessoas.add(new Pessoa(3,"Judas"));
          pessoas.contains(new Pessoa(1,"Lucas"));
        JOptionPane.showMessageDialog(null,pessoas.toString());
        JOptionPane.showMessageDialog(null,"Agora usaremos o Iterator para printar os nomes");

        List<Pessoa> pessoasListaLigada = new LinkedList<Pessoa>();
        pessoasListaLigada.add(new Pessoa(1,"Mateus"));
        pessoasListaLigada.add(new Pessoa(2,"João"));
        pessoasListaLigada.add(new Pessoa(2,"Tiago"));
        pessoasListaLigada.add(new Pessoa(2,"Tiago"));

        Iterator<Pessoa> interadorDePessoas = pessoas.iterator();
        while(interadorDePessoas.hasNext()){
            Pessoa p = interadorDePessoas.next();
            if(p.getId()==1){
                interadorDePessoas.remove();
            }
            JOptionPane.showMessageDialog(null,p.toString());
        }

        JOptionPane.showMessageDialog(null,"Com for each");
        for(Pessoa p : pessoas){
            if(p.getId()==1){
                pessoas.remove(p);
            }
            JOptionPane.showMessageDialog(null,p.toString());

        }
    }
}
