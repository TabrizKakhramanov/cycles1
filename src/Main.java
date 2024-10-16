//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }

        //task 2
        for (int i = 10; i >0 ; i--) {
            System.out.println(i);
        }

        //task 3
        for (int i = 0; i < 17; i=i+2) {
            System.out.println(i);
        }

        // task 4
        for (int i = 10; i > -11; i--){
            System.out.println(i);
        }

        //task 5
        for (int i = 1904; i <= 2096; i = i+4){
            System.out.println(i + " год является високосным.");
        }

        //task 6
        for (int i = 7; i <= 98; i = i+7){
            System.out.println(i);
        }

        //task 7
        int num = 1;
        for (int i = 1; i <= 512; i=i*2 ){
            System.out.println(i);
        }

        //task 8
        int total = 0;
        int money = 29000;
        for (int i=1; i<=12; i++){
            total = total + money;
            System.out.println("Месяц "+i+", сумма накоплений равна "+ total+" рублей.");
        }

        //task 9
        total = 0;
        for (int i = 1; i <= 12 ; i++) {
            total = total + (total/100);
            total = total + money;
            System.out.println("Месяц "+i+", сумма накоплений равна "+ total+" рублей.");

        }

        //task 10
        int number = 2;
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result=number*i;
            System.out.println(number+"*"+i+"="+result);
        }

    }
}