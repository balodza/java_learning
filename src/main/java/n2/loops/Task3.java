package n2.loops;

/*
- написати програму яка виводить в консоль пірамідку від 1 до 10 :
*
**
***
****
*****
******
*******
********
*********
**********
використовуючи цикли :
	- for (int i=0; {умова}; {крок})
	- for (int i=0; {умова};)
	- for (int i=0;;) ( використовуючи continue/break )*/

public class Task3 {
    public static void main(String[] args) {
        String s = new String();

        // solution 1
        for (int i = 0; i < 10; i++){
            s+="*";
            System.out.println(s);
        }
        System.out.println("-----------------------");

        // solution 2
        s ="";
        for (int k = 0; k < 10; ){
            k++;
            s+="*";
            System.out.println(s);
        }
        System.out.println("-----------------------");

        // solution 3
        s ="";
        for (int j = 0; ; ){
            if (j < 10){
                j++;
                s+="*";
                System.out.println(s);
            }else break;

        }
    }
}
