public class Main {
    public static void main(String[] args) {

        Produckt produckt = new Produckt();
        produckt.name=" Laptop";
        produckt.ıd=1;
        produckt.description="Asus Laptop";
        produckt.price=5000;
        produckt.stockAmount=3;
        ProdactManager prodactManager=new ProdactManager();
        prodactManager.Add(produckt);


    }

}
