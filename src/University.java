public class University {
  private String name;
  private  int establishedYear;//год оснавания

  public University(String name, int establishedYear){
    this.name = name;
            this.establishedYear = establishedYear;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setEstablishedYear(int establishedYear){
    this.establishedYear = establishedYear;
  }
  public int  getEstablishedYear(){
    return establishedYear;
  }
  public String toString(){
      return "University{name : " + name + "establishedYear : " + establishedYear +'}';
  }
    }

