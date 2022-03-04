public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 2200;
        int percent = 1;
        {
            if (deposit >= 1000)
                percent = deposit / 100 * 1;
            {

             
                if (deposit < 1000)
                    percent = 0;
            }

            int bonus = deposit + percent;

            System.out.println(bonus);


            // Объявляете переменные для входных данных и
            // параметров программы: начального счёта,
            // суммы пополнения и тп

            // Условным оператором проверяете превысила ли
            // сумма пополнения порог и для этих двух разных
            // сценариев рассчитываете сумму бонуса и выводите
            // на экран.
        }


    }

}