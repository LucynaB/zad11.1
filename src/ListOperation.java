
import java.util.List;
import java.util.Scanner;

public class ListOperation {


    public static List<Integer> wczytajListe(List<Integer> lista) {
        Scanner scanner = new Scanner(System.in);
        int el = 0;
        while (el >= 0) {
            System.out.println("Podaj kolejny element: ");
            el = scanner.nextInt();
            if (el >= 0) {
                lista.add(el);
            } else
                break;


        }
        return lista;
    }

    public static void printReverseList(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(lista.size() - 1 - i) + " ");

        }
        System.out.println();
    }

    public static int countSuma(List<Integer> lista) {
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }
        return suma;
    }

    public static int getMax(List<Integer> lista) {
        int max = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }
        return max;
    }


    public static int getMin(List<Integer> lista) {
        int min = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < min) {
                min = lista.get(i);
            }
        }
        return min;
    }


}

