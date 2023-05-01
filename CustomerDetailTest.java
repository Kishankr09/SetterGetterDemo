import java.util.Scanner;
class Customer{
	int accNo;
	float bal;
	String custName, accType;
	void setAccNo(int aNo) {
		accNo = aNo;
	}
	void setBal(float b) {
		bal = b;
	}
	void setCustName(String cName) {
		custName = cName;
	}
	void setAccType(String AcType) {
		accType = AcType;
	}
	int getAccNo() {
		return accNo;
	}
	float getBal() {
		return bal;
	}
	String getCustName() {
		return	custName;
	}
	String getAccType() {
		return accType;
	}
}
class InsCustomer{
	void insert(Customer c) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Customer Name :");
		c.custName = s.nextLine();
		System.out.println("Enter The Account Number :");
		c.accNo = Integer.parseInt(s.nextLine());
		System.out.println("Enter The Account Type :");
		c.accType = s.nextLine();
		System.out.println("Enter The Account balance :");
		c.bal = s.nextFloat();
	}
}
class Display1{
	void dis(Customer c) {
		System.out.println("Customer Name : "+c.getCustName());
		System.out.println("Costomer Account Number : " + c.getAccNo());
		System.out.println("Account Type : "+c.getAccType());
		System.out.println("Account Balance : "+c.getBal());
	}
}
public class CustomerDetailTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		InsCustomer ins = new InsCustomer();
		ins.insert(c);
		Display1 d = new Display1();
		d.dis(c);

	}

}
