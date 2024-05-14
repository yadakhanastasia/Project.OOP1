public class Menu {


        private String cuisine;
        private int numberofmeals;
        private boolean isVegetarianOptions;
        private Visitors visitors;
        public Menu (String cuisine,int numberofmeals) {
            this.cuisine = cuisine;
            this.numberofmeals = numberofmeals;
            this.isVegetarianOptions = true;
            this.visitors = null;
        }
        public String getCuisine() {
            return cuisine;
        }

        public void setCuisine(String cuisine) {
            this.cuisine = cuisine;
        }

        public int getNumberofmeals() {
            return numberofmeals;
        }

        public void setNumberofmeals(int numItems) {
            this.numberofmeals = numItems;
        }

        public boolean getisVegetarianOptions() {
            return isVegetarianOptions;
        }

        public void setisVegetarianOptions(boolean isVegetarianOptions) {
            this.isVegetarianOptions = isVegetarianOptions;
        }
        public void isVegetarianOptions(Visitors visitors){
            if(!isVegetarianOptions){
                this.visitors=visitors;
                this.isVegetarianOptions = true;
                System.out.println("Є вегетаріанські страви");
            }
        }




}
