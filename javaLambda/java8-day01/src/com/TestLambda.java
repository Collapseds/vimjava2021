package src.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestLambda{
  
  List<Employee> employees = Arrays.asList(
      new Employee("张三", 18, 8888.88),
      new Employee("李四", 39, 6666.88),
      new Employee("王五", 64, 8765.88),
      new Employee("赵六", 12, 9999.88),
      new Employee("田七", 19, 7777.88)
      );

  public void test1(){

    //原来的匿名对象类

    Comparator<Integer> com = new Comparator<Integer>(){
      @Override
      public int compare(Integer o1, Integer o2) {
          // TODO Auto-generated method stub
          return Integer.compare(o1, o2);
      }
    };

    TreeSet<Integer> set = new TreeSet<>(com);

    for (Integer integer : set) {
      System.out.println(integer);
    }

    //Lambda 表达式
    
    Comparator<Integer> com1 = (x, y) -> Integer.compare(x, y);
    TreeSet<Integer> ts = new TreeSet<>(com1);

    for (Integer integer : ts) {
      System.out.print(integer);
    }
  }

  public List<Employee> filterEmployees(List<Employee> list){
    List<Employee> emps = new ArrayList<>();
    for (Employee emp : list) {
      if(emp.getAge() >= 35){
        emps.add(emp);
      }
    }
    return emps;
  }

  public void test2(){
    List<Employee> emps = filterEmployees(employees);

    for (Employee employee : emps) {
      System.out.println(employee);
    }
  }

  public void test3(){}

  public static void main(String[] args) {
    new TestLambda().test2();
  }
}

