import java.io.*;
class list
{
    static void meth()throws Exception
    {
        list L=new list();
        System.out.println("**********************************************");
        System.out.println("**********************************************");
        System.out.println(" some of the electronics are");
        welcome w=new welcome();
        int a=1;
        System.out.println("1] mobiles");
        int b=2;
        System.out.println("2] laptops");
        int c=3;
        System.out.println("3] televisions");
        int d=4;
        System.out.println("4] music systems");
        int e=5;
        System.out.println("5] cameras");
        int f=6;
        System.out.println("6] tablets");
        int g=7;
        System.out.println("7] dvd ");
        int h=8;
        System.out.println("8] software");
        int i=9;
        System.out.println("9] gaming and consoles");
        int j=10;
       System.out.println("10] computer accessories");
        int k=11;
       System.out.println("11] health care devices");
       System.out.println(                               );
       System.out.println("enter the number of the paticular appliance that you want to buy");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
    if(n==1)
    {
        mobiles A=new mobiles();
        A.meth();
      
    }
    if(n==2)
    {
        laptops B=new laptops();
        B.meth();
    }
    if(n==3)
    {
        television C=new television();
        C.meth();
        
    }
    if(n==4)
    {
        music_system D=new music_system();
        D.meth();
    }
    if(n==5)
    {
        cameras E=new cameras();
        E.meth();
    }
    if(n==6)
    {
        tablets F=new tablets();
        F.meth();
    }
    if(n==7)
    {
        DVD G=new DVD();
        G.meth();
    }
    if(n==8)
    {
        software H=new software();
        H.meth();
    }
    if(n==9)
    {
        gaming I=new gaming();
        I.meth();
    }
    if(n==10)
    {
        accesories J=new accesories();
        J.meth();
    }
    if(n==11)
    {
        health_care K=new health_care();
        K.meth();
    }
}
}
    
    
 




