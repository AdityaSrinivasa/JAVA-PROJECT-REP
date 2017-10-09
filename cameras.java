import java .io.*;
class cameras
{
    static int sum;
    static void meth()throws Exception
    {
        welcome w=new welcome();
        cameras E=new cameras();
        System.out.println("***************************************************");
        System.out.println("you have chosen cameras");
        System.out.println(" a wide variety of cameras are available");
        System.out.println("curently we have these cameras");
        System.out.println("1] canon EOS 1100d SLR");
        System.out.println("2] nikon d5200 SLR");
        System.out.println("3] sony cyberShotdscw730");
        System.out.println("4] nikon coolpix l28");
        System.out.println("5] canon powershot sx5400");
        System.out.println("***************************************************");
        System.out.println("which one would you like to buy");
        BufferedReader mr=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(mr.readLine());
        if(n==1)
        {System.out.println("you have chosen canon EOS 1100d SLR,good choice");
            System.out.println("the price is=26,570");
            System.out.println("would you like to buy");
            String a1="yes";
            String a2="no";       
            BufferedReader ar=new BufferedReader(new InputStreamReader(System.in));
            String a=ar.readLine();
            if(a.equals(a1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+26570;
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
        {System.out.println("you have chosen  nikon d5200 SLR  ,classy");
            System.out.println("the price is=24950");
            System.out.println("would you like to buy");
            String c1="yes";
            String c2="no";
            BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
            String c=cr.readLine();
           if(c.equals(c1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+24950;
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
        {System.out.println("you have chosen sony cyberShotdscw730 ,excellent choice");
            System.out.println("the price is=6550");
            System.out.println("would you like to buy");
            String d1="yes";
            String d2="no";
            BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
            String d=dr.readLine();
            if(d.equals(d1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+6550;
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
        {System.out.println("you have chosen nikon coolpix l28,an highly efficient camera");
            System.out.println("the price is=5300");
            System.out.println("would you like to buy");
            String e1="yes";
            String e2="no";
            BufferedReader er=new BufferedReader(new InputStreamReader(System.in));
            String e=er.readLine();
            if(e.equals(e1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+5300;
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
        {System.out.println("you have chosen canon powershot sx5400,not a bad choice");
            System.out.println("the price is=10550");
            System.out.println("would you like to buy");
            String f1="yes";
            String f2="no";
            BufferedReader fr=new BufferedReader(new InputStreamReader(System.in));
            String f=fr.readLine();
            if(f.equals(f1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+10550;
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

