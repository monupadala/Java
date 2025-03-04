public class foodOrder {
    String name;
    int quantity;

    foodOrder() {
        this.name = "Burger";
        this.quantity = 1;
    }

    foodOrder(String name) {
        this.name = name;
        this.quantity = 1;  
    }

    foodOrder(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    void showOrder(){
        System.out.println("Name: " + name + "\nQuantity: " + quantity);
    }

    public static void main(String[] args) {
        foodOrder obj1 = new foodOrder();
        foodOrder obj2 = new foodOrder("Burger");
        foodOrder obj3 = new foodOrder("Chicken noodles", 2);

        obj1.showOrder();
        obj2.showOrder();
        obj3.showOrder();
    }
}
