import java.util.ArrayList;
import java.util.List;

public class Matrica {
    public static void main(String[] args){
        example();
    }

        private static void example() {
            List<List<String>> biDemArrList = new ArrayList<>();     //заполнение
            for (int i = 0; i < 8; i++) {
                biDemArrList.add(i, new ArrayList<>());
                for (int j = 0; j < 8; j++) {
                    biDemArrList.get(i).add(j, (i + j) % 2 == 1 ? "@" : "◯");
                }
            }
            for (int i = 0; i < 8; i++) {                      //это строки
                for (int j = 0; j < 8; j++) {                  //это столбцы
                    System.out.print(biDemArrList.get(i).get(j) + " ");   //вывод в одну строку
                }
                System.out.println();  //при этом добавлении, выводятся в 8 строк
            }
        }
    }

