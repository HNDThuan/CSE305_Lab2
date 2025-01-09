public class User{
    String userID;
    String email;
    String password;
    String userType;

    public User(String id, String email, String password, String type){
        this.userID = id;
        this.email = email;
        this.password = password;
        this.userType = type;
    }

    public User createUser(String id, String email, String password, String type){
        User user = new User(id, email, password, type);
        return user;
    }
    public void resetPassword(){
        
    }
}