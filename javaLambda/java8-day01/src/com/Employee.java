package src.com;

public class Employee{

  private String name;
  private int age;
  private double salary;

  public Employee(){
  }

  public Employee(String name, int age, double salary){
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public double getSalary(){
    return this.salary;
  }

  public void setSalary(double salary){
    this.salary = salary;
  }

  @Override
  public String toString(){
    return "Employee [Name = " + this.name + " age = " + this.age + " salary = " + this.salary + "]";
  }
}
