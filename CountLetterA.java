import java.util.Scanner;

public class CountLetterA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();
        
        int count = countLetterA(input);
        
        if (count > 0) {
            System.out.println("A letra 'a' (ou 'A') aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (ou 'A') não aparece na string.");
        }
        
        scanner.close();
    }
    
    public static int countLetterA(String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();
        
        for (char c : lowerStr.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        
        return count;
    }
}
