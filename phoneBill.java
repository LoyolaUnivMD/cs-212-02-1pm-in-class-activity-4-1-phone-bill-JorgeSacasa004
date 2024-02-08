import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	    System.out.println("What subscription package do you have (Green/Blue/Purple)? ");
        String plan = scan.nextLine();
        String lowerPlan = plan.toLowerCase();
        System.out.println("How many gigabytes of internet did you used this month? ");
        double gb = scan.nextFloat();
        if(lowerPlan.equals("green")|| lowerPlan.equals("blue")){
            double discount = 0;
            double extraCost = 0;
            double extraGb = 0;
            double basePrice = 0;
            if(lowerPlan.equals("green")){
                basePrice = 49.99;
                if (gb > 2){
                    extraCost = 15;
                    extraGb = gb - 2;
                }
                System.out.println("Do you have a coupon (Yes/No)? ");
                String answer = scan.nextLine();
                String lowerAsnwer = answer.toLowerCase();
                if(lowerAsnwer.equals("yes")){
                    discount = 20;
                }
            }
            else if(lowerPlan.equals("blue")){
                basePrice = 70;
                if(gb >= 5){
                    extraCost = 10;
                    extraGb = gb - 4;
                }
            }
           double cost = basePrice + (extraCost * extraGb);
           if(cost > 75){
               cost = cost - discount;
           }
           System.out.println("Ok, you used " + extraGb + " extra gigabytes and your total price for this month is " + cost + " dollars");
        }
        else if(lowerPlan.equals("purple")){
            System.out.println("Ok, your total price for this month is 99.95 dollars");
        }
        else{
            System.out.println("Sorry, that is not a valid package");
        }
    }
}
