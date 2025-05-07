import java.util.*;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Россия", "Москва");
        Address address2 = new Address("Америка", "Нью Йорк");
        Address address3 = new Address("Италия", "Рим");
        Address address4 = new Address("Россия", "Омск");
        Address address5 = new Address("Россия", "Тула");

        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(address1, 1500);
        costPerAddress.put(address2, 2500);
        costPerAddress.put(address3, 1000);
        costPerAddress.put(address4, 1200);
        costPerAddress.put(address5, 1300);

        int sum = 0;
        Set<String> chosenCountries = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Заполнение нового заказа.");

            System.out.println("Введите страну или end: ");
            String inputCountry = scanner.nextLine();

            if (inputCountry.equals("end")) {
                break;
            }

            System.out.println("Введите город: ");
            String inputCity = scanner.nextLine();

            System.out.println("Введите вес (кг): ");
            String weight = scanner.nextLine();
            try {
                int parcelWeight = Integer.parseInt(weight);

                Address inputAddress = new Address(inputCountry, inputCity);

                boolean checker = costPerAddress.containsKey(inputAddress);

                if (checker) {
                    int pricePerKg = costPerAddress.get(inputAddress);
                    System.out.println("Стоимость доставки: " + pricePerKg * parcelWeight);
                    sum += pricePerKg * parcelWeight;
                    System.out.println("Общая стоимость всех доставок: " + sum);
                    chosenCountries.add(inputCountry);
                    System.out.println(chosenCountries);

                } else {
                    System.out.println("Доставки по этому адресу нет.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: некорректный вес!");
                continue;
            }


        }


    }

}