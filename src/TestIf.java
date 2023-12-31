/*
  Необходимо реализовать метод таким образом, чтобы он возвращал модуль числа х (если он был положительным,
  то таким и остается, если он был отрицательным – то необходимо вернуть его без знака минус).
        Пример 1:
        x=5
        результат: 5
 */

public class TestIf {
    public static int abs(int x) {
        if (x > 0) {
            return x;
        }
        return x * (-1);
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал деление x на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0.
    При делении на 0 следует вернуть из метода число 0.
    Подсказка: смотри ограничения на операции типов данных.
        Пример 1:
        x=5
        y=0
        результат: 0
     */
    public static int safeDiv(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        return 0;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал максимальное значение из двух полученных методом чисел.
    Пример 1:
    x=5
    y=7
    результат: 7
 */
    public static int max(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал строку, которая включает два принятых методом числа и корректно выставленный знак операции сравнения (больше, меньше, или равно).

        Пример 1:
        x=5
        y=7
        результат: “5 < 7”

        Пример 2:
        x=8
        y=-1
        результат: “8 > -1”

        Пример 3:
        x=4
        y=4
        результат: “4 == 4”
     */
    public static String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        }
        if (x < y) {
            return x + " < " + y;
        }
        return x + " == " + y;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал максимальное из трех полученных методом чисел. Подсказка: идеальное решение включает всего две инструкции if и не содержит вложенных if.

        Пример 1:
        x=5
        y=7
        z=7
        результат: 7

        Пример 2:
        x=8
        y=-1
        z=4
        результат: 8
     */
    public static int max3(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        }
        if (y >= x && y >= z) {
            return y;
        }
        return z;
    }

    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал true, если два любых числа (из трех принятых) можно сложить так, чтобы получить третье.

        Пример 1:
        x=5  y=7  z=2
        результат: true

        Пример 2:
        x=8  y=-1   z=4
        результат: false
  */
    public static boolean sum3(int x, int y, int z) {
        if (x + y == z) {
            return true;
        }
        if (x + z == y) {
            return true;
        }
        if (y + z == x) {
            return true;
        }
        return false;
    }
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал сумму чисел x и y. Однако, если сумма попадает в диапазон от 10 до 19, то надо вернуть число 20.

        Пример 1:
        x=5  y=7
        результат: 20

        Пример 2:
        x=8  y=-1
        результат: 7
*/
    public static int sum2(int x, int y) {
        if ((x + y) >= 10 && (x + y) <= 19) {
            return 20;
        }
        return x + y;
    }
    /*
Необходимо реализовать метод таким образом, чтобы он возвращал true, если число x делится нацело на 3 или 5.
При этом, если оно делится и на 3, и на 5, то вернуть надо false. Подсказка: оператор % позволяет получить остаток от деления.

        Пример 1:
        x=5
        результат: true

        Пример 2:
        x=8
        результат: false

        Пример 3:
        x=15
        результат: false
*/
    public static boolean is35(int x) {
        if (x % 5 == 0 && x % 3 == 0) {
            return false;
        }
        if (x % 5 == 0 || x % 3 == 0) {
            return true;
        }
        return false;
    }
    /*
Необходимо реализовать метод таким образом, чтобы он возвращал true, если одно из принятых методом чисел равно шести, или их сумма равна шести,
или разница между ними равна шести.

        Пример 1:
        x=5
        y=7
        результат: false

        Пример 2:
        x=8
        y=2
        результат: true

        Пример 3:
        x=1
        y=6
        результат: true
*/
    public static boolean magic6(int x, int y) {
        if (x == 6 || y == 6 || x + y == 6 || x - y == 6 || y - x == 6) {
            return true;
        }
        return false;
    }
    /*
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой сначала будет число х, а затем одно из слов:
 - год
 - года
 - лет
Слово “год” добавляется, если число х заканчивается на 1, кроме чисел оканчивающихся на 11.
Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел оканчивающихся на 12, 13, 14.
Слово “лет” добавляется во всех остальных случаях.
Подсказка: оператор % позволяет получить остаток от деления.

        Пример 1:
        x=5
        результат: “5 лет”

        Пример 2:
        x=31
        результат: “31 год”

        Пример 3:
        x=44
*/
    public static String age(int x) {
        if (x%10 == 1 && x%100 != 11) {
            return x + " год";
        }
        if ((x%10 == 2 || x%10 == 3 || x%10 == 4) && (x%100 != 12 || x%100 != 13 || x%100 != 14)) {
            return x + " года";
        }
        return x + " лет";
    }
    /*
    Метод принимает число x, обозначающее день недели. Необходимо реализовать метод таким образом, чтобы он возвращал строку, которая будет обозначать текущий день недели, где 1- это понедельник, а 7 – воскресенье. Если число не от 1 до 7 то верните текст “это не день недели”. Вместо if в данной задаче используйте switch.

    Пример:
    x=5
    результат: “пятница”
*/
    public static String day(int x) {
        String day;
        switch (x) {
            case 1: day = "Понедельник"; break;
            case 2: day = "Вторник"; break;
            case 3: day = "Среда"; break;
            case 4: day = "Четверг"; break;
            case 5: day = "Пятница"; break;
            case 6: day = "Суббота"; break;
            case 7: day = "Воскресение"; break;
            default: day = "Это не день недели";

        }
        return day;
    }
    /*
В качестве параметра метод принимает строку, в которой записано название дня недели. Необходимо реализовать метод таким образом,
чтобы он выводил на экран название переданного в него дня и всех последующих до конца недели дней.
Если в качестве строки передан не день, то выводится текст “это не день недели”. Первый день понедельник, последний – воскресенье.
Вместо if в данной задаче используйте switch.

Обратите внимание, что делать для каждого из case вывод сразу всех дней
“понедельник вторник среда четверг пятница суббота воскресенье”) – решение явно некорректное.
Попробуйте применить для решения задачи принцип падения сквозь метки.

Пример:
    x=”четверг”
    результат:
    четверг
    пятница
    суббота
    воскресенье

Пример:
    x=”чг”
    результат:
    это не день недели
*/
    public static String printDays(String x) {
        String day1 = x;
        switch (x) {
            case "понедельник" : day1 += "\nвторник";
            case "вторник" : day1 += "\nсреда";
            case "среда" : day1 += "\nчетверг";
            case "четверг" : day1 += "\nпятница";
            case "пятница" : day1 += "\nсуббота";
            case "суббота" : day1 += "\nвоскресение"; break;
            default: day1 = "Это не день недели";
        }
        return day1;
    }
}