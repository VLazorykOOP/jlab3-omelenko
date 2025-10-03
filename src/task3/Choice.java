package task3;

import java.util.List;

public class Choice implements Container {
    protected List<Integer> data;

    public Choice(List<Integer> list) {
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
        for (int i = data.size()-1; i >= 0; i--) {

            int max = i;

            for (int j = 0; j <= i; j++) {
                if (data.get(j) > data.get(max)) {
                    max = j;
                }
            }

            if(max != i)
            {
                Integer temp = data.get(i);
                data.set(i, data.get(max));
                data.set(max,temp);
            }
        }
    }

    @Override
    public double norma() {
        Integer sum = 0;
        int count = 0;
        for (Integer item : data) {
            sum += item;
            count++;
        }
        return (double) sum / count;
    }

    @Override
    public String toString() {
        return "== Choice ==\ndata: " + data + "\nnorma: " + norma() + "\n" + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
