package database;

public class Database extends БазаДаних{
    private БазаДаних database;

    public Database(){
        this.database = new БазаДаних();
    }

    public Database(БазаДаних database){
        this.database = database;
    }

    public String getUserData(){
        return database.отриматиДаніКористувача();
    }

    public String getStatisticData(){
        return database.отриматиСтатистичніДані();
    }

}
