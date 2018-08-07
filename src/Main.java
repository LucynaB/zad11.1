import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        ListOperation.wczytajListe(lista);
        System.out.println(lista);

        ListOperation.printReverseList(lista);

        int suma = ListOperation.countSuma(lista);

        for (int i = 0; i < lista.size(); i++) {
            if (i != lista.size() - 1) {
                System.out.print(lista.get(i) + "+");
            } else {
                System.out.print(lista.get(i) + "=" + suma);
                System.out.println();
            }

        }

        int max = ListOperation.getMax(lista);
        int min = ListOperation.getMin(lista);
        System.out.println("Największa z wprowadzonych liczb: " + max);
        System.out.println("Najmniejsza z wprowadzonych liczb: " + min);

    }
}
