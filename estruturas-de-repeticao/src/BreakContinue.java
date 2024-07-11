public class BreakContinue {
    public static void main(String[] args) {
        for(int num = 1; num <=5; num++){
            if(num == 3)
                break;
                System.out.println(num);
        }      

        for(int x = 1; x <=5; x++){
            if(x == 3)
                continue;
                System.out.println(x);
        }     
    }
}
