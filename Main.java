import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
        // При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
        // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        boolean tryAgain = false;
        do {
            int number = (int) Math.round(Math.random() * 9);
            int counter = 0;
            do {
                Scanner request = new Scanner(System.in);
                System.out.println("Ввеидте число от 0 до 9");
                String input = request.next();
                int inputed = Integer.parseInt(input);
                if (inputed == number) {
                    System.out.println("Вы угадали!");
                    break;
                } else {
                    if (inputed < number) {
                        System.out.println("Загаданное число больше введённого.");
                    } else if (inputed > number) {
                        System.out.println("Загаданное число меньше введённого.");
                    } else if (inputed < 0 || inputed > 9) {
                        System.out.println("Введено не верное значение.");
                        counter = counter - 1;
                    } else {
                        System.out.println("Введено не число.");
                        counter = counter - 1;
                    }
                }
                counter++;
            } while (counter < 3 );
            System.out.println("Загаданное число: " + number);
            System.out.println();
            System.out.println("Хотите сыграть ещё раз? 1 - да, другое - нет:");
            Scanner scanner = new Scanner(System.in);
            String inputed = scanner.next();
            if (inputed == "1") {
                tryAgain = true;
            } else {
                tryAgain = false;
            }
        } while (tryAgain == true);

    }
}


    //2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
    // "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
    // "pear", "pepper", "pineapple", "pumpkin", "potato"};
    //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
    // компьютер показывает буквы которые стоят на своих местах.
    //apple – загаданное
    //apricot - ответ игрока
    //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    //Для сравнения двух слов посимвольно, можно пользоваться:
    //String str = "apple";
    //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    //Играем до тех пор, пока игрок не отгадает слово
    //Используем только маленькие буквы
