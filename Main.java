import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Integer> numberList= new ArrayList<Integer>();
        numberList.add(2);
        numberList.add(245);
        numberList.add(21);
        numberList.add(22);
        numberList.add(2456);
        numberList.add(214);

        List<Integer> evenNumbers = numberList.stream()
                .filter(i -> i%2 == 0)
                .collect(Collectors.toList());

        for (Integer j : evenNumbers) {
             System.out.println("j = " + j);
        }

        List<Integer> squareNumbers = numberList.stream()
                .map(i -> i*i)
                .collect(Collectors.toList());

        for (Integer j : squareNumbers) {
            System.out.println("j = " + j);
        }
    }
}