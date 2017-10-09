import java.io.*;
class health_care
{
    static int sum;
    static void meth()throws Exception
    {
        welcome w=new welcome();
        health_care K=new health_care();
        System.out.println("****************************************************");
        System.out.println("you have chosen health care");
        System.out.println(" a wide variety of health care appliances are available");
        System.out.println("curently we have these health care appliances");
        System.out.println("1] BP monitor");
        System.out.println("2] accucheck sugar level monitor");
        System.out.println("***************************************************");
        System.out.println("which one would you like to buy");
        BufferedReader mr=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(mr.readLine());
        if(n==1)
        {System.out.println("you have chosen BP monitor");
            System.out.println("the price is=2100");
            System.out.println("would you like to buy");
            String a1="yes";
            String a2="no";
            BufferedReader ar=new BufferedReader(new InputStreamReader(System.in));
            String a=ar.readLine();
            if(a.equals(a1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+2100;
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
        {System.out.println("you have chosen accucheck sugar level monitor");
            System.out.println("the price is=1200");
            System.out.println("would you like to buy");
            String c1="yes";
            String c2="no";
            BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
            String c=cr.readLine();
            if(c.equals(c1))
            {
                System.out.println("the product has been added to the shopping cart");
                sum=sum+1200;
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
    }
}

