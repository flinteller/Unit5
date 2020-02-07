/**
 * @author Flint Eller
 * @since February 4, 2020
 * This program performs basic math functions with fractions
 */

package com.company;

public class Fraction {

    private int numerator;
    private int denominator;

    /**
     * The first constructor makes a fraction with a given numerator and denominator given by user, check negatives and simplifies
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;

        int num = reduce(numerator, denominator);
        denominator /= num;
        numerator /= num;

        if(denominator < 0 && numerator > 0) {
            denominator = -denominator;
            numerator = -numerator;
        }
        else if(denominator < 0 && numerator < 0)
            denominator = -denominator;

    }

    /**
     * The default constructor creates a fraction 1/1
     */
    public Fraction(){
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     * Reduces a fraction by finding the greatest common factor, this method is used many many times
     * @param numerator
     * @param denominator
     * @return An int we can divide the numerator and denominator by to reduce
     */
    public static int reduce(int numerator, int denominator){
        int m = numerator;
        int n = denominator;

        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }

        return n;
    }

    /**
     * First multiplies the denominators, then the numerators by the opposite denominators then adds them, then reduce
     * @param a fraction one
     * @param b fraction two
     * @return the simplified added fraction
     */
    public static Fraction add(Fraction a, Fraction b){
        int newDenominator = a.denominator * b.denominator;
        int newNumerator = a.numerator * b.denominator + a.denominator * b.numerator;
        int num = reduce(newNumerator, newDenominator);
        newDenominator /= num;
        newNumerator /= num;
        if(newDenominator < 0 && newNumerator > 0) {
            newDenominator = -newDenominator;
            newNumerator = -newNumerator;
        }
        else if(newDenominator < 0 && newNumerator < 0)
            newDenominator = -newDenominator;

        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * First multiplies the denominators, then the numerators by the opposite denominators then adds them, then reduce
     * @param a fraction one
     * @param b fraction two
     * @return
     */
    public static Fraction subtract(Fraction a, Fraction b){
        int newDenominator = a.denominator * b.denominator;
        int newNumerator = a.numerator * b.denominator - a.denominator * b.numerator;
        int num = reduce(newNumerator, newDenominator);
        newDenominator /= num;
        newNumerator /= num;
        if(newDenominator < 0 && newNumerator > 0) {
            newDenominator = -newDenominator;
            newNumerator = -newNumerator;
        }
        else if(newDenominator < 0 && newNumerator < 0)
            newDenominator = -newDenominator;
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * simply multiplies numerators, then denominators, then reduces
     * @param a fraction one
     * @param b fraction two
     * @return simplified product of input fractions
     */
    public static Fraction multiply(Fraction a, Fraction b){
        int newNumerator = a.numerator * b. numerator;
        int newDenominator = a.denominator * b. denominator;
        int num = reduce(newNumerator, newDenominator);
        newDenominator /= num;
        newNumerator /= num;
        if(newDenominator < 0 && newNumerator > 0) {
            newDenominator = -newDenominator;
            newNumerator = -newNumerator;
        }
        else if(newDenominator < 0 && newNumerator < 0)
            newDenominator = -newDenominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public static Fraction divide(Fraction a, Fraction b){
        int newNumerator = a.numerator * b.denominator;
        int newDenominator = a.denominator * b.numerator;
        int num = reduce(newNumerator, newDenominator);
        newDenominator /= num;
        newNumerator /= num;
        return new Fraction(newNumerator, newDenominator);
    }


    public String toString(){

        if(denominator < 0 && numerator > 0) {
                denominator = -denominator;
                numerator = -numerator;
        }
        else if(denominator < 0 && numerator < 0)
            denominator = -denominator;
        return numerator + "/" + denominator;
    }


}
