public class Main {

    public static void main(String[] args) {
        int sum=0, i=1;
        for(; i<Integer.MAX_VALUE && sum<Integer.MAX_VALUE; i++) {
            if(sum+i>Integer.MAX_VALUE){
              break;
            }
            sum+=i;
            if(sum==i*i)
                System.out.println(i);
                
        }
        System.out.println("The program ended at "+i);
    }
}