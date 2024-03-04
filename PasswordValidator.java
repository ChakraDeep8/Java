public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        // Rule 1: Password must have at least ten characters
        if (password.length() < 10) {
            return false;
        }
        
        // Rule 2: Password consists of only letters and digits
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        
        // Rule 3: Password must contain at least two digits
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            return false;
        }
        
        // If all rules are satisfied, return true
        return true;
    }
    
    public static void main(String[] args) {
        // Example usage
        String password1 = "ValidPassword123";
        String password2 = "Invalid1";
        
        System.out.println("Password 1 is valid: " + isValidPassword(password1));
        System.out.println("Password 2 is valid: " + isValidPassword(password2));
    }
}
