import java.io.*;
public class writebyte
{
public static void main(String args[])
{
File f1=new File("input.tex");
FileOutputStream outfile=null;

byte cities []={'I','L','O','V','E','J','A','V','A'};

try
{
outfile.write(cities);
}
catch(IOException e)
{
System.out.println(e);
System.exit(-1);
}
System.out.println("Write Byte");
System.out.println("Thank You...!!");
}
}