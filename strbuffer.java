import java.lang.String;
class strbuffer//String Buffer
{
public static void main(String args[])
{
System.out.println("String Buffer Class:-");

//Length()
StringBuffer str=new StringBuffer("pretty like");
int len=str.length();
System.out.println("Length is:"
+ len);

StringBuffer str1= new StringBuffer("moon");
int len1=str1.length();
System.out.println("Length is:"
+ len1);
 
//Capacity()
int cap=str1.capacity();
System.out.println("Capacity of String:"+ cap);

StringBuffer str2=new StringBuffer("dodiya mahi ");
int cap2=str2.capacity();
System.out.println("Capacity of String:"+ cap2);

//Append()
str.append(" " +"foggy forest,");
System.out.println("Append Method:-");
System.out.println(str);
str.append(" "+"star!!");
System.out.println(str);

//insert()
System.out.println("Insert Method:-");
str2.insert(0,"Welcome,");
System.out.println(str2);
str2.insert(20,"our page");
System.out.println(str2);

//reverse()
//str1.reverse();
System.out.println("Reverse Method:-");
//System.out.println(str1);
//str2.reverse();
//System.out.println(str2);

//delete()
System.out.println("Delete Method:-");
str2.delete(0,8);
System.out.println(str2);

//deleteCharAt()
System.out.println("DeleteCharAt Method:-");
str2.deleteCharAt(10);
System.out.println(str2);

//replace()
System.out.println("Replace Method:-");
str2.replace(11,20,"Tutorial");
System.out.println(str2);





}
}
