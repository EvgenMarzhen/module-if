/*
  Необходимо реализовать метод таким образом, чтобы он возвращал модуль числа х (если он был положительным,
  то таким и остается, если он был отрицательным – то необходимо вернуть его без знака минус).
        Пример 1:
        x=5
        результат: 5
 */

public class TestIf {
    public static int abs(int x) {
        if(x > 0) {
            return x;
        }
        return x * (-1);
    }
}
