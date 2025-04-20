import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                return t1.getGrade() - t2.getGrade();
            }
        });

        queue.offer(new Student("Pramod", 'A'));
        queue.offer(new Student("Surya", 'B'));
        queue.offer(new Student("Anand", 'C'));
        queue.offer(new Student("Aditya", 'D'));
        queue.offer(new Student("Saurabh", 'B'));
        queue.offer(new Student("Arvind", 'E'));

        System.out.printf("Queue is: %s\n", queue);
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
    }
    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {

            return name + ": " + grade;
        }
    }
}
