class Main {
  public static void main(String[] args) {
    Dog dog = new Dog("Dog", "female");
    Cat cat= new Cat("Smoky", "male");
    Person person = new Person("Bob", dog);
    Person p2 = new Person("Rob", cat);

    System.out.println(person);
    System.out.println(p2);
  }
}