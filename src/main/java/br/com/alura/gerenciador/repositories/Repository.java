package br.com.alura.gerenciador.repositories;

import java.util.Collections;
import java.util.List;

public class Repository<T> {

    protected List<T> list;

    public Repository() {
    }

    public Repository(List<T> list) {
        this.list = list;
    }

    public void add(T item){
        if(item != null){
            list.add(item);
        }
    }

    public List<T> getAll() {
        if(list != null){
            return Collections.unmodifiableList(list);
        }
        return null;
    }
}
