import java.io.*;
class DVD
{
    static int sum;
    static void meth()throws Exception
    {
        welcome w=new welcome();
        DVD G=new DVD();
        System.out.println("****************************************************");
        System.out.println("you have chosen dvd's");
        System.out.println(" a wide variety of dvd's are available");
        System.out.println("curently we have these dvd,s");
        System.out.println("1] philips bp2100 blu ray");
        System.out.println("2] sony dvp-sr760");
        System.out.println("3] panasonic dvd s485");
        System.out.println("4] samsung e370 dvd");
        System.out.println("***************************************************");
        System.out.println("which one would you like to buy");
        BufferedReader mr=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(mr.readLine());
        if(n==1)
        {System.out.println("you have chosen  philips bp2100 blu ray ,good choice");
            System.out.println("the price is=24,650");
            System.out.println("would you like to buy");
            String a1="yes";
            String a2="no";
            BufferedReader ar=new BufferedReader(new InputStreamReader(System.in));
            String a=ar.readLine();
            if(a.equals(a1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+24650;
                System.out.println("would you like to go to the shopkart(yes/no)");
                BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
                String A2=br2.readLine();
                if(A2.equals(a1))
                { 
                    shoplistm S=new shoplistm();
                    S.meth();
                    System.out.println("******************************************************");
                    System.out.println("******************************************************");
                    Thread.sleep(3000);
                    System.out.println("would you like to continue shopping(yes/no)");
                    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
                    String A1=br1.readLine();
                    if(A1.equals(a1))
                    {
                        list L=new list();
                        L.meth();

                    }
                    if(A1.equals(a2))
                    { 
                        String b="yes";
                        String b1="no";
                        System.out.println("would you like to go to the main homepage(yes/no)");
                        BufferedReader cr2=new BufferedReader(new InputStreamReader(System.in));String C2=cr2.readLine();
                        if(C2.equals(b))
                        { 
                            w.wel();
                        }

                    }
                }
            }
             if(a.equals(a2))
            {
                list L=new list();
                L.meth();
            }
            else
            {
                System.out.println("wrong option");
                String b="yes";
                String b1="no";
                System.out.println("would you like to go to continue shopping(yes/no)");
                BufferedReader cr2=new BufferedReader(new InputStreamReader(System.in));String C2=cr2.readLine();
                if(C2.equals(b))
                { 
                    w.wel();
                }

            }
        }
        if(n==2)
        {System.out.println("you have chosen  sony dvp-sr760  ,classy");
            System.out.println("the price is=19000");
            System.out.println("would you like to buy");
            String c1="yes";
            String c2="no";
            BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
            String c=cr.readLine();
           if(c.equals(c1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+19000;
                System.out.println("would you like to go to the shopkart(yes/no)");
                BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
                String A2=br2.readLine();
                if(A2.equals(c1))
                { 
                    shoplistm S=new shoplistm();
                    S.meth();
                    System.out.println("******************************************************");
                    System.out.println("******************************************************");
                    Thread.sleep(3000);
                    System.out.println("would you like to continue shopping(yes/no)");
                    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
                    String A1=br1.readLine();
                    if(A1.equals(c1))
                    {
                        list L=new list();
                        L.meth();

                    }
                    if(A1.equals(c2))
                    { 
                        String b="yes";
                        String b1="no";
                        System.out.println("would you like to go to the main homepage(yes/no)");
                        BufferedReader cr2=new BufferedReader(new InputStreamReader(System.in));String C2=cr2.readLine();
                        if(C2.equals(b))
                        { 
                            w.wel();
                        }

                    }
                }
            }
             if(c.equals(c2))
            {
                list L=new list();
                L.meth();
            }
            else
            {
                System.out.println("wrong option");
                String b="yes";
                String b1="no";
                System.out.println("would you like to go to continue shopping(yes/no)");
                BufferedReader cr2=new BufferedReader(new InputStreamReader(System.in));String C2=cr2.readLine();
                if(C2.equals(b))
                { 
                    w.wel();
                }

            }
        }

        if(n==3)
        {System.out.println("you have chosen  panasonic dvd s485 ,excellent choice");
            System.out.println("the price is=12000");
            System.out.println("would you like to buy");
            String d1="yes";
            String d2="no";
            BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
            String d=dr.readLine();
           if(d.equals(d1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+12000;
                System.out.println("would you like to go to the shopkart(yes/no)");
                BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
                String A2=br2.readLine();
                if(A2.equals(d1))
                { 
                    shoplistm S=new shoplistm();
                    S.meth();
                    System.out.println("******************************************************");
                    System.out.println("******************************************************");
                    Thread.sleep(3000);
                    System.out.println("would you like to continue shopping(yes/no)");
                    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
                    String A1=br1.readLine();
                    if(A1.equals(d1))
                    {
                        list L=new list();
                        L.meth();

                    }
                    if(A1.equals(d2))
                    { 
                        String b="yes";
                        String b1="no";
                        System.out.println("would you like to go to the main homepage(yes/no)");
                        BufferedReader cr2=new BufferedReader(new InputStreamReader(System.in));String C2=cr2.readLine();
                        if(C2.equals(b))
                        { 
                            w.wel();
                        }

                    }
                }
            }
             if(d.equals(d2))
            {
                list L=new list();
                L.meth();
            }
            else
            {
                System.out.println("wrong option");
                String b="yes";
                String b1="no";
                System.out.println("would you like to go to continue shopping(yes/no)");
                BufferedReader cr2=new BufferedReader(new InputStreamReader(System.in));String C2=cr2.readLine();
                if(C2.equals(b))
                { 
                    w.wel();
                }

            }
        }

        if(n==4)
        {System.out.println("you have chosen samsung e370 dvd,an highly efficient dvd");
            System.out.println("the price is=17000");
            System.out.println("would you like to buy");
            String e1="yes";
            String e2="no";
            BufferedReader er=new BufferedReader(new InputStreamReader(System.in));
            String e=er.readLine();
            if(e.equals(e1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+17000;
                System.out.println("would you like to go to the shopkart(yes/no)");
                BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
                String A2=br2.readLine();
                if(A2.equals(e1))
                { 
                    shoplistm S=new shoplistm();
                    S.meth();
                    System.out.println("******************************************************");
                    System.out.println("******************************************************");
                    Thread.sleep(3000);
                    System.out.println("would you like to continue shopping(yes/no)");
                    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
                    String A1=br1.readLine();
                    if(A1.equals(e1))
                    {
                        list L=new list();
                        L.meth();

                    }
                    if(A1.equals(e2))
                    { 
                        String b="yes";
                        String b1="no";
                        System.out.println("would you like to go to the main homepage(yes/no)");
                        BufferedReader cr2=new BufferedReader(new InputStreamReader(System.in));String C2=cr2.readLine();
                        if(C2.equals(b))
                        { 
                            w.wel();
                        }

                    }
                }
            }
             if(e.equals(e2))
            {
                list L=new list();
                L.meth();
            }
            else
            {
                System.out.println("wrong option");
                String b="yes";
                String b1="no";
                System.out.println("would you like to go to continue shopping(yes/no)");
                BufferedReader cr2=new BufferedReader(new InputStreamReader(System.in));String C2=cr2.readLine();
                if(C2.equals(b))
                { 
                    w.wel();
                }

            }
        }
    }
}
