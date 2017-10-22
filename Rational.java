
public class Rational {
	
	private int num;   // the numerator
    private int den;   // the denominator

    // create and initialize a new Rational object
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Denominator is zero");
        }
        
        if(denominator < 0 ){
        	num = 0;
        	
        }
        else{
        
        num = numerator;
        den = denominator;
        }
    }
    
    public boolean greaterThan(Rational b){
    	return this.num * b.den > this.den * b.num;
    	
    }
    
    public boolean equals(Rational b){
    	return this.num * b.den == this.den * b.num;
    	
    }
    
    // return (this + b)
    public Rational plus(Rational b) {
        int numerator   = (this.num * b.den) + (this.den * b.num);
        int denominator = this.den * b.den;
        return new Rational(numerator, denominator);
    }
    
 // return (this + b)
    public Rational minus(Rational b) {
        int numerator   = (this.num * b.den) - (this.den * b.num);
        int denominator = this.den * b.den;
        return new Rational(numerator, denominator);
    }
    
    // return (this * b)
    public Rational multiply(Rational b) {
        return new Rational(this.num * b.num, this.den * b.den);
    }
    
    public int getNumerator(){
    	return this.num;
    }
    
    public int getDenominator(){
    	return this.den;
    }
    
    
    // return string representation of (this)
    public String toString() {
        if (den == 1) return num + "";
        else          return num + "/" + den;
    }

    public Rational reduce(){
    	int g = gcd(num, den);
    	return new Rational(this.num/g, this.den/g);
    }
   

    // return gcd(m, n)
    private static int gcd(int m, int n) {
        if (0 == n) return m;
        else return gcd(n, m % n);
    }
    
   
    
    
	
}
