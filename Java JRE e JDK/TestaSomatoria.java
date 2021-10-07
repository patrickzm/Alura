public class TestaSomatoria {

    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while(contador <= 10) {
            // pode ser usado também, total += contador;
            total = total + contador;
            contador++;
            }
            System.out.println(total);
    }
}