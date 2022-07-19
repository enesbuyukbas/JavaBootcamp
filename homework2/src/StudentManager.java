public class StudentManager extends Student {

    public void getCourseInfo(String userName, String userSurname, String userCourse){
        super.userName = userName;
        super.userSurname = userSurname;
        super.userCourse = userCourse;
        System.out.println(this.userName+" "+this.userSurname +
                " isimli öğrencinin aldığı kurslar: " + this.userCourse);
    }



    public void getPaymentInfo() {
        super.payment = payment;
        System.out.println("Öğrencinin ödediği ücret: " + payment + " TL");

    }

}
