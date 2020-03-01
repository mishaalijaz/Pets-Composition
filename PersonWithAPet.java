class Person{
 
  String name;
  Pet pet;

  Person(String PName, Pet aPet){
		name = PName;
    pet = aPet;
	}
  
  void setName(String aName){
    name=aName;
  }
 
  void SetPet(String pName){
    name=pName;
  }
  
  public String toString(){
    String printString;
    printString= "Person:" +name;
    printString+= "\n has " +pet.toString();
    return printString;
  }
}