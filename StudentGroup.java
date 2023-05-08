class StudentGroup implements Comparable<StudentGroup> {
    private String name;
    private int numberOfStudents;

    public StudentGroup(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        return name + "[" + numberOfStudents + "]";
    }

    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(numberOfStudents, o.numberOfStudents);
    }
}