
import java.util.Collection;
import java.util.HashMap;

public class HashSet<E>{
    HashMap<E, Object> hm;
    int capacity;
    int size;

    public HashSet(int cap){
        hm = new HashMap<>(cap);
        capacity = cap;
    }

    public int size(){
        return  size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean contains(E element){
        return hm.containsKey(element);
    }
    public boolean containsAll(Collection<? extends E> col){
        for (E o : col){
            if (!hm.containsKey(o)) return false;
        }
        return true;
    }
    public Object[] toArray(){
        Object[] arr = new Object[capacity];
        int i = 0;
        for (E e : hm.keySet()){
            arr[i] = e;
            i++;
        }
        return arr;
    }
    public boolean add(E element){
        if (contains(element)) return false;
        if (size >= capacity) return false;

        hm.put(element, new Object());
        size++;
        return true;
    }
    public boolean addAll(Collection<? extends E> col){
        if (col.size() + size > capacity) return false;
        for (E e : col){
            if (!hm.containsKey(e)){
                hm.put(e, new Object());
            }
        }
        return true;
    }
    public boolean remove(E element){
        if (hm.get(element) == null) return false;

        hm.remove(element);
        return true;
    }
    public boolean removeAll(Collection<? extends E> col){
        for (E e : col){
            if (hm.containsKey(e)){
                hm.remove(e);
            }
        }
        return true;
    }

    public boolean retainAll(Collection<? extends E> col){
        for (E e : hm.keySet()){
            if (!col.contains(e)){
                hm.remove(e);
            }
        }
        return true;
    }

    public void clear(){
        hm.clear();
    }
}
