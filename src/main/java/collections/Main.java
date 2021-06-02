package collections;

import modelos.Pessoa;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
          List<Pessoa> pessoas = new ArrayList<Pessoa>();
          pessoas.add(new Pessoa(7,"Lucas"));
          pessoas.add(new Pessoa(5,"Pedro"));
          pessoas.add(new Pessoa(9,"Judas"));
          pessoas.contains(new Pessoa(1,"Lucas"));
        JOptionPane.showMessageDialog(null,pessoas.toString());
        JOptionPane.showMessageDialog(null,"Agora usaremos o Iterator para printar os nomes");

        List<Pessoa> pessoasListaLigada = new LinkedList<Pessoa>();
        pessoasListaLigada.add(new Pessoa(5,"Mateus"));
        pessoasListaLigada.add(new Pessoa(3,"João"));
        pessoasListaLigada.add(new Pessoa(7,"Tiago"));
        pessoasListaLigada.add(new Pessoa(1,"Tiago"));
        Collections.sort(pessoas);

        ListIterator<Pessoa> interadorDePessoas = pessoas.listIterator();
        while(interadorDePessoas.hasNext()){
            Pessoa p = interadorDePessoas.next();
            if(p.getId()==1){
                interadorDePessoas.remove();
            }
            JOptionPane.showMessageDialog(null,p.toString());
        }
        Iterator<Pessoa> interador = pessoas.iterator();
        while(interadorDePessoas.hasNext()){
            Pessoa p = interador.next();
            if(p.getId()==1){
                interadorDePessoas.remove();
            }
            JOptionPane.showMessageDialog(null,p.toString());
        }
      pessoas.removeIf(p->p.getId()==1);
        JOptionPane.showMessageDialog(null,"Com for each");
        for(Pessoa p : pessoas){

            JOptionPane.showMessageDialog(null,p.toString());

        }

    }

}
