package br.com.alura.gerenciador.model;

public class Person {

    private String name;
    private Integer years;
    private Double height;

    public Person(String name, Integer years, Double height) {
        this.name = name;
        this.years = years;
        this.height = height;
    }

    @Override
    public String toString() {
        return "["+name+","+years+","+height+"]";
    }
}
