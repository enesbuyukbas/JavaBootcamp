public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.addUser(1,"Enes","Büyükbaş", 22,
                "Bilgisayar Mühendisi", "Java");
        System.out.println(student1.getUserInfo());
        StudentManager studentManager1 = new StudentManager();
        studentManager1.getPaymentInfo();
        //CourseManager courseManagerStudent = new CourseManager();
        //courseManagerStudent.getCourseInfoStudent();
        studentManager1.getCourseInfo("Enes","Büyükbaş","Java");
        Instructor instructor1 = new Instructor();
        instructor1.addUser(2, "Beyza Nur","Yüksel", 21,
                "Yazılım Eğitmeni", "Java" );
        System.out.println(instructor1.getUserInfo());
        InstructorManager instructorManager1 = new InstructorManager();
        instructorManager1.getSalaryInfo();
        instructorManager1.getCourseInfo("Beyza Nur","Yüksel","Java");
    }

}
