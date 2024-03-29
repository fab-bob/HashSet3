import java.util.HashSet;
import java.util.Iterator;

/*Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato*/
public class Main {
    public static void main (String[] args) {
        Integer num = 11;

        HashSet<Integer> numbersFromZerotoTen = fillHashSet();
        numbersFromZerotoTen.add(num);
        Iterator<Integer> iteratore = numbersFromZerotoTen.iterator();
        while (iteratore.hasNext()) {
            if (iteratore.next().equals(num)) {
                iteratore.remove();
            }
        }
        numbersFromZerotoTen.clear();
        System.out.println(numbersFromZerotoTen.isEmpty());
        System.out.println(numbersFromZerotoTen);
    }
    public static HashSet<Integer> fillHashSet () {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
