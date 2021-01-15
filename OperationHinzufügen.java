public class OperationHinzufügen implements Strategy{
   @Override
   public int operationAusführen(int num1, int num2) {
      return num1 + num2;
   }
}
