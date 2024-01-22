package utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.HashMap;
import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormatSymbols;



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
//    public static String monthRandom() {
//        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//        int i = random.nextInt(month.length);
//        return month[i];
    }
    public static int dayBirthRandom() {
        Faker faker = new Faker(new Locale("en"));

        // Генерируем случайный месяц (1-12)
        int randomMonthNumber = faker.number().numberBetween(1, 13);

        // Генерируем случайный день месяца в зависимости от месяца
        int maxDaysInMonth;
        switch (randomMonthNumber) {
            case 2: // Февраль
                maxDaysInMonth = faker.bool().bool() ? 29 : 28; // Високосный год или нет
                break;
            case 4: case 6: case 9: case 11: // Апрель, Июнь, Сентябрь, Ноябрь
                maxDaysInMonth = 30;
                break;
            default:
                maxDaysInMonth = 31;
                break;
        }

        return faker.number().numberBetween(1, maxDaysInMonth + 1);
    }
    public static int yearRandom() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int randomYear = random.nextInt(100) + currentYear - 50; // Генерируем случайный год в диапазоне [-50, 49] от текущего года
        return randomYear;
}
    public static String hobbiesRandom() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        int randomIndex = random.nextInt(hobbies.length);
        return hobbies[randomIndex];
    }
    public static String emailRandom() {
        Faker faker = new Faker(new Locale("en"));

        String username = faker.internet().userName(); // Генерация случайного имени пользователя
        String domain = faker.internet().domainName(); // Генерация случайного домена

        return username + "@" + domain;
    }

//    public static String hobbieRandom() {
//        String[] hobbie = {"Sports", "Reading", "Music"};
//        int i = random.nextInt(hobbie.length);
//        return hobbie[i];
    }

//    public static void main(String[] args) {
//        int randomDay = dayBirthRandom();
//        System.out.println("Random Day of Birth: " + randomDay);
    }


    public static String getRandomString(int len) {
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwyz";

        SecureRandom rnd = new SecureRandom();
        String result = new String();
        for (int i = 0; i < len; i++)
            result += AB.charAt(rnd.nextInt(AB.length()));

        return result.toString();
    }
    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        int index = getRandomInt(0, genders.length - 1);
        return genders[index];
    }
    public static String getRandomPhone() {
            String a = "a123";
            String b = "b456";
            String c1 = a + " " + b; // "a123 b456"
            String c2 = String.format("%s %s", a, b); // "a123 b456"
            return String.format("+%s (%s) %s - %s - %s", getRandomInt(1, 9), getRandomInt(111, 999),
            getRandomInt(111, 999), getRandomInt(11, 99), getRandomInt(11, 99));
}

    public static String getSomething() {
        Faker faker = new Faker(new Locale("ru"));

        String firstName = faker.name().firstName();

        return firstName + 10;
}


 //   public static String getRandomEmail() {
//        return getRandomString(10) + "@mail.com";
//    }
 //   public static String getRandomAddress() {
//        return getRandomString(10) + " " + getRandomString(10) + " " + getRandomString(10);
//    }
 //   public static int getRandomInt(int min, int max) {
 //       return ThreadLocalRandom.current().nextInt(min, max + 1);





