import ru.netology.javaqa.javamvn.services.HolidaysService;

public class main {
    public static void main(String[] args) {
        HolidaysService service = new HolidaysService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int result = service.calculate(income, expenses, threshold);
        System.out.println(result);

        income = 100_000;
        expenses = 60_000;
        threshold = 150_000;
        result = service.calculate(100_000, 60_000, 150_000);
        System.out.println(result);
    }

}
