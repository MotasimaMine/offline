package TestCar;

/**
 * Created by DELL on 9/18/2015.
 */
public class Driver {
        private String name;
        private int age;
        private String country;

    public Driver() {

    }

    public Driver(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Driver(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getCountry(){
        return this.country;
    }

    public int getAge(){
        return this.age;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void print(){
        System.out.println(this.name+" Age:"+this.age+" Country:"+this.country);
    }

}
