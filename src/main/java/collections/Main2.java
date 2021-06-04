package collections;

import modelos.Pessoa;
import comparadores.*;
import javax.swing.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args){

        List<Pessoa> pessoas = new LinkedList<Pessoa>();
        pessoas.add(new Pessoa(1,"A1"));
        pessoas.add(new Pessoa(2,"A2"));
        pessoas.add(new Pessoa(3,"A3"));
        pessoas.remove(new Pessoa(1,"A1"));
        // Usando o método da próxima classe
        Collections.sort(pessoas);
        // Usando um comparator
        Collections.sort(pessoas,new PessoaTamanhoNomeComparator());
        Collections.sort(pessoas,((o1, o2) -> {
            if(o1.getNome().length()<o2.getNome().length()){
                return -1;
            }
            else if(o1.getNome().length()>o2.getNome().length()){
                return 1;
            }

            return 0;
        }));
        pessoas.sort((o1,o2)->{
            if(o1.getNome().length()<o2.getNome().length()){
                return -1;
            }
            else if(o1.getNome().length()>o2.getNome().length()){
                return 1;
            }
            return 0;
        });
        pessoas.sort(Comparator.comparingInt(Pessoa::getId));
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
        pessoas.sort(Comparator.naturalOrder());
        pessoas.sort(Comparator.reverseOrder());
        pessoas.sort(Comparator.comparing(Pessoa::getNome,(o1,o2)->{
                    if(o1.length()<o2.length()){
                        return -1;
                    }
                    else if(o1.length()>o2.length()){
                        return 1;
                    }
                    return 0;
                }
                ));
        JOptionPane.showMessageDialog(null,pessoas);
    }

}
