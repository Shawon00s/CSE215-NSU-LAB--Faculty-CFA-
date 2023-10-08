/*
    Author: Sudipto Roy Shawon
    North South University
    Computer Science & Engineering
*/

class Friend{
	String name;
	int age;
	String dept;
	String address;
	
	Friend(){}
	Friend(String name,int age, String dept, String address){
		this.name=name;
		this.age=age;
		this.dept=dept;
		this.address=address;
	}
	public String toString() {
		//return "Name:"+" "+name+" Age:"+" "+age+" Depertment:"+dept+" "+"Address: "+address;
		return "My friend's name is "+name+", his/her age is "+age+", his/her depertment is "+dept+" and he/she lives in "+address+".";
	}
}
public class Driver {
	public static void main(String[] args) {
		Friend obj=new Friend("Shawon",21,"CSE","Sylhet");
		//System.out.println(obj.name+" "+obj.age+" "+obj.dept+" "+obj.address);
		//System.out.println(obj.toString());
		System.out.println(obj);
		String s1="Sudipto";
		String s2="Shawon";
		String s3=" Roy";
		String s4="Hey there how are you";
		String[] s5=s4.split(" ");
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		//System.out.println(s1.trim());
		System.out.println(s1.concat(s3));
		System.out.println(s1.indexOf("i"));
		for(String a:s5)
		System.out.println(a);
		
	}
}
