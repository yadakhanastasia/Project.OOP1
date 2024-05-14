public class Visitors {
    private String name;
    private int age;
    private String regularVisitor;
    private Restaurant restaurant;
    public Visitors(String name, int age, String regularVisitor){
        this.name = name;
        this.age = age;
        this.regularVisitor = regularVisitor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegularVisitorVisitor() {
        return regularVisitor;
    }

    public void setRegularVisitor(String frequentVisitor) {
        this.regularVisitor = frequentVisitor;
    }
    public void restaurantinfo(){
        restaurant.restaurantinfo();
    }

}
