/**
Using associative Array in java

**/
import java.util.HashMap;
import java.util.Collections;
public class Main {

  public static void main(String[] args) {
  int sum=0;
  int total=0;
HashMap <String, Integer> item = new HashMap <String, Integer>();
item.put("Bike",100);
item.put("TV",200);
item.put("Album",10);
item.put("Book",5);
item.put("Phone",500);
item.put("Computer",1000);
 int min=Collections.min(item.values());
 int max=Collections.max(item.values());
 
for (String i :item.keySet()) {
int price=item.get(i);

//Question 1
if(price==min)
{
System.out.println("1.Filter and show the product that will be\n bought when you don't have much money \n I mean Cheap one\n");
 System.out.println("name: " + i + "; Price: " +price);
 }
 //Question 2
 if(price==max)
 {
 System.out.println("\n2 .Filter and show the product that\n will be expensive in the array\n");
 System.out.println("name: " + i + "; Price: " +price);
 }

if(price>=10)
{
total+=price;
 }
 sum+=price;
    }
    //Question 3
    
    System.out.println("\n 3.Calculate the full price of all\nproduct combined\n");
    System.out.println(sum);
    
    //Question 4
   System.out.println("\n 4.Calculate the full price of all product \ncombined and remove product that are under the 10\n dollar\n");
    System.out.println(total);
} 
  }

