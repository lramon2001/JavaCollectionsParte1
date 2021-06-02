package collections;

import modelos.Pessoa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args){
          List<Pessoa> pessoas = new ArrayList<Pessoa>();
          pessoas.add(new Pessoa(1,"Lucas"));
          pessoas.add(new Pessoa(2,"Pedro"));
          pessoas.contains(new Pessoa(1,"Lucas"));
        JOptionPane.showMessageDialog(null,pessoas.toString());
        JOptionPane.showMessageDialog(null,"Agora usaremos o Iterator para printar os nomes");
        Iterator<Pessoa> interadorDePessoas = pessoas.iterator();
        while(interadorDePessoas.hasNext()){
            Pessoa p = interadorDePessoas.next();
            JOptionPane.showMessageDialog(null,p.toString());
        }
    }
}
