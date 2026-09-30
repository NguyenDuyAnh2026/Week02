package bai2_7;

public class Inventory {
    private Product[] items;
    public Inventory(Product[] intialItem){
        this.items = intialItem;
    }

    public void printItems(){
        for(Product p : items){
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        Product[] arr = new Product[2];
        arr[0] = new Product(101, "MSI", 1000);
        arr[1] = new Product(102, "Thinkpad", 1500);
        Inventory kho = new Inventory(arr);
        kho.printItems();
        System.out.println("----------------------------");
        arr[0].setPrice(5000); //sua gia tu ben ngoai kho
        kho.printItems();
    }
}
