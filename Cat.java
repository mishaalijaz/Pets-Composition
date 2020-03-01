class Cat extends Pet{
    
  Fish fish = new Fish();

  Cat(String aName, String aGender){
    super(aName, aGender, "meow");
  }
    
  public String toString(){
    String printString;
    printString= "Cat:" +name;
    printString+= " has" +fish.toString();
    return printString;
  }
}
