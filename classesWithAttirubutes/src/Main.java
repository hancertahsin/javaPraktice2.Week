public class Main {
    public static void main(String[] args) {

        Produckt produckt = new Produckt(1,"Laptop","Asus Laptop",3000,2,"Siyah");


                ProdactManager prodactManager=new ProdactManager();
        prodactManager.Add(produckt);

        System.out.println(produckt.getKod());
    }

}
