public class A {
    public static void main(String[] args) {
      Person2 p1=new Person2("FGSJ",88);
      Person2 p2=new Person2("FGSJ",88);
      System.out.println(p1.equals(p2));
      System.out.println(p2==p1);
    }
}
