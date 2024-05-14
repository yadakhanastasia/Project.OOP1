public class Restaurant {
    private String name;
    private String location;
    private int rating;

    public Restaurant(String name, String location, int rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public void restaurantinfo(){
        System.out.println("Restaurant name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Rating: " + rating);
    }
}


