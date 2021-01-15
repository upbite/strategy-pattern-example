public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationMultiplizieren());		
      System.out.println("6 + 7 = " + context.executeStrategy(6, 7));

      context = new Context(new OperationAbziehen());		
      System.out.println("6 - 7 = " + context.executeStrategy(6, 7));

      context = new Context(new operationAusführen());		
      System.out.println("6 * 7 = " + context.executeStrategy(6, 7));
   }
}