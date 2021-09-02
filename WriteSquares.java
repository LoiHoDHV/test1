
package test1;
public class WriteSquares {
    // toi dang lam cai deo gi dy
    public static void main(String[] args){
        for(int i  = 1; i <= 5; i++){
            System.out.println(i + " squared = " + (i*i));
            System.out.println();
        }
        int squared  =  0;
        for(int i = 1; i <= 5; i++){
            squared = (int)Math.pow(i,2);
            System.out.println(i + "Squared = " + squared);
        }
        System.out.print("The last Squared = "  + squared);
        /* int count = counting();
        System.out.println(count); */
    }
    public static int counting(){
        int count = 0;
        for (int i = 1 ; i <= 10 ; i ++){
            for(int j = 1; j <= 5; j++){
                ++count;
                System.out.println("Hi there");
            }
        }
        return count;
    }

}
