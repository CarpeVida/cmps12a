// Rational.java
class Rational{
 int numerator; int denominator; // Fields
 Rational(int n, int d){ // Constructor
 if(d==0) throw new RuntimeException("zero denominator");
 numerator = n; denominator = d;
 }
 Rational plus(Rational Q){
   if( this.denominator == Q.denominator) {
      int n = this.numerator + Q.numerator;
      int d= this.denominator;
      return new Rational(n, d);

   }
   else{
      int d = this.denominator*Q.denominator;
      int n = (this.numerator*Q.denominator)+(Q.numerator*this.denominator);
      return new Rational( n, d);
   }
 }
 Rational times(Rational Q){
   int n = Q.numerator*this.numerator;
   int d = Q.denominator*this.denominator; 
   return new Rational(n, d);
}
 public String toString(){
   return (this.numerator+"/"+this.denominator);
 }
 public boolean equals(Object x){
   boolean eq = false;
   Rational r;
   if(x instanceof Rational){
      r = (Rational) x;
      eq = ( this.numerator/this.denominator == r.numerator/r.denominator);
   }
 return eq;   
 }
} // end of class Rational
