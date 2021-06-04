package comparadores;

import java.util.Comparator;
import modelos.Pessoa;
public class PessoaTamanhoNomeComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        //0: o1 ==o2
        //-1: o1<o2
        //1: o1>o2
        if(o1.getNome().length()<o2.getNome().length()){
            return -1;
        }
        if(o1.getNome().length()>o2.getNome().length()){
            return 1;
        }

        return 0;
    }
}
