class shoplistm
{
    static void meth()
    {
        shoplistm S=new shoplistm();
        mobiles A=new mobiles();
        laptops B=new laptops();
        television C=new television();
        music_system D=new music_system();
        cameras E=new cameras();
        tablets F=new tablets();
        DVD G=new DVD();
        software H=new software();
        gaming I=new gaming();
        accesories J=new accesories();
        health_care K=new health_care();
        int sum=mobiles.sum+laptops.sum+television.sum+music_system.sum+cameras.sum+tablets.sum+DVD.sum+software.sum+gaming.sum+health_care.sum+accesories.sum;   
        System.out.println("**************************************************************");
        System.out.println("    THE TOTAL PRICE OF THE APPLIANCES BOUGHT="+sum            );
        System.out.println("**************************************************************");
    }
}