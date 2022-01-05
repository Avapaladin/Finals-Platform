import java.util.Scanner;

public class ara {
    public static void main(String[] args) {
        Scanner ava = new Scanner(System.in);
        System.out.print("Your Annual Salary: ");
        Double paladin = ava.nextDouble();
        Double Tax_E = 0.0;
        Double Tax_D = 0.0;
        Double Monthly_R = 0.0;
        Double Daily_R = 0.0;
        Double Hourly_R = 0.0;
        Double Annual_T_D = 0.0;
        Double Monthly_T_D = 0.0;
        Double Net_P = 0.0;

        while(true){
            if(paladin < 250000){

                Monthly_R = paladin / 12;
                Daily_R = Monthly_R / 22;
                Hourly_R = Daily_R / 8;
                Annual_T_D = 0.00;
                Monthly_T_D = 0.00;
                Net_P = Monthly_R - Monthly_T_D;
                break;
            }
            else if(paladin >= 250000 && paladin < 400000){
    
                Tax_D = paladin - 250000 * .20;
    
                Monthly_R = paladin / 12;
                Daily_R = Monthly_R / 22;
                Hourly_R = Daily_R / 8;
                Annual_T_D = Tax_D;
                Monthly_T_D = Annual_T_D / 12;
                Net_P = Monthly_R - Monthly_T_D;
                break;
            }
            else if(paladin >= 400000 && paladin < 800000){
    
                Tax_E = paladin - 400000;
                Tax_D = 0.25 * Tax_E + 30000;
    
                Monthly_R = paladin / 12;
                Daily_R = Monthly_R / 22;
                Hourly_R = Daily_R / 8;
                Annual_T_D = Tax_D;
                Monthly_T_D = Annual_T_D / 12;
                Net_P = Monthly_R - Monthly_T_D;
                break;
            }
            else if(paladin >= 800000 && paladin < 2000000){
    
             Tax_E = paladin - 800000;
                Tax_D = 0.30 * Tax_E + 130000;
    
                Monthly_R = paladin / 12;
                Daily_R = Monthly_R / 22;
                Hourly_R = Daily_R / 8;
                Annual_T_D = Tax_D;
                Monthly_T_D = Annual_T_D / 12;
                Net_P = Monthly_R - Monthly_T_D;
                break;
            }
            else if(paladin >= 2000000 && paladin < 8000000){
    
             Tax_E = paladin - 2000000;
                Tax_D = 0.32 * Tax_E + 490000;
    
                Monthly_R = paladin / 12;
                Daily_R = Monthly_R / 22;
                Hourly_R = Daily_R / 8;
                Annual_T_D = Tax_D;
                Monthly_T_D = Annual_T_D / 12;
                Net_P = Monthly_R - Monthly_T_D;
                break;
            }
            else if(paladin >= 8000000){
    
             Tax_E = paladin - 8000000;
                Tax_D = 0.35 * Tax_E + 2410000;
    
                Monthly_R = paladin / 12;
                Daily_R = Monthly_R / 22;
                Hourly_R = Daily_R / 8;
                Annual_T_D = Tax_D;
                Monthly_T_D = Annual_T_D / 12;
                Net_P = Monthly_R - Monthly_T_D;
                break;
            }
        }
        

        System.out.println("Your Monthly Rate          : " + String.format("%.2f", Monthly_R));
        System.out.println("Your Daily Rate            : " + String.format("%.2f", Daily_R));
        System.out.println("Your Hourly Rate           : " + String.format("%.2f", Hourly_R));
        System.out.println("Your Annual Tax Deduction  : " + String.format("%.2f", Annual_T_D));
        System.out.println("Monthly Tax Deduction      : " + String.format("%.2f", Monthly_T_D));
        System.out.println("Net Pay                    : " + String.format("%.2f", Net_P));
    }
}
