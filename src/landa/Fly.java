package landa;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by benoi on 23/10/2016.
 */
public class Fly {

    private int id;
    private int age;
    private TypeFly typeFly;
    private int weight;
    private String name;
    private List<Foo> foos=new ArrayList<>();


    public Fly(int age, TypeFly typeFly, int weight, String name) {
        this.age = age;
        this.typeFly = typeFly;
        this.weight = weight;
        this.name = name;
    }

    public List<Foo> getFoos() {
        return foos;
    }

    public void setFoos(List<Foo> foos) {
        this.foos = foos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TypeFly getTypeFly() {
        return typeFly;
    }

    public void setTypeFly(TypeFly typeFly) {
        this.typeFly = typeFly;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fly{");
        sb.append("id=").append(id);
        sb.append(", age=").append(age);
        sb.append(", typeFly=").append(typeFly);
        sb.append(", weight=").append(weight);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fly)) return false;
        Fly fly = (Fly) o;
        return id == fly.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
