import java.util.*; //Jakub Skrzynecki
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int liczba = scan.nextInt();
    int dlugosc = String.valueOf(liczba).length();
   int suma=0;
    for (int i=0; i<=dlugosc;i++){
      int cyfra= liczba%10;
      suma= suma + cyfra;
      liczba=liczba/10;
    }
    System.out.println("Suma liczb twojej cyfry to: "+suma);
    
  }
}