//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //University деген Объектен учоо.
University  university1 = new University("Harvard",1636);
University  university2 = new University("Stanford",1885);
University  university3 = new University("MIT",1861);

// School деген  Объекттун учоо.
School school1 = new School("Tagai Acranov",500);
School school2 = new School("Shool 81",1000);
School school3 = new School("Kyrmanjan",6000);
//Car деген  Объекттун учоо.
Car car1 = new Car("Toyota Sequoia","Exeed",20000);
Car car2 = new Car("Toyota 4Runner","Lada",30000);
Car car3 = new Car("Toyota Tacoma","Geely",50000);
//Person деген  Объекттун учоо.
Person person1=  new Person ("Aisha",18,"Kyrgyz");
Person person2 =  new Person ("Khadijah",19,"Kyrgyz");
Person person3 =  new Person ("Safia",20,"Kyrgyz");

        System.out.println("University : ");
University[]university = { university1, university2,university3};
for(University numbers : university){
    System.out.println(numbers);
}
        System.out.println("School : ");
School[]school = { school1,school2,school3};
for(School schools : school){
    System.out.println(schools);
}
        System.out.println("Car : ");
        Car[]car={car1,car2,car3 };
for(Car cars : car){
    System.out.println(cars);
}
        System.out.println("Person : ");
Person [] people = {person1, person2, person3 };
for(Person person : people){
    System.out.println(person);
}
}


    }
