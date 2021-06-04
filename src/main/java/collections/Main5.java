package collections;

import comparadores.PessoaTamanhoNomeComparator;
import modelos.Pessoa;

import javax.swing.*;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Main5 {

    public static void main(String[] args){

        NavigableSet<Pessoa> set = new TreeSet<Pessoa>(new PessoaTamanhoNomeComparator());

        set.add(new Pessoa(2,"PedroII"));
        set.add(new Pessoa(1,"PedroI"));
        JOptionPane.showMessageDialog(null,set);
        set.add(new Pessoa(4,"Pedro"));
        Pessoa teste = set.higher(new Pessoa(1,"PedroI"));
        JOptionPane.showMessageDialog(null,teste);
        Pessoa teste2 = set.lower(new Pessoa(1,"PedroI"));
        JOptionPane.showMessageDialog(null,teste2);
        JOptionPane.showMessageDialog(null,set);
        for(Pessoa p : set){
            JOptionPane.showMessageDialog(null,p);
        }



    }
}
