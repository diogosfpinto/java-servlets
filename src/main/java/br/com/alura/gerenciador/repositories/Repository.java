package br.com.alura.gerenciador.repositories;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {

    private List<T> list;

    public Repository(List<T> list) {
        this.list = list;
    }

    public void add(T item){
        if(item != null){
            list.add(item);
        }
    }
}
