//copy constructor

class galexy
{
int star;
int planet;

galexy(int s,int pl){

 star=s;
 planet=pl;
 }

galexy(galexy g){
 star=g.star;
 planet=g.planet;
 
}
void display(){
System.out.println(star+" "+planet);
}

}

class coppy
{
public static void main(String args[])
{
galexy o=new galexy(5,9);
galexy o1=new galexy(o);
o.display();
o1.display();
}
}

 