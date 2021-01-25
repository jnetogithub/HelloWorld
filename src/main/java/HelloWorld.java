public class HelloWorld
{
    /**
     * @param args
     */
    public static void main (String[] args) {
        System.out.println("Hello World ! ");
        Calculator calc = new Calculator();
        System.out.println("Resultado:" + calc.sumValues( 2,3));
    }
}
