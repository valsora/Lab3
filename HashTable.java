import java.util.LinkedList;

public class HashTable<K, V> {
    private static final int length = 32;
    private LinkedList<Pair<K, V>>[] table;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public HashTable() {
        table = new LinkedList[length];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public void put(K key, V value) {
        int index = key.hashCode() % length;
        if (table[index] == null) {
            table[index] = new LinkedList<Pair<K, V>>();
        }
        for (Pair<K,V> pair : table[index]) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                return;
            }
        }
        table[index].add(new Pair<K, V>(key, value));
        size++;
    }

    public V get(K key) {
        int index = key.hashCode() % length;
        if (table[index] != null) {
            for (Pair<K,V> pair : table[index]) {
                if (pair.getKey().equals(key)) return pair.getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = key.hashCode() % length;
        if (table[index] != null) {
            for (Pair<K,V> pair : table[index]) {
                if (pair.getKey().equals(key)) {
                    table[index].remove(pair);
                    size--;
                }
            }
        }
    }
}