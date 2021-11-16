import database.Authorization;
import database.Database;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization authorization = new Authorization();
        if (authorization.logIn(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
