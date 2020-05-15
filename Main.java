public class Main {

    private static int arrayLength = 10;

    public static void main(String[] args) {
        System.out.println("Задание номер 1");
        invertElementsOfArray(makeArray(arrayLength));
        System.out.println();
        System.out.println("Задание номер 2");
        makeArray();
        System.out.println();
        System.out.println("Задание номер 3");
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        remakeArray(arr1);
        System.out.println();
        System.out.println("Заданиен номер 4");
        replaceDiagonalsOfArray(makeSquareArray(4));
        System.out.println();
        System.out.println("Задание номер 5");
        findMaxAndMinOfArray(makeSimpleArray(6));
        System.out.println();
        System.out.println("Задание номер 6");
        int[] array = {2, 2, 2, 1, 2, 2, 10, 1};
        checkBalance(array);
        System.out.println();
        System.out.println("Задание номер 7");
        turnElementsOfArray(makeSimpleArray(5), -2);
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    public static int[] makeArray(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = (int) Math.round(Math.random());
        }
        outputArray(arr);
        return (arr);
    }

    //1. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertElementsOfArray(int[] arr) {
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        outputArray(arr);
    }

    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void makeArray() {
        int a = 8;
        int[] array = new int[a];
        for (int i = 1; i < a; i++) {
            array[i] = array[i - 1] + 3;
        }
        outputArray(array);
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static int[] remakeArray(int[] array) {
        outputArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        outputArray(array);

        return (array);
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static int[][] makeSquareArray(int a) {
        int b = 0;
        int[][] array = new int[a][a];
        for (int i = 0; i < a; i++) {
            array[i][0] = b;
            for (int j = 0; j < a; j++){
                array[i][j] = b;
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
        }
        System.out.println();
        return(array);
    }

    public static int[][] replaceDiagonalsOfArray(int[][] array) {
        int b = 1;
        int[][] array1 = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == i) {
                    array1[i][j] = 1;
                } else if (i + j == array.length - 1){
                    array1[i][j] = 1;
                } else {
                    array1[i][j] = array[i][j];
                }
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        return(array1);
    }

//    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static int[] makeSimpleArray(int lengthOfArray) {
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.round(Math.random() * 100));
        }
        return(array);
    }

    public static void findMaxAndMinOfArray(int[] array) {
        int min = array[0], max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }
        outputArray(array);
        System.out.println("Наименьший элемент массива равен: " + min + "; " + "Наибольший элемент массива равен: " + max);
    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.
    public static boolean checkBalance(int[] array) {
        boolean answer = false;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length; i++) {
            int x;
            for (x = 0; x <= i; x++) {
                sumLeft += array[x];
            }
            int y;
            for (y = array.length - 1; y > i; y--) {
                sumRight += array[y];
            }

            if (sumLeft == sumRight) {
                answer = true;
                System.out.print("[ ");
                for (i = 0; i <= x; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.print("|| ");
                for (i = y; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println("]");
                break;
            } else {
                sumLeft = 0;
                sumRight = 0;
            }
        }

        if (answer == false) {
            outputArray(array);
        }
        System.out.println(answer);
        return (answer);
    }

    public static void outputArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементымассива на n позиций.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    public static void turnElementsOfArray(int[] array, int stepOfTurn) {
        outputArray(array);
        if (stepOfTurn == 0) {
            outputArray(array);

        } else if (stepOfTurn > 0) {
            if (stepOfTurn < array.length) {
                for (int i = 1; i <= stepOfTurn; i++) {
                    moveArrayToRight(array);
                }
            } else if (stepOfTurn == array.length) {
                outputArray(array);
            } else if (stepOfTurn > array.length) {
                stepOfTurn = stepOfTurn % array.length;
                for (int i = 1; i <= stepOfTurn; i++) {
                    moveArrayToRight(array);
                }
            }

        } else if (stepOfTurn < 0) {
            if ((stepOfTurn * (-1)) < array.length) {
                for (int i = 0; i > stepOfTurn; i--) {
                    moveArrayToLeft(array);
                }
            } else if ((stepOfTurn * (-1)) == array.length) {
                outputArray(array);
            } else if ((stepOfTurn * (-1 ) > array.length)) {
                stepOfTurn = stepOfTurn % array.length;
                for (int i = 0; i > stepOfTurn; i--) {
                    moveArrayToLeft(array);
                }
            }
        }
        outputArray(array);
    }

    public static int[] moveArrayToRight(int[] array) {
        int n = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = n;
        return (array);
    }

    public static int[] moveArrayToLeft(int[] array) {
        int n = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = n;
        return (array);
    }

}