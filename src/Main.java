public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        double[] arrDouble = {1.57, 7.654, 9.986};
        long[] myArr = new long[10];
        myArr[0] = 31;
        myArr[8] = 12773;
        myArr[9] = 3115801;
        // Задача 2
        System.out.println("Задача 2");
        System.out.println();
        for (int i = 0; i < arrInt.length; i++){
            if(i == (arrInt.length - 1)){
                System.out.println(arrInt[i]);
                break;
            }
            System.out.print(arrInt[i] + ", ");
        }
        for (int i = 0; i < arrDouble.length; i++){
            if(i == (arrDouble.length - 1)){
                System.out.println(arrDouble[i]);
                break;
            }
            System.out.print(arrDouble[i] + ", ");
        }
        for (int i = 0; i < myArr.length; i++){
            if(i == (myArr.length - 1)){
                System.out.println(myArr[i]);
                break;
            }
            System.out.print(myArr[i] + ", ");
        }
    }
}