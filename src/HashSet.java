
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashSet<E> implements Set<E>{
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
    public boolean contains(Object o){
        return hm.containsKey(o);
    }
    public boolean containsAll(Collection<?> col){
        for (Object o : col){
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
    public <T> T[] toArray(T[] t){
        return null;
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
            if (size >= capacity) return true;
            if (!hm.containsKey(e)){
                hm.put(e, new Object());
                size++;
            }
        }
        return true;
    }
    public boolean remove(Object o){
        if (hm.get(o) == null) return false;

        hm.remove(o);
        size--;
        return true;
    }
    public boolean removeAll(Collection<?> col){
        for (Object o : col){
            if (hm.containsKey(o)){
                hm.remove(o);
                size--;
            }
        }
        return true;
    }

    public boolean retainAll(Collection<?> col){
        for (E e : hm.keySet()){
            if (!col.contains(e)){
                hm.remove(e);
                size--;
            }
        }
        return true;
    }

    public Iterator iterator(){
        return null;
    }

    public void clear(){
        hm.clear();
    }
}
