public class VisitorSingle {

interface Car {
   void process1( Car secondObject );
   void process2(  Voltzwagen   firstObject  );
   void process2(  Ford   firstObject  );
   void process2(  Toyota   firstObject  );
}

static class Voltzwagen implements Car {
   public void process1( Car second ) { second.process2( this ); }
   public void process2( Voltzwagen first ) {
      System.out.println( "first is Voltzwagen, second is Voltzwagen" ); }
   public void process2( Ford first ) {
      System.out.println( "first is Ford, second is Voltzwagen" ); }
   public void process2( Toyota first ) {
      System.out.println( "first is Toyota, second is Voltzwagen" ); }
}

static class Ford implements Car {
   public void process1( Car second ) { second.process2( this ); }
   public void process2( Voltzwagen first ) {
      System.out.println( "first is Voltzwagen, second is Ford" ); }
   public void process2( Ford first ) {
      System.out.println( "first is Ford, second is Ford" ); }
   public void process2( Toyota first ) {
      System.out.println( "first is Toyota, second is Ford" ); }
}

static class Toyota implements Car {
   public void process1( Car second ) { second.process2( this ); }
   public void process2( Voltzwagen first ) {
      System.out.println( "first is Voltzwagen, second is Toyota" ); }
   public void process2( Ford first ) {
      System.out.println( "first is Ford, second is Toyota" ); }
   public void process2( Toyota first ) {
      System.out.println( "first is Toyota, second is Toyota" ); }
}

public static void main( String[] args ) {
	Car array[] = { new Voltzwagen(), new Ford(), new Toyota() };
   for (int i=0; i < array.length; i++)
      for (int j=0; j < 3; j++)
         array[i].process1( array[j] );
}}

