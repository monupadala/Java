public class DrivingLicenseRegistration {

    // Method to check if the applicant is eligible
    public static void checkEligibility(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Applicant is not eligible for a driving license. Minimum age is 18.");
        } else {
            System.out.println("✅ Applicant is eligible for driving license registration.");
        }
    }

    public static void main(String[] args) {
        // Example test: change the age to test different outcomes
        int applicantAge = 16;

        try {
            checkEligibility(applicantAge);
            System.out.println("🚗 Proceeding with registration...");
        } catch (Exception e) {
            System.out.println("❌ Registration failed: " + e.getMessage());
        }

        System.out.println("📋 Thank you for using the Driving License Registration System.");
    }
}