class Dog extends Pet{

  Bone bone = new Bone();

  Dog(String aName, String aGender){
    super(aName, aGender, "woof");
  }

  public String toString(){
    String printString;
    printString= "Dog:" +name;
    printString+= " has " +bone.toString();
    return printString;
  }
}