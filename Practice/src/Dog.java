public class Dog{

    private String name;
    private int weight;
    private int year;

    public Dog(){

    }
    public Dog (String name, int weight, int year){
        this.name = name;
        this.weight = weight;
        this.year = year;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String obtainSize(){
        String size;
        if(this.weight <= 10) {
            size = "small";
        }else if(weight > 10 && weight <= 30){
            size = "medium";
        }else{
            size = "large";
        }
        return size;
    }


}
