class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

class LicenseRegistration {
    public void checkEligibility(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Error: Applicant must be at least 18 years old to register.");
        }
        System.out.println("Registration successful! You are eligible to apply for a driving license.");
    }
}

public class Main {
    public static void main(String[] args) {
        LicenseRegistration registration = new LicenseRegistration();

        int[] testAges = {16, 18, 20}; 

        for (int age : testAges) {
            try {
                System.out.println("\nChecking eligibility for age: " + age);
                registration.checkEligibility(age);
            } catch (AgeRestrictionException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}