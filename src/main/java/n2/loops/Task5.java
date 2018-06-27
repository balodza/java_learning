package n2.loops;

public class Task5 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;


        //solution 1
        System.out.println('\n' + "for-loop implementation #1 " );
        for (int i = 0; i <= 100; i++){
            if (i%2 == 0 && i > 0){
                sum1+=i;

            }
        }
        System.out.println(sum1);


        //solution 2
        System.out.println('\n' + "for-loop implementation #2 ");
        for (int i = 0; i <= 100;){
            i++;
            if (i%2 == 0 && i > 0){
                sum2+=i;

            }
        }
        System.out.println(sum2);


        //solution 3
        System.out.println('\n' + "for-loop implementation #3 ");
        for (int i = 0;;){
            if (i <= 100 ){
                i++;
                if (i%2 == 0 ){
                    sum3+=i;

                }continue;
            }break;

        }
        System.out.println(sum3);


        //solution 4
        int number1 = 0;
        System.out.println('\n' + "while-loop implementation #4 ");
        while (number1 <= 100){
            number1++;
            if (number1%2 == 0){
                sum4+=number1;
            }continue;
        }
        System.out.println(sum4);


        //solution 5
        int number2 = 0;
        System.out.println('\n' + "do/while-loop implementation #5 ");
        do{
            if (number2%2 == 0){
                sum5+=number2;
                number2++;
            }else {
                number2++;
                }
        }while (number2 <= 100);
        System.out.println(sum5);


        //solution 6
        int number3 = 0;
        System.out.println('\n' + "while(true)-loop implementation #6 ");
        while (true) {
            if (number3 % 2 == 0) {
                sum6 += number3;
            }
            if (number3 <= 100) {
                number3++;
            } else break;
        }
        System.out.println(sum6);
    }
}
