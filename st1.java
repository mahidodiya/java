public class st1
{
public static void main(String args[])
{
  char[] ch={'m','a','h','i'};
  String str="Good,Night";
  String str1=new String(ch);
  System.out.println(str);
  String str2="Good";
//charArray()
  for(int i=0;i<ch.length;i++)
  System.out.println(ch[i]);
  
//length()
System.out.println("Length is:"+(str.length()));
  System.out.println("Length is:"+(str1.length()));
  
//concat()
System.out.println("concatation is:"+(str1.concat(str)));

//Contain()
System.out.println("contains ? :"+(str.contains(str2)));
System.out.println("contains ? :"+(str.contains(str1)));

//charAt() 
System.out.println("Index of specifec Charactar :"+(str.charAt(8)));
System.out.println("Index of specifec Charactar :"+(str1.charAt(0)));
System.out.println("Index of specifec Charactar :"+(str2.charAt(3)));
   
//Split()
String [] obj= str.split(",");
for(String s:obj){
System.out.println(s);
}
String jk="I purpul you!I fine";
String [] j= jk.split("!");
for(String k:j){
System.out.println(k);
}

//comparison
String m="mahi";
String m1="mahii";
String m2="mahi";
//test(m==m1);
System.out.println("Comparison:-");

System.out.println(m.equals(m2));
System.out.println(m2.compareTo(m));
System.out.println(m.equals(m1));

//substring
System.out.println("substring:-");
System.out.println(str.substring(5));
System.out.println(str.substring(3));
System.out.println(str.substring(2));
System.out.println(str.substring(0,4));
System.out.println(str.substring(7));





}
}
