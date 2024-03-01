import java.util.Scanner;

public class OfficeSpaceCommission{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("Enter Realtor Name:");
        String RealtorName = input.nextLine();
        System.out.println("Enter width of office space in feet:");     
        double OfficeWidth = input.nextDouble();
        System.out.println("Enter length of office space in feet:");
        double OfficeLength = input.nextDouble();
       
        double OfficeSpace = OfficeWidth * OfficeLength ;
        double MonthlyLeasing = OfficeSpace * 25;
        double LeasingAgreement = MonthlyLeasing *12;
        double LeasingCommission = LeasingAgreement * .005;

       
        System.out.print("\n");
        System.out.println("Leasing Commission Salary");
        System.out.printf("Realtor Name:" + " "+ RealtorName);
        System.out.printf("\nOffice Space: %.0f square feet", OfficeSpace);
        System.out.printf("\nLeasing fee per Month: $%.2f\n",MonthlyLeasing);
        System.out.printf("Leasing agreement for one year: $ %.2f\n", LeasingAgreement);
        System.out.printf("Leasing commission for this agreement: $%.2f\n", LeasingCommission);



}
}
