import java.util.Random;

public class FakeInfoGenerator {

    private static final String[] FIRST_NAMES = {"John", "Jane", "Mike", "Emily", "David", "Amanda", "Brian", "Jessica", "Adam", "Laura"};
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Brown", "Garcia", "Davis", "Wilson", "Taylor", "Clark", "Anderson", "Harris"};
    private static final String[] EMAIL_DOMAINS = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "aol.com", "icloud.com"};
    private static final String[] STREET_NAMES = {"Main St", "First St", "Oak St", "Maple Ave", "Cedar Ln", "Pine St", "Elm Rd", "Birch St", "Willow Ave", "Cherry Ln"};
    private static final String[] CITIES = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"};
    private static final String[] STATES = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};

    private static final Random rand = new Random();

    public static void main(String[] args) {
        String firstName = generateFirstName();
        String lastName = generateLastName();
        String email = generateEmail(firstName, lastName);
        String streetAddress = generateStreetAddress();
        String city = generateCity();
        String state = generateState();
        String zipCode = generateZipCode();

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zipCode);
    }

    private static String generateFirstName() {
        return FIRST_NAMES[rand.nextInt(FIRST_NAMES.length)];
    }

    private static String generateLastName() {
        return LAST_NAMES[rand.nextInt(LAST_NAMES.length)];
    }

    private static String generateEmail(String firstName, String lastName) {
        Random random = new Random();
        String domain = EMAIL_DOMAINS[rand.nextInt(EMAIL_DOMAINS.length)];
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + random.nextInt(100) + "@"+domain;
        return email;
//        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domain;
    }

    private static String generateStreetAddress() {
        int streetNumber = rand.nextInt(1000) + 1;
        String streetName = STREET_NAMES[rand.nextInt(STREET_NAMES.length)];
        return streetNumber + " " + streetName;
    }

    private static String generateCity() {
        return CITIES[rand.nextInt(CITIES.length)];
    }

    private static String generateState() {
        return STATES[rand.nextInt(STATES.length)];
    }

    private static String generateZipCode() {
        Random random = new Random();
        String zipCode = "";
        for (int i = 0; i < 5; i++) {
            zipCode += random.nextInt(10);
        }

        return zipCode;
    }

    private static String generatePhoneNumber() {
        Random random = new Random();
        String phoneNumber = "";
        for (int i = 0; i < 10; i++) {
            phoneNumber += random.nextInt(10);

            if (i == 2 || i == 5) {
                phoneNumber += "-";
            }
        }

        return phoneNumber;
    }

    private static String generateAddress() {
        Random random = new Random();
        String[] streets = {"Main St", "Broadway", "Maple Ave", "Oak St", "Washington St"};
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
        String[] states = {"NY", "CA", "IL", "TX", "AZ"};
        String address = random.nextInt(1000) + " " + streets[random.nextInt(streets.length)] + "\n";
        address += cities[random.nextInt(cities.length)] + ", " + states[random.nextInt(states.length)] + " " + generateZipCode();

        return address;

    }
}
