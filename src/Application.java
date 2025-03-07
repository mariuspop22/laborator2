//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    public static void main(String[] args) {
        SimpleChainedList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) {
            simpleList.addValue(i);
        }

        for(int i=4;i<=10;i=i+2){
            simpleList.removeNodeByValue(i);

        }
        simpleList.printList();

        System.out.println("Suma elementelor: " + simpleList.sumValues());
        System.out.println("Lista este sortată? " + simpleList.isSortedAscending());


        DoubleChainedList doubleList = new DoubleChainedList();
        for (int i = 1; i <= 10; i++) {
            doubleList.addValue(i);
        }

        for(int i=1;i<=3;i++){
            doubleList.removeNodeByValue(i);
        }
        doubleList.printList();

        System.out.println("Suma elementelor: " + doubleList.sumValues());
        System.out.println("Lista este sortată? " + doubleList.isSortedAscending());
    }
}