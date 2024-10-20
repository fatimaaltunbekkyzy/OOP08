public class Car {
       private String name;
       private String brand;// Булар полелер
       private int price;

       public Car (String name,String brand,int price){//пустой консруктор
this.name = name;
this.brand = brand;
this.price = price;
       }
       public void setName(String name){//Сет метод бизге маани беруу учун жардам берет .
           this.name = name;
       }
       public String getName(){//Гет метод бизге маани алуу  учун жардам берет .
              return name;
       }
       public void setBrand(String brand){
              this.brand = brand;
       }
       public String getBrand(){
              return brand;
       }
       public void setPrice(int price){
              this.price = price;
       }
       public int getPrice(){
              return  price;
       }
public String toString(){
              return "Car{name : " + name + "brand : " + brand + "price : " + price +'}';
}
}
