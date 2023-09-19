import java.util.ArrayList;
public class Ordem {

        public ArrayList <Integer> ordem (ArrayList <Integer> num) {

            ArrayList <Integer> impares = new ArrayList<>();
            ArrayList <Integer> pares = new ArrayList<>();


            for (int n : num) {
                if (n % 2 == 0) {
                    pares.add(n);
                } else {
                    impares.add(n);
                }
            }

            pares.sort(Integer::compareTo);
            impares.sort((a, b) -> b.compareTo(a));

            pares.addAll(impares);
            return pares;
        }

    }

