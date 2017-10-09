
import java.io.*;
class welcome
{
    public void wel()throws Exception
    {
        System.out.println("\u000c");
        welcome w=new welcome();
        System.out.println("w     w eeeeeeeeeeeeee  l               cccccc     ooo    m        m eeeeeeeeeee");
        Thread.sleep(200);
        System.out.println("w     w e               l             c           o    o  m m    m m e      ");
        Thread.sleep(200);
        System.out.println("w     w eeeeeeeeeeeeee  l             c          o      o m  m  m  m eeeeeeeeeee");
        System.out.println("w  w  w e               l             c           o    o  m   m    m e      ");
        Thread.sleep(200);
        System.out.println("w  w  w eeeeeeeeeeeeee  llllllllllllll  ccccccc     ooo   m        m eeeeeeeeeee");
        Thread.sleep(200);
        System.out.println("**********************************************************");
        Thread.sleep(200);
        System.out.println("*              THE ELECTRONIC MEGASTORE                  *");
        Thread.sleep(200);
        System.out.println("**********************************************************");
        Thread.sleep(200);
        System.out.println("* VARIED VARIETY OF ELECTRONIC APPLIANCES AVAILABLE 24/7 *");
        Thread.sleep(200);
        System.out.println("**********************************************************");
        Thread.sleep(200);
        System.out.println("**********************************************************");
        Thread.sleep(200);
        System.out.println("**********************************************************");
        Thread.sleep(200);
        System.out.println("**********************************************************");
        Thread.sleep(200);
        System.out.println("**********************************************************");
        Thread.sleep(200);
        System.out.println("* our store has been voted as no1 electronic store       *");
        Thread.sleep(200);
        System.out.println("**********************************************************");
        Thread.sleep(2000);
        System.out.println(" some of the electronics are");
        int a=1;
        System.out.println("1] mobiles");
        Thread.sleep(200);
        int b=2;
        System.out.println("2] laptops");
        Thread.sleep(200);
        int c=3;
        System.out.println("3] televisions");
        Thread.sleep(200);
        int d=4;
        System.out.println("4] music systems");
        Thread.sleep(200);
        int e=5;
        System.out.println("5] cameras");
        Thread.sleep(200);
        int f=6;
        System.out.println("6] tablets");
        Thread.sleep(200);
        int g=7;
        System.out.println("7] dvd ");
        Thread.sleep(200);
        int h=8;
        System.out.println("8] software");
        Thread.sleep(200);
        int i=9;
        System.out.println("9] gaming and consoles");
        Thread.sleep(200);
        int j=10;
        System.out.println("10] computer accessories");
        Thread.sleep(200);
        int k=11;
        System.out.println("11] health care devices");
        Thread.sleep(200);
        int l=12;
        System.out.println("12] to go to shop kart");
        Thread.sleep(200);
        System.out.println("13] to exit");
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
        if(n==12)
        {
            shoplistm S=new shoplistm();
            S.meth();
            list L=new list();
            L.meth();

        }
       
}
}

