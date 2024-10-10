import java.util.LinkedList;

class hashTable1<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }

        void setValue(V value) {
            this.value = value;
        }
    }

    private LinkedList<Entry<K, V>>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public hashTable1(int capacity) {
        table = new LinkedList[capacity];
        size = 10;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    public void put(K key, V value) {
        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        size++;
        table[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);

        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }

        return null;
    }

    public void remove(K key) {
        int index = hash(key);

        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    table[index].remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public static void main(String[] args) {
        hashTable1<String, Integer> hashTable = new hashTable1<>(10);

        // Добавление элементов
        hashTable.put("apple", 1);
        hashTable.put("banana", 2);
        hashTable.put("orange", 3);

        // Получение элементов
        System.out.println(hashTable.get("apple"));
        System.out.println(hashTable.get("banana"));
        System.out.println(hashTable.get("orange"));



        // Удаление элемента
        hashTable.remove("banana");
        System.out.println("Удаление " + hashTable.get("banana"));
        System.out.println("размер " + hashTable.size());



        System.out.println("сколько осталось" + hashTable.isEmpty()); // true
    }
}

