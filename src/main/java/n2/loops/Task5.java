package n2.loops;

/*
- написати програми які рахують суму парних чисел від 0 до 100 використовуючи :
	- for (int i=0; {умова}; {крок})
	- for (int i=0; {умова};)
	- for (int i=0;;)
	- while
	- do while
	- while(true)... використовуючи continue/break
*/

public class Task5 {
    public static void main(String[] args) {
        int sum, number;

        //solution 1
        System.out.println('\n' + "for-loop implementation #1 " );
        sum = 0;
        for (int i = 0; i <= 100; i++){
            if (i%2 == 0 && i > 0){
                sum+=i;

            }
        }
        System.out.println(sum);


        //solution 2
        System.out.println('\n' + "for-loop implementation #2 ");
        sum = 0;
        for (int i = 0; i <= 100;){
            i++;
            if (i%2 == 0 && i > 0){
                sum+=i;

            }
        }
        System.out.println(sum);


        //solution 3
        System.out.println('\n' + "for-loop implementation #3 ");
        sum = 0;
        for (int i = 0;;){
            if (i <= 100 ){
                i++;
                if (i%2 == 0 ){
                    sum+=i;

                }continue;
            }break;

        }
        System.out.println(sum);


        //solution 4
        number = 0;
        sum = 0;
        System.out.println('\n' + "while-loop implementation #4 ");
        while (number <= 100){
            number++;
            if (number%2 == 0){
                sum+=number;
            }continue;
        }
        System.out.println(sum);


        //solution 5
        number = 0;
        sum = 0;
        System.out.println('\n' + "do/while-loop implementation #5 ");
        do{
            if (number%2 == 0){
                sum+=number;
                number++;
            }else {
                number++;
                }
        }while (number <= 100);
        System.out.println(sum);


        //solution 6
        number = 0;
        sum = 0;
        System.out.println('\n' + "while(true)-loop implementation #6 ");
        while (true) {
            if (number % 2 == 0) {
                sum += number;
            }
            if (number <= 100) {
                number++;
            } else break;
        }
        System.out.println(sum);
    }
}
