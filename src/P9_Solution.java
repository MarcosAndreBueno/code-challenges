public class P9_Solution {

    public boolean palindromeNumber(int number) {
        int subtraido = number;
        int palindromo = 0;
        while (subtraido > 0) {
            palindromo = palindromo * 10 + subtraido % 10;
            subtraido /= 10;
        }
        if (palindromo == number){
            return true;
        }
        else return false;
    }
}
