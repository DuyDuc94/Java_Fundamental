import java.util.Scanner;

//Write java program to manage fractions with addition, subtraction, multiplication and division.

class Fraction {
    private int numer;  //Numerator: tu so
    private int denom;  //Denominator: mau so

    public Fraction(int num, int den) {
        numer = num;
        denom = den;
    }
    public int getNumer() {
        return numer;
    }
    public int getDenom() {
        return denom;
    }

    //Simplify: Toi gian.
    void simplify() {
        int gcd = findGCD(numer, denom);
        numer /= gcd;
        denom /= gcd;
    }

    //GCD Function: Greatest Common Divisor: Uoc chung lon nhat
    int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //Fraction Subtract Method
    Fraction add(Fraction x) {
        Fraction result;
        if (denom == x.denom) { //Cung mau so, thi cong tu so
            result = new Fraction(x.numer + numer, denom);
            result.simplify();
        }else{
            int den = denom * x.getDenom();
            int num = numer * x.getDenom();
            num += x.getNumer() * denom;
            result = new Fraction(num, den);
            result.simplify();
        }
        return result;
    }

    //Fraction Subtract Method
    Fraction subtract(Fraction x) {
        Fraction result;
        if (x.denom == denom) {
            result = new Fraction(x.numer - numer, denom);
            result.simplify();
        }else{
            int den = denom * x.getDenom();
            int num = numer * x.getDenom();
            num -= x.getNumer() * denom;
            result = new Fraction(num, den);
            result.simplify();
        }
        return result;
    }

    //Fraction Multiply Method
    Fraction multiply(Fraction x) {
        Fraction result;
        int den = denom * x.getDenom();
        int num = numer * x.getNumer();
        result = new Fraction(num, den);
        result.simplify();
        return result;
    }

    //Fraction Divide Method
    Fraction divide(Fraction x) {
        Fraction result;
        int num = numer * x.getDenom();
        int den = denom * x.getNumer();
        result = new Fraction(num, den);
        result.simplify();
        return result;
    }

    //@Override
    public boolean equals(Fraction x) {
        boolean result = false;
        if (numer == x.numer && denom == x.denom) {
            result = true;
        }
        return result;
    }

    //ToString
    @Override
    public String toString() {
        return (Integer.toString(numer) + "/" + Integer.toString(denom));
    }
}

public class Ws3o4{
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Fraction a = new Fraction(sc.nextInt(), sc.nextInt());
        Fraction b = new Fraction(sc.nextInt(), sc.nextInt());
        
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
    }
}