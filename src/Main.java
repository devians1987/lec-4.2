// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        bmi service = new bmi();
        int weight = 74;
        double height = 1.74;
        double mass = service.calculate(weight, height);

        System.out.println(mass);


        }
    }
