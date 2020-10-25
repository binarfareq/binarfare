import java.util.*;
class array{
	public static void main(String[]args){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number the neme");

	int n = sc.nextInt();
	char [] pit =new char[n];

	for(int x=0 ; x<pit.length ; x++){

		System.out.println("Enter character");
		char let = sc.next().charAt(0);
		System.out.println("this character "+x+"="+pit[x]+let);
		System.out.println("");
		pit[x]=let;
		}

	String name="";
		for(int x=0 ; x<pit.length ; x++)
			name+=pit[x];

	System.out.println("this name = " + name);

	}}