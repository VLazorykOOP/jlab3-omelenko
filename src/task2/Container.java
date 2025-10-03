package task2;

import java.util.List;

public abstract class Container {
    protected List<Integer> data;

    public Container(List<Integer> data) {
        this.data = data;
    }

    public abstract void addItem(Integer item);
    public abstract void removeItem(Integer item);
    public abstract void sort();
    public abstract double norma();
}
