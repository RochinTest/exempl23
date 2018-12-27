// Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем,
// что первый и второй члены последовательности равны единицам, а каждый следующий –
// сумме двух предыдущих.
public class Main {

    public static void main(String[] args) {
        int p = 0;
        int n[];
        System.out.println(1);
        n = new int[12];
        n[0] = 0;
        n[1] = 1;
        for (int i = 2; i < 12; i++) {

            n[i] = n[i - 1] + n[i - 2];
            //if (p==0) System.out.println("1");
            System.out.println("" + n[i]);
        }
    }
}
