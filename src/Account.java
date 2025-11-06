public class Account {
    private int _id;
    private int _accountNumber;
    private int _userId;
    private double _balance;

    public Account(int accountId,int accountNumber,int user_Id,double balance){
        setAccountId(accountId);
        set_accountNumber(accountNumber);
        set_userId(user_Id);
        set_balance(balance);

    }

    void setAccountId(int id){
        _id=id;
    }
    int getAccountId(){
        return _id;
    }

    void set_accountNumber(int accountNumber){
        _accountNumber=accountNumber;
    }
    int get_accountNumber(){
        return _accountNumber;
    }

    void set_userId(int userId){
        _userId=userId;
    }

    int get_userId(){
        return _userId;
    }

    void set_balance(double balance){
        _balance=balance;
    }

    double get_balance(){
        return _balance;
    }

    public String displayAccountInfo(){
        return "Id: "+ getAccountId()+"\nAccount Number: "+get_accountNumber()+
                "\nUser Id: "+get_userId()+"\nBalance: "+get_balance();
    }
}
