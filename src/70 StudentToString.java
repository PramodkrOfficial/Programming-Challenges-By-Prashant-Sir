class StudentToString {
    String name;
    int age;
    String rollNumber;
    String home;


    public StudentToString(String name, int age, String rollNumber, String home) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.home = home;
    }

    @Override
    public String toString() {
        return "Student Details:{ name:"+name+", age:"+age+", roll number:"+rollNumber+", home:"+home+" }";
    }

    public static void main(String[] args) {
        StudentToString sts = new StudentToString("Pramod",25,"010","Royal Hostel");
        System.out.println(sts);
    }
}
