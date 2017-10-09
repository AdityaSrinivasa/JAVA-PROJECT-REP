import java.io.*;
class sumadd
{  
    void meth()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int q=n;
        double sum=0;
        while(q!=0)
        {
            int r=q%10;
            q=q/10;
            sum=sum+r;

        System.out.println("the sum of the digits of the given no"+n+"is="+sum);
    }
}
}
