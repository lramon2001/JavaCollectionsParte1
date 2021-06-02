package collections;

import modelos.Pessoa;

import javax.swing.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args){

        List<Pessoa> pessoas = new LinkedList<Pessoa>();
        pessoas.add(new Pessoa(1,"A1"));
        pessoas.add(new Pessoa(2,"A2"));
        pessoas.add(new Pessoa(3,"A3"));
        pessoas.remove(new Pessoa(1,"A1"));
       /* JOptionPane.showMessageDialog(null,"Com Interator");
        Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
        while(iteratorPessoa.hasNext()){
            Pessoa p = iteratorPessoa.next();
            if(p.getId()==1){
                iteratorPessoa.remove();
            }
            JOptionPane.showMessageDialog(null,p.toString());
        }

    */
        JOptionPane.showMessageDialog(null,pessoas);
    }
}
