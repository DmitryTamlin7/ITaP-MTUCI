import java.util.Iterator;
import java.util.LinkedList;

class HashTable {
    private static class Entry {
        String studentId; // номер зачетки
        Student student;

        Entry(String studentId, Student student) {
            this.studentId = studentId;
            this.student = student;
        }
    }

    private LinkedList<Entry>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        table = new LinkedList[capacity];
        size = 0;
    }

    private int hash(String studentId) {
        return (studentId.hashCode()) % table.length;
    }

    public void put(String studentId, Student student) {
        if (studentId == null || student == null) {
            throw new IllegalArgumentException("Student ID and Student cannot be null");
        }

        int index = hash(studentId);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry entry : table[index]) {
            if (entry.studentId.equals(studentId)) {
                entry.student = student; // Обновляем информацию о студенте
                return;
            }
        }

        size++;
        table[index].add(new Entry(studentId, student));
    }

    public Student get(String studentId) {
        int index = hash(studentId);

        if (table[index] != null) {
            for (Entry entry : table[index]) {
                if (entry.studentId.equals(studentId)) {
                    return entry.student;
                }
            }
        }

        return null; // Студент не найден
    }

    public void remove(String studentId) {
        int index = hash(studentId);

        if (table[index] != null) {
            Iterator<Entry> iterator = table[index].iterator();
            while (iterator.hasNext()) {
                Entry entry = iterator.next();
                if (entry.studentId.equals(studentId)) {
                    iterator.remove();
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

    public void clear() {
        table = new LinkedList[table.length];
        size = 0;
    }
}
