package fundamentals.srp;

public class UserAuthenticator {
    public static boolean authenticateUser(String username, String password) {
    	// Validate username and password
        if (UserValidator.validateUsername(username) && UserValidator.validatePassword(password)) {
            // Authenticate user
            return true;
        } else {
            return false;
        }
    }
}