import java.text.DecimalFormat;
import java.util.Scanner;

public class PaymentProblem {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
		System.out.println("Enter Name of Item 1");
		String NameOfItem1 =input.next();
		
		System.out.println("Enter Quantity of Item 1 ");
		int QuantityOfItem1 = input.nextInt();
		
		System.out.println("Enter Unit Price of Item 1 ");
		double UnitPriceItem1 = input.nextDouble();
		
		Double AmountItem1= QuantityOfItem1 * UnitPriceItem1 ;
		
		System.out.println("Enter Name of Item 2");
		String NameOfItem2 = input.next();
		
		System.out.println("Enter Quantity of Item 2 ");
		int QuantityOfItem2 = input.nextInt();
		
		System.out.println("Enter Unit Price of Item 2 ");
		double UnitPriceItem2 = input.nextDouble();
		
		double AmountItem2 = QuantityOfItem2 * UnitPriceItem2;
		
		double Subtotal= AmountItem1 + AmountItem2 ;
		
		double GovernmentTax = 0.06 * Subtotal;
		
		double ServiceCharge= 0.1 *Subtotal ;
		
		double TotalPayment = Subtotal +GovernmentTax +ServiceCharge ;
		

		
		
		System.out.println("Item 1:" + NameOfItem1);
		System.out.println("Quantity:"+QuantityOfItem1);
		System.out.println("Unit Price:RM" +UnitPriceItem1);
		System.out.println("Amount:RM"+AmountItem1);
		
		System.out.println("*****************************");
		
		System.out.println("Item 2:"+NameOfItem2);
		System.out.println("Quantity:"+QuantityOfItem2 );
		System.out.println("Unit Price:RM" +UnitPriceItem2 );
		System.out.println("Amount:RM"+ AmountItem2);
		
		
		System.out.println("");
		
		System.out.println("Subtotal:RM"+ Subtotal);
		System.out.println("Goverment Tax:RM" +  String.format("%.2f",GovernmentTax )) ;
		System.out.println("Service Charge:RM" +  String.format("%.2f",ServiceCharge));
		
		System.out.println("");
		
		System.out.println("Total:RM"+ String.format("%.2f",TotalPayment));
		
		
		
		
		
		
	}

}
