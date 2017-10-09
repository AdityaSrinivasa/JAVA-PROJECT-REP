import java.io.*;
class television
{
    static int sum;
    static void meth()throws Exception
    {
        welcome w=new welcome();
        television C=new television();

        System.out.println("*************************************************");
        System.out.println("you have chosen televisions");
        System.out.println("An excellent variety of televisions are available");
        System.out.println("curently we have these televisions");
        System.out.println("1] SONY fhd smart tv");
        System.out.println("2] Samsung LED tv");
        System.out.println("3] LG 1080HD tv");
        System.out.println("4] SONY bravia triluminous");
        System.out.println("5] Sony 4K");
        System.out.println("***************************************************");
        System.out.println("which one would you like to buy");
        BufferedReader mr=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(mr.readLine());
        if(n==1)
        {
            System.out.println("you have chosen SONY fhd smart tv ,good choice");
            System.out.println("the price is=70,000");
            System.out.println("would you like to buy");
            String a1="yes";
            String a2="no";
            BufferedReader ar=new BufferedReader(new InputStreamReader(System.in));
            String a=ar.readLine();
            if(a.equals(a1))
            { 
                System.out.println("the product has been added to the shopping cart");
                sum=sum+70000;
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
            {System.out.println("you have chosen Samsung LED tv ,classy");
                System.out.println("the price is=67,000");
                System.out.println("would you like to buy");
                String c1="yes";
                String c2="no";
                BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
                String c=cr.readLine();
                if(c.equals(c1))
                {
                    System.out.println("the product has been added to the shopping cart");
                    sum=sum+67000;
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
            {System.out.println("you have chosen LG 1080HD tv ,excellent choice");
                System.out.println("the price is=82,000");
                System.out.println("would you like to buy");
                String d1="yes";
                String d2="no";
                BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
                String d=dr.readLine();
                if(d.equals(d1))
                {
                    System.out.println("the product has been added to the shopping cart");
                    sum=sum+82000;
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
            {System.out.println("you have chosen SONY bravia triluminous,an highly efficient television");
                System.out.println("the price is=92,000");
                System.out.println("would you like to buy");
                String e1="yes";
                String e2="no";
                BufferedReader er=new BufferedReader(new InputStreamReader(System.in));
                String e=er.readLine();
                if(e.equals(e1))
                {
                    System.out.println("the product has been added to the shopping cart");
                    sum=sum+92000;
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
            if(n==5)
            {System.out.println("you have chosen Sony 4K,not a bad choice");
                System.out.println("the price is=90,000");
                System.out.println("would you like to buy");
                String f1="yes";
                String f2="no";
                BufferedReader fr=new BufferedReader(new InputStreamReader(System.in));
                String f=fr.readLine();
                if(f.equals(f1))
                {
                    System.out.println("the product has been added to the shopping cart");
                    sum=sum+90000;
                    System.out.println("would you like to go to the shopkart(yes/no)");
                    BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
                    String A2=br2.readLine();
                    if(A2.equals(f1))
                    { 
                        shoplistm S=new shoplistm();
                        S.meth();
                        System.out.println("******************************************************");
                        System.out.println("******************************************************");
                        Thread.sleep(3000);
                        System.out.println("would you like to continue shopping(yes/no)");
                        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
                        String A1=br1.readLine();
                        if(A1.equals(f1))
                        {
                            list L=new list();
                            L.meth();

                        }
                        if(A1.equals(f2))
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
                if(f.equals(f2))
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
}

