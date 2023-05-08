import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private int streamNumber;
    private List<StudentGroup> groups;

    public StudentStream(int streamNumber) {
        this.streamNumber = streamNumber;
        this.groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }

    public static void main(String[] args) {
        StudentStream stream = new StudentStream(1);
        stream.addGroup(new StudentGroup("Group A", 20));
        stream.addGroup(new StudentGroup("Group B", 15));
        stream.addGroup(new StudentGroup("Group C", 25));

        // Вывод списка групп через for each
        System.out.println("Student Stream " + stream.getStreamNumber() + ":");
        for (StudentGroup group : stream) {
            System.out.println(group);
        }

        // Сортировка групп по количеству студентов и вывод в консоль
        Collections.sort(stream.groups);
        System.out.println("\nSorted Student Stream " + stream.getStreamNumber() + ":");
        for (StudentGroup group : stream) {
            System.out.println(group);
        }
    }
}