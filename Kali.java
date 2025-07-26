class Dog{
    int no_of_eyes,no_of_legs;
    String breed;

    public void to_do(){
        System.out.println("Dog can bark.");
        System.out.println("Dog can bite.");
        System.out.println("Dog can run.");
    }

    Dog(int no_of_eyes,int no_of_legs){
        this.no_of_eyes=no_of_eyes;
        this.no_of_legs=no_of_legs;
    }
}

public class Kali{
    public static void main(String[] args) {
        Dog obj=new Dog(2,4);
        obj.to_do();
    }
}