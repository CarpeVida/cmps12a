//-----------------------------------------------------------------------------
//   Complex.java
//   Represents complex numbers as a pair of doubles
//
//   pa6
//   Fill in the function definitions below.  Write a ComplexTest class to
//   test all your methods. See notes from 5-22-15 for definitions of the
//   complex arithmetic operations.
//-----------------------------------------------------------------------------

class Complex{

   //--------------------------------------------------------------------------
   // Private Data Fields 
   //--------------------------------------------------------------------------
   private double re;
   private double im;
   
   //--------------------------------------------------------------------------
   // Public Constant Fields 
   //--------------------------------------------------------------------------
   public static final Complex ONE = Complex.valueOf(1,0);
   public static final Complex ZERO = Complex.valueOf(0,0);
   public static final Complex I = Complex.valueOf(0,1);

   //--------------------------------------------------------------------------
   // Constructors 
   //--------------------------------------------------------------------------
   Complex(double a, double b){
      this.re = a;
      this.im = b;
   }

   Complex(double a){
      this.re = a;
      this.im = 0;
   }

   Complex(String s){
      // Fill in this constructor.
      // It should accept expressions like "-2+3i", "2-3i", "3", "5i", etc..
      // Throw a NumberFormatException if s cannot be parsed as Complex.
      parseComplex(s);
   }

   //---------------------------------------------------------------------------
   // Public methods 
   //---------------------------------------------------------------------------

   // Complex arithmetic -------------------------------------------------------

   // copy()
   // Return a new Complex equal to this Complex
   Complex copy(){
      // Fill in
      double real = this.re;
      double imag = this.im;
      return new Complex(real, imag);

   }
   
   // add()
   // Return a new Complex representing the sum this plus z.
   Complex add(Complex z){
      double real = (this.re + z.re);
      double imag = (this.im + z.im);
      return new Complex(real, imag);
      // Fill in
   }
   
   // negate()
   // Return a new Complex representing the negative of this.
   Complex negate(){
      double real = (0 - this.re);
      double imag = (0 - this.im);
      return new Complex(real, imag);
      // Fill in
   }

   // sub()
   // Return a new Complex representing the difference this minus z.
   Complex sub(Complex z){
      double real = this.re - z.re;
      double imag = this.im + z.im;
      return new Complex(real, imag);
      // Fill in
   }

   // mult()
   // Return a new Complex representing the product this times z.
   Complex mult(Complex z){
      // Fill in
      double real = ((this.re * z.re) - (this.im * z.im));
      double imag = ((this.re * z.im) + (this.im * z.re));
      return new Complex(real,imag);

   }

   // recip()
   // Return a new Complex representing the reciprocal of this.
   // Throw an ArithmeticException with appropriate message if 
   // this.equals(Complex.ZERO).
   Complex recip(){
      // Fill in
      if(this.equals(Complex.ZERO)){
         throw new ArithmeticException("Cannot divide by 0");
      }
      double real = (this.re/(Math.pow(this.re, 2) + Math.pow(this.im, 2)));
      double imag = ((0 - this.re)/(Math.pow(this.re, 2)+Math.pow(this.im, 2)));
      return new Complex(real, imag);
   }

   }

   // div()
   // Return a new Complex representing the quotient of this by z.
   // Throw an ArithmeticException with appropriate message if 
   // z.equals(Complex.ZERO).
   Complex div(Complex z){
      // Fill in
   }

   // conj()
   // Return a new Complex representing the conjugate of this Complex.
   Complex conj(){
      // Fill in
   }
   
   // Re()
   // Return the real part of this.
   double Re(){
      return re;
   }

   // Im()
   // Return the imaginary part of this.
   double Im(){
      return im;
   }

   // abs()
   // Return the modulus of this Complex, i.e. the distance between 
   // points (0, 0) and (re, im).
   double abs(){
      // Fill in
   }

   // arg()
   // Return the argument of this Complex, i.e. the angle this Complex
   // makes with positive real axis.
   double arg(){
      return Math.atan2(im, re);
   }

   // Other functions ---------------------------------------------------------
   
   // toString()
   // Return a String representation of this Complex.
   // The String returned will be readable by the constructor Complex(String s)
   public String toString(){
      // Fill in
   }

   // equals()
   // Return true iff this and obj have the same real and imaginary parts.
   public boolean equals(Object obj){
      // Fill in
   }

   // valueOf()
   // Return a new Complex with real part a and imaginary part b.
   static Complex valueOf(double a, double b){
      // Fill in
   }

   // valueOf()
   // Return a new Complex with real part a and imaginary part 0.
   static Complex valueOf(double a){
      // Fill in
   }

   // valueOf()
   // Return a new Complex constructed from s.
   static Complex valueOf(String s){
      // Fill in
   }

}
