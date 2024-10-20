public class School {
    private String name;
    private  int numberOfStudents;

    public School(String name,int numberOfStudents){
this.name = name;
this.numberOfStudents = numberOfStudents;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String toString(){
        return "School{name : " + name + "numberOfStudents : " + numberOfStudents +'}';
    }
}
