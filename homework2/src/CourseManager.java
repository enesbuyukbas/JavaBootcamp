public class CourseManager extends UserManager{
    String userName = super.userName;
    public void getCourseInfoStudent(){

        System.out.println(this.userName + userSurname +
                "isimli eğitmenin verdiği kurslar: " + userCourse);
    }

    public void getCourseInfoInstructor(){

        System.out.println(super.userName+" "+super.userSurname +
                " isimli öğrencinin aldığı kurslar: " + super.userCourse);
    }
}
