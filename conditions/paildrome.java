package conditions;

public class paildrome {
    
    public  static void  main(String[] args){
        int num=121;

        int tmp=num;
        int revNum=0;

        while(tmp >0){
            int digit=tmp % 10;
            revNum=(revNum * 10) + digit;
            tmp=tmp/10;

        }

        System.out.println(revNum);


        if(num == revNum){
            System.out.println("Is Paildrome Number");
        }
        else{
             System.out.println("Not Paildrome Number");
        }

    }
}
