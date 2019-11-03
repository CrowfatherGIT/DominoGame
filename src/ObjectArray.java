import java.util.*;

public class ObjectArray {

    private Object[] arr;

    public ObjectArray(Object[] in) {
        arr = in;
    }

    public void add(int index, Object obj) {
        Object[] newArr = new Object[arr.length + 1];

        for (int srcIndex = 0, dstIndex = 0;
             srcIndex < newArr.length; dstIndex++) {
            if (dstIndex == index) {
                newArr[dstIndex] = obj;
            } else {
                newArr[dstIndex] = arr[srcIndex];
                ++srcIndex;
            }
        }

        arr = newArr;
    }

    public Object get(int index) {
        return arr[index];
    }

    public void replace(int index, Object obj) {
        arr[index] = obj;
    }

    public void addAll(int index, ObjectArray other) {
        Object[] newArr = new Object[arr.length + other.arr.length];

        for (int srcIndex = 0, dstIndex = 0; srcIndex < arr.length; ) {
            if (dstIndex == index) {
                for(int i = 0; i < other.arr.length; ++i) {
                    newArr[dstIndex] = other.arr[i];
                    dstIndex++;
                }
            } else {
                newArr[dstIndex] = arr[srcIndex];
                ++srcIndex;
                dstIndex++;
            }
        }

        arr = newArr;
    }

    public void remove(int index) {
        Object[] newArr = new Object[arr.length - 1];

        for (int srcIndex = 0, dstIndex = 0;
             srcIndex < arr.length; srcIndex++) {
            if (srcIndex != index) {
                newArr[dstIndex] = arr[srcIndex];
                ++dstIndex;
            }
        }

        arr = newArr;
    }

    public void removeAll(Object obj) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].equals(obj)) {
//                remove(i);
//            }
//        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(obj)) {
                count++;
            }
        }

        Object[] newArr = new Object[count];
        for (int srcIndex = 0, dstIndex = 0; srcIndex < arr.length; srcIndex++) {
            if (!arr[srcIndex].equals(obj)) {
                newArr[dstIndex] = arr[srcIndex];
                dstIndex++;
            }
        }

        arr = newArr;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
    public void shuffle() {
        List<Objects> objects = (List<Objects>) Arrays.asList(arr);
        Collections.shuffle(objects);
        arr = objects.toArray();
    }
}
