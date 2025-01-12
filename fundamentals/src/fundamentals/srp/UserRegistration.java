package fundamentals.srp;

public class UserRegistration {
    public static boolean registerUser(String username, String password) {
    	 // Validate username and password
        if (UserValidator.validateUsername(username) && UserValidator.validatePassword(password)) {
            return true;
        } else {
            return false;
        }
    }
}