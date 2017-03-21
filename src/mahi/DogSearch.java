package mahi;
public class DogSearch {

 public static void main(String[] args) {
    //This code will not compile correctly until you fix it.
    //
    //We are trying to count the number of times the word
    //dog appears in some input text, but we can't seem to
    //remember the appropriate method call in the String class,
    //and are not sure our approach will work.
    //task: Use the JDK documentation to help us finish the code,
    //then discuss the ambiguity in the problem description, and
    //reword it to remove the ambiguity in the space provided below.

    /*
    // To fix this problem we need to use split(String str) method in String class to split the words into dog and rest of the words 
     //It stores in an array which contains number of dog words and rest. Here we count only dogs.
      
      // Ambiguity problem:
	//The ambiguity in this problem is whether Dog or Doglips is taken into count or not.
    //It is not clear how to handle case sensitive ("Dog vs "dog"), strings with dog contains such as Dogman, Doglips.
   
    //To remove the ambiguity:
      //Here we want to count the number of times "dog" appears anywhere within the string regardless of case letter.
    //still we want to count that as dog. To do this we should change the input string into same case letter either upper case or lower case.  
    //If a word contains "dog" it still counts (e.g. "Dogman" or "Doglips").
    

    */

    String input = new String("The Dogman was no ordinary dog, nor man, but rather a peculiar dog-like man who barked like a dog, and panted like a dog, he even ate like a dog.  He owned a dog named Doglips, and interestingly enough, his favorite food was hotdogs.");
    System.out.println(input);
    int count = 0;
    System.out.print("Counting dogs: ");  
    String str1= input.toLowerCase();// changing the input string into lower case.
    String[] str = str1.split("dog");// split the words which contains dog
    count = str.length-1; // counting the dog strings by removing(neglecting the rest string) from array
   System.out.println("The word \"dog\" appears " + count + " times.");
  } 
}

