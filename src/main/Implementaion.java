package main;

public class Implementaion {

    public static void main(String[] args) {
      Student obj = new Student();

      obj.setRollNumber(12);K
      obj.setStudentId(1124);
      obj.setName("Arjun Reddy");
      obj.setAddress(" karimnagar,Telanagana ,India");
      obj.setAge(21);
      obj.setEmail("arjun@123");
      obj.setInsituteName("NIIT");

      System.out.println("Name = " + obj.getName());
      System.out.println("Roll number = " + obj.getRollNumber());
      System.out.println("StudentId = " + obj.getStudentId());
      System.out.println("Age = " + obj.getAge());
      System.out.println("Address = " + obj.getAddress());
      System.out.println("Email = " + obj.getEmail());
      System.out.println("Institute Name = " + obj.getInsituteName());

    }
}
