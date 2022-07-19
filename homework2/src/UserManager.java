public class UserManager extends User {

    public void addUser (int userId, String userName, String userSurname, int userAge, String userJob, String userCourse) {
        this.userId = userId;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAge = userAge;
        this.userJob = userJob;
        this.userCourse = userCourse;
    }

    public String getUserInfo () {
        if(userName != null && userSurname != null && userJob != null){
            return "Kullanıcı Bilgileri \n " +
                    "ID: " + userId + "\n Adı: " + userName + "\n Soyadı: " + userSurname + "\n Yaş: " + userAge +
                    "\n Meslek: " + userJob;
        }
        return "Kullanıcı Bulunamadı";
    }


}
