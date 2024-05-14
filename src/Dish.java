public class Dish {
    private String name;
    private double price;
    private boolean isSpicy;
    private Visitors visitors;
    public Dish(String name, double price){
        this.name = name;
        this.price = price;
        this.isSpicy = spicy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsSpicy(){
        return isSpicy;
    }

    public void setSpicy(boolean isSpicy) {
        this.isSpicy = isSpicy;
    }
    public void spicy(Visitors visitors){
        if(!isSpicy){
            this.visitors = visitors;
            this.isSpicy = false;
            System.out.println("Страва не гостра");
        }
        else {
            System.out.println("Страва є гостра");
        }
    }

}
