import java.io.*;
class software
{
    static int sum;
    void meth()throws Exception
    {
        welcome w=new welcome();
        software H=new software();
        System.out.println("****************************************************");
        System.out.println("you have chosen software");
        System.out.println(" a wide variety of software's are available");
        System.out.println("curently we have these software's");
        System.out.println("1] microsoft windows 8");
        System.out.println("2] microsoft windows 7");
        System.out.println("3] norton antivirus");
        System.out.println("4] kaspersky antivirus");
        System.out.println("***************************************************");
        System.out.println("which one would you like to buy");
        BufferedReader mr=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(mr.readLine());
        if(n==1)
        {
            System.out.println("you have chosen  microsoft windows 8,good choice");
            System.out.println("the price is=7999");
            System.out.println("would you like to buy");
            String a1="yes";
            String a2="no";
            BufferedReader ar=new BufferedReader(new InputStreamReader(System.in));
            if(ar.equals(a1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+7999;
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
            
             if(ar.equals(a2))
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
        {System.out.println("you have chosen  microsoft windows 7,classy");
            System.out.println("the price is=5999");
            System.out.println("would you like to buy");
            String c1="yes";
            String c2="no";
            BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
            String c=cr.readLine();
           if(c.equals(c1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+5999;
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
        {System.out.println("you have chosen norton antivirus ,excellent choice");
            System.out.println("the price is=290");
            System.out.println("would you like to buy");
            String d1="yes";
            String d2="no";
            BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
            String d=dr.readLine();
             if(d.equals(d1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+290;
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
        {System.out.println("you have chosen  kaspersky antivirus,an highly efficient software");
            System.out.println("the price is=399");
            System.out.println("would you like to buy");
            String e1="yes";
            String e2="no";
            BufferedReader er=new BufferedReader(new InputStreamReader(System.in));
            String e=er.readLine();
            if(e.equals(e1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+399;
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
