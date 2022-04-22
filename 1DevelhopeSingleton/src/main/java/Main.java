public class Main {
    public static void main(String[] args) {

        Database database = Database.getInstance();

        System.out.println(database.getHost());
        System.out.println(database.getUsername());
        System.out.println(database.getPassword());
        System.out.println(database.getPort());

    }
}
