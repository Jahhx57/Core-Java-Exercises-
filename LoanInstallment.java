import java.util.Scanner;  // importing scanner
public class LoanInstallmentPlan{
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in); //deploying scanner
        System.out.print("First Name:");
        String firstname = input.next();
        System.out.print("Last Name:");
        String lastname = input.next();
        input.nextLine();
        System.out.print("Building Address:");
        String billingaddress = input.nextLine(); //clear the buffer
        System.out.print("Loan Amount:");
        double loanamount = input.nextDouble();
        System.out.print("Terms of Loan(months):");
        int termofloan = input.nextInt();
      
        double interestamount = loanamount *.039;
        double totalloanamount = loanamount + interestamount;
        double monthlypayment = totalloanamount / termofloan;

        System.out.println("Borrower: " +firstname+" "+lastname);
        System.out.println("Billing Address:" +billingaddress);
        System.out.printf("Loan Amount: $%.2f\n",loanamount);
        System.out.printf("Interest:$%.2f\n", interestamount);
        System.out.printf("Total Loan Amount: $%.2f\n", totalloanamount);
        System.out.printf("Term of Loan: %d months\n", termofloan);
        System.out.printf("Payment/month: $%.2f\n", monthlypayment);
    }
}
