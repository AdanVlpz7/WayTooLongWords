import java.util.Scanner;

public class Main {

  public static String changeWord(String temp){
    String newWord;
    int wordLength = temp.length();
    char c1 = temp.charAt(0);
    char c2 = temp.charAt(wordLength-1);
    newWord = c1 + String.valueOf(wordLength-2) + c2;
    return newWord;
  }
  public static void checkWords(String[] wordsArray,int length){
    //System.out.println("Checando arreglo...\n");
    for(int i = 0; i <= length; i++){
      if(wordsArray[i].length()>10)
        wordsArray[i] = changeWord(wordsArray[i]);
    }    
  }

  public static void printWords(String[] wordsArray,int length){
    //System.out.println("Imprimiendo arreglo...\n");
    for(int i = 0; i <= length; i++){
      System.out.println(wordsArray[i]);
    }
  }
  public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int numWords;
    String temp;
    //leer numWords;
    //System.out.println("Introduzca el numero de palabras a leer\n");
    numWords = leer.nextInt();
    String[] wordsArray = new String[numWords+1];
    //for
    int i = 0;
    do{
      temp = leer.nextLine();
      //agregar las palabras a un arreglo
      wordsArray[i] = temp;
      i++;
    }while(i <= numWords);

    checkWords(wordsArray,numWords);
    printWords(wordsArray,numWords);
    //imprimir arreglo
    leer.close();
  }
}