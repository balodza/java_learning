package n2.loops;

public class Task3 {
    public static void main(String[] args) {
        String s1 = "*";
        String s2 = "*";
        String s3 = "*";

        // solution 1
        for (int i = 0; i < 10; i++){
            System.out.println(s1);
            s1+="*";
        }
        System.out.println("-----------------------");

        // solution 2
        for (int k = 0; k < 10; ){
            k++;
            System.out.println(s2);
            s2+="*";
        }
        System.out.println("-----------------------");

        // solution 3
        for (int j = 0; ; ){
            if (j < 10){
                j++;
                System.out.println(s3);
                s3+="*";
            }else break;

        }
    }
}
