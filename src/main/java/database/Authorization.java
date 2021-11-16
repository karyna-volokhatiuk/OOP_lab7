package database;

public class Authorization extends Авторизація{
    private Авторизація authorization;

    public Authorization(){
        this.authorization = new Авторизація();
    }

    public Authorization(Авторизація authorization){
        this.authorization = authorization;
    }

    public boolean logIn(Database database){
        database.getUserData();
        return true;
    }
}
