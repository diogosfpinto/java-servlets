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

    public String getName() {
        return name;
    }

    public Integer getYears() {
        return years;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "["+name+","+years+","+height+"]";
    }
}
