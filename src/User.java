public class User {
    private int _id;
    private String _fullname;
    private String _email;
    private String _password;


    public User(int id,String fullname,String email, String password){
        setUserId(id);
        setName(fullname);
        setEmail(email);
        setPassword(password);
//        _id=id;
//        _fullname=fullname;
//        _email=email;
//        _password=password;
    }

//    void setFullname(String yourName){
//        _fullname=yourName;
//    }

    String getFullname(){
        return _fullname;
    }

    void setName(String name){
        _fullname=name;
    }

    int getUserId(){
        return _id;
    }
    void setUserId(int user_id){
        _id=user_id;
    }
    String getEmail(){
        return _email;
    }
    void setEmail(String email_address){
        _email=email_address;
    }

    String getPassword(){
        return _password;
    }
    void setPassword(String password){
        _password=password;
    }

    public String displayUserInfo(){
        return "Name: "+ _fullname+"\nEmail: "+_email+"\nPassowrd: "+getPassword();
    }

    @Override
    public String toString() {
        return "User [Id=" + getUserId()+ "\nname=" + getFullname() + "\nEmail=" + getEmail() + "\nPassword= "+getPassword()+"]";
    }

}
