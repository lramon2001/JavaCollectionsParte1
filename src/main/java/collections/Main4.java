package collections;

import modelos.Pessoa;

import javax.swing.*;
import java.util.Set;
import java.util.TreeSet;

public class Main4 {
    public static void main(String[] args){
        Set<Pessoa> set = new TreeSet<Pessoa>();
        set.add(new Pessoa(2,"Pedro"));
        set.add(new Pessoa(1,"Lucas"));
        JOptionPane.showMessageDialog(null,set);
        set.add(new Pessoa(2,"Pedro"));
        JOptionPane.showMessageDialog(null,set);
        for(Pessoa p : set){
            JOptionPane.showMessageDialog(null,p);
        }



    }
}
