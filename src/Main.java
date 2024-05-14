//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Noa", "st. Zelena 33, Lviv, Ukraine", 4);
        Visitors visitors = new Visitors("Olena", 23, "Is a regular visitor");
        Dish dish = new Dish("Salat", 250.0);
        Menu menu = new Menu("Chinese", 67);
        System.out.println("Visitor: " + visitors.getName() + "Age: " + visitors.getAge() + "Is a regular visitor: " + visitors.getRegularVisitorVisitor());
        System.out.println("Restaurant information:");
        System.out.println("Restaurant name:" + restaurant.getName());
        System.out.println("Location: " + restaurant.getLocation());
        System.out.println("Number of meals: " + menu.getNumberofmeals());
        System.out.println("Cuisine: " + menu.getCuisine());
        System.out.println("Rating: " + restaurant.getRating());
    }
    }

}