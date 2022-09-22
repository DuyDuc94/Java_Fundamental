//Count all vowels in a string.
// Vowel Letters:  U, E, O, A, I
// Consonant Letters: B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y, Z.

import java.util.Scanner;

public class Ws2o7 {

    static int countVowels(String s){
        int count =0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'u' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'a' || s.charAt(i) == 'i' ) count +=1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countVowels(s));
    }
}
