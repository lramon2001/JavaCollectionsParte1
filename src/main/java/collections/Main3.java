package collections;

import modelos.Pessoa;

import javax.swing.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main3  {
    public static void main (String[] args){
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        JOptionPane.showMessageDialog(null,set);
        set.add(3);
        JOptionPane.showMessageDialog(null,set);
        Set<Pessoa> setPessoa = new HashSet<Pessoa>();
        setPessoa.add(new Pessoa(1,"Lucas"));
        setPessoa.add(new Pessoa(1,"Lucas"));
        //LinkedHashSet garante a ordem de manipulação
        JOptionPane.showMessageDialog(null,setPessoa);
        Set<Integer> setI = new LinkedHashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        JOptionPane.showMessageDialog(null,setI);
        set.add(3);
        JOptionPane.showMessageDialog(null,setI);
        Set<Pessoa> setp = new LinkedHashSet<Pessoa>();
        setPessoa.add(new Pessoa(1,"Lucas"));
        setPessoa.add(new Pessoa(1,"Lucas"));
        JOptionPane.showMessageDialog(null,setp);
    }


}
