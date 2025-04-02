public class User {

    private String firstname;
            private String password;

    public User (String firstname,  String password){
        this.firstname = firstname;
        this.password = password;
    }
    public String getUserName() {
        return firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String newName) {
        firstname = newName;

    }
}
