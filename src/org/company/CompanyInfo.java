package org.company;

public class CompanyInfo {

	public void companyName() {
		System.out.println("Company Name : Infosys");
	}
		public void companyId() {
			System.out.println("Company ID: ij456");
		}
		public void companyAddress() {
			System.out.println("Company Address: Tidel Park, Chennai");
		}
		
//Main Method
		public static void main(String[] args) {
			
			//object
			
			CompanyInfo c=new CompanyInfo();
			
			//method calling
			c.companyName();
			c.companyId();
			c.companyAddress();
			
		}
		
			
		

}
