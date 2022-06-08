public class conditionalStatements {
    public static void main (String args[]) {

        int Weekhours1 = 20;
        float salary = 200;
       int OvertimeHours =2;
       if (Weekhours1 > 40 && OvertimeHours <=5 ) {

            salary = (salary * Weekhours1) + 5000;
            System.out.println("Pay overtime R"+salary);
             }
        else if(Weekhours1<=40 && Weekhours1 >35 )  {
            salary = (salary * Weekhours1);
            System.out.println("Your Salary R"+salary);

                 }

        else {
           salary = salary - 2000;
           System.out.println("Salary cut" +salary);

       }
    }


}
