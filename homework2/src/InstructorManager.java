public class InstructorManager extends Instructor{
    public void getCourseInfo(String userName, String userSurname, String userCourse){
        super.userName = userName;
        super.userSurname = userSurname;
        super.userCourse = userCourse;
        System.out.println(this.userName + " " + this.userSurname +
                " isimli eğitmenin verdiği kurslar: " + this.userCourse);
    }

    public void getSalaryInfo(){
        super.salary = salary;
        System.out.println("Eğitmen maaşı: " + salary + " TL");
    }

}
