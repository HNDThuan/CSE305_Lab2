import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
class PropertyOwner {
    int userID;
    List<Integer> listOfProperties = new ArrayList<>();

    public PropertyOwner(int userID) {
        this.userID = userID;
    }

}