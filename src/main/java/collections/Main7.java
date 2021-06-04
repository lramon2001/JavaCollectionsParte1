package collections;

import modelos.Pessoa;

import javax.swing.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main7 {
    public static void main(String[] args){
        Queue<Pessoa> queue = new PriorityQueue<Pessoa>(Comparator.comparing(Pessoa::getNome));
        queue.add(new Pessoa(3,"Lucas"));
        queue.add(new Pessoa(1,"Pedrão"));
        queue.add(new Pessoa(2,"João"));
        queue.offer(new Pessoa(4, "Judas"));
        JOptionPane.showMessageDialog(null,queue);
        while(!queue.isEmpty()){
            Pessoa p =queue.poll();
            JOptionPane.showMessageDialog(null,p);
        }
        while(!queue.isEmpty()){
            Pessoa p =queue.poll();
            JOptionPane.showMessageDialog(null,p);
        }

    }
}
