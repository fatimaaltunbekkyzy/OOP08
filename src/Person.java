public class Person {
    private String name;
   private int age;
   private String nationality;

   public Person(String name,int age,String nationality){
this.name = name;
this.age = age;
this.nationality = nationality;
   }
   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }
   public void setAge(int age){
       this.age = age;
   }
   public int getAge(){
       return age;
   }
   public void setnationality(String nationality){
       this.nationality = nationality;
   }
   public String getnationality(){
       return  nationality;
   }
public String toString(){
       return "Person{name : " + name + "age : " +" age : " + age + "nationality : " + nationality +'}';
}

    }

