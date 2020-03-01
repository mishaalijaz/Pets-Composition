# Pets-Composition

Playing with basic Objected Oriented programming (OOP) concepts as a starter lab for Advanced Object-Oriented Design course for Masters level.

**Pet.java** -- An abstract class to represent the concept of a pet. A pet should have a name, a gender and a sound
(choose appropriate data-types for these).

**Dog.java** -- an implementation of the pet concept. A dog should have a "woof" sound, and it should have a Bone
(see Bone.java description below).

**Cat.java**  -- an implementation of the pet concept. A cat should have a "meoh" sound, and it should have a Fish
(see Fish.java description below).

**Bone.java** -- should be a minimal class which composes a String "$==$" which is its printString
(further, a toString() method should be implemented that returns the printString.

**Fish.java** -- similar to Bone.java only the printString is "}==*->"

**PersonWithAPet.java** -- should contain a class Person which contains a Pet reference. There should be a method to
setPet(:Pet) that accepts any subclass of Pet

**Runner.java** -- should be the main class that executes to create a Cat with a Fish, a Dog with a Bone,
- two Person objects (one with the Cat, one with the Dog, and prints both to screen using a a toString() method in Person
