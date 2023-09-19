public class Calculo3 {

    public int calculo(int n){

        if (n <= 1) {
            return n;
        } else {
            return calculo(n - 1) + calculo(n - 2);
        }
    }
}
