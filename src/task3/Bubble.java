package task3;

import java.util.List;

public class Bubble implements Container {
    protected List<Integer> data;

    public Bubble(List<Integer> list) {
        data = list;
    }

    @Override
    public void addItem(Integer item) {
        data.add(item);
    }

    @Override
    public void removeItem(Integer item) {
        data.remove(data.indexOf(item));
    }

    @Override
    public void sort() {
        boolean swapped;

        for (int i = 0; i < data.size()-1; i++) {
            swapped = false;

            for (int j = 0; j < data.size()-1-i; j++) {
                if (data.get(j) > data.get(j+1)) {
                    Integer temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j+1, temp);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

        }
    }

    @Override
    public double norma() {
        Integer sum = 0;
        for (Integer item : data) {
            sum += item;
        }
        return Math.sqrt(sum);
    }

    @Override
    public String toString() {
        return "== Bubble ==\ndata: " + data + "\nnorma: " + norma() + "\n" + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
