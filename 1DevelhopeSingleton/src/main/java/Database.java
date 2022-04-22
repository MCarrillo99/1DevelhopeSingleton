import java.util.Optional;

public class Database {

    private static Database instance;

    private static final String host =  "*indirizzo host*";
    private final String username = "mik99";
    private final String password = "ueFbeouoefb8438?";
    private final String port = "*port*";

    private Database(){}

    public static Database getInstance(){
        if (!Optional.ofNullable(instance).isPresent()){
          System.out.println("A new instance was created");
          instance = new Database();
        }
        return instance;
    }

    public String getHost() {
        return host;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPort() {
        return port;
    }
}
