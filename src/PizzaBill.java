
public class PizzaBill {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int i;
		
		
		
		
		
		//item1.printDetail();
		 Pizza[] item1=new Pizza[5];
		item1[0]=new  Pizza("Chesse Pizza ",2,20);
		item1[1]=new Pizza("Mashroom Pizza",3,50);
		item1[2]=new  Pizza("Indian Pizza",1,20);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------PIZZA HUTT-------------------------------------------------");
		System.out.println("----------------------------------BILL-----------------------------------------------------");
	
		System.out.println("The Name of the Pizza      "+     "Quantity "   +   "   Price of Pizza  "  +   
		"    Total Price of Pizza:-");
		
		for(i=0;i<=2;i++)
		{
			total=total+item1[i].FindPrice();
			item1[i].printDetail();
			
			
		}
		System.out.println("-------------------------------------------------------------------------------------------");

		System.out.println("Total Amount:-    "+total);
		
			float amount=total,gst_amt;
			amount=(amount*8)/100;
			gst_amt=total+amount;
			System.out.println("GST(8%) AMOUNT:-     "+amount);
			System.out.println("GST(8%) After adding GST AMOUNT:-     "+gst_amt);
			System.out.println("----------------------------------THANK YOU ---------------------------------------------");
		
		
		
	}



}


















