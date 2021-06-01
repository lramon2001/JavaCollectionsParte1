package collections;

import modelos.Pessoa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args){
          List<Pessoa> pessoas = new ArrayList<Pessoa>();
          pessoas.add(new Pessoa(1,"Lucas"));
          pessoas.add(new Pessoa(2,"Pedro"));
        JOptionPane.showMessageDialog(null,pessoas.toString());
    }
}
