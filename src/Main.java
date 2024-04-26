import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void problem(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one line of words (S) : ");
        String kalimat = scanner.nextLine().toLowerCase();
        ArrayList<String> vowels = new ArrayList<>();
        ArrayList<String> consonant = new ArrayList<>();

        for (int i=0;i<kalimat.length();i++){
            if (kalimat.charAt(i)=='a'||kalimat.charAt(i)=='i'||kalimat.charAt(i)=='u'||
                    kalimat.charAt(i)=='e'||kalimat.charAt(i)=='o'){
                vowels.add(String.valueOf(kalimat.charAt(i)));
            }else if(kalimat.charAt(i)>='a'&&kalimat.charAt(i)<='z') {
                consonant.add(String.valueOf(kalimat.charAt(i)));
            }
        }

        for (int i =0;i<vowels.size();i++){
            for (int j = i;j<vowels.size();j++){
                if (vowels.get(i).equals(vowels.get(j))){
                    for (int k=j;k>i;k--){
                        vowels.set(k, vowels.get(k-1));
                    }
                }
            }
        }

        for (int i =0;i<consonant.size();i++){
            for (int j = i;j<consonant.size();j++){
                if (consonant.get(i).equals(consonant.get(j))){
                    for (int k=j;k>i;k--){
                        consonant.set(k, consonant.get(k-1));
                    }
                }
            }
        }

        System.out.println("Vowel Characters :");
        for (int i = 0;i< vowels.size();i++){
            System.out.print(vowels.get(i));
        }
        System.out.println();
        System.out.println("Consonant Characters :");
        for (int i = 0;i< consonant.size();i++){
            System.out.print(consonant.get(i));
        }
    }
    static void psbb(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of families : ");
        Integer keluarga = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input the number of members in the family : ");
        String satuan = scanner.nextLine();
        String[] arr = satuan.split(" ");
        Integer total = 0;
        Integer bus = 0;

        if (keluarga==arr.length) {
            for (int i = 0; i < arr.length; i++) {
                total = total + (Integer.valueOf(arr[i]));
            }

            while (total >= 4) {
                bus++;
                total = total - 4;
            }
            if (total > 0) {
                bus++;
                total = 0;
            }
            System.out.println("Minimum bus required is : "+bus);
        }else {
            System.out.println("Input must be equal with count of family");
        }
    }
    public static void main(String[] args) {
//        problem();
        psbb();
    }
}