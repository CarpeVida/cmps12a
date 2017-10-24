//-----------------------------------------------------------------------------
//   RationalTest.java
//   Tests the Rational data type
//-----------------------------------------------------------------------------

class AddFrac{

   public static void main(String[] args){



      Rational f = new Rational("1/12");
      Rational a = new Rational("1/20");
      Rational b = new Rational("1/30");
      Rational c = new Rational("1/42");
      Rational d = new Rational("1/56");
      Rational e = new Rational("1/72");

      System.out.println(a.add(b).add(f));
      System.out.println(a.add(b).add(c).add(f));
      System.out.println(a.add(b).add(c).add(d).add(f));

   }

}
