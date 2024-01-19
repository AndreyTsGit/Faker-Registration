package utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.HashMap;


public class RandomUtils {

    public static void main(String[] args) {
        System.out.println(getRandomString(10));
        System.out.println(getRandomEmail());
        System.out.println(getRandomAddress());
        System.out.println(getRandomInt(111, 99999999));
        System.out.println(getRandomPhone());
        System.out.println(getRandomGender());

    }

    public static String getStateByCity(String value) {
        HashMap<String, String> cityAndState = new HashMap<>();
        cityAndState.put("Washington", "Columbia");
        cityAndState.put("Philadelphia", "Pennsylvania");
        cityAndState.put("New-York", "New-York");
        cityAndState.put("LA", "California");
        cityAndState.put("Long Beach", "California");
        cityAndState.put("Tucson", "Arizona");
        cityAndState.put("Las Vegas", "Nevada");
        cityAndState.put("Phoenix", "Arizona");
        return cityAndState.get(value);
    }
    public static String monthRandom() {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int i = random.nextInt(month.length);
        return month[i];
    }
    public static String hobbieRandom() {
        String[] hobbie = {"Sports", "Reading", "Music"};
        int i = random.nextInt(hobbie.length);
        return hobbie[i];
    }

    public static String getRandomString(int len) {
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwyz";

        SecureRandom rnd = new SecureRandom();
        String result = new String();
        for (int i = 0; i < len; i++)
            result += AB.charAt(rnd.nextInt(AB.length()));

        return result.toString();
    }
    public static String getRandomEmail() {
        return getRandomString(10) + "@mail.com";
    }
    public static String getRandomAddress() {
        return getRandomString(10) + " " + getRandomString(10) + " " + getRandomString(10);
    }
    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public static String getRandomPhone() {
//        String a = "a123";
//        String b = "b456";
//        String c1 = a + " " + b; // "a123 b456"
//        String c2 = String.format("%s %s", a, b); // "a123 b456"
        return String.format("+%s (%s) %s - %s - %s", getRandomInt(1, 9), getRandomInt(111, 999),
                getRandomInt(111, 999), getRandomInt(11, 99), getRandomInt(11, 99));
    }
    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        int index = getRandomInt(0, genders.length - 1);
        return genders[index];
    }
    public static String getSomething() {
        Faker faker = new Faker(new Locale("ru"));

        String firstName = faker.name().firstName();

        return firstName + 10;
    }
}



