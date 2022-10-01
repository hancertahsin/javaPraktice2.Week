public class Main {
    public static void main(String[] args) {

        Produckt produckt = new Produckt();
        produckt.setName("Laptop");
        produckt.setId(1);
        produckt.setDescription("Asus Laptop");
        produckt.setPrice(5000);
        produckt.setStockAmount(3);

                ProdactManager prodactManager=new ProdactManager();
        prodactManager.Add(produckt);

        System.out.println(produckt.getKod());
    }

}
