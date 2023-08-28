
public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // 1  Создается переменная i типа int и присваивается значение 1. Значение переменной и переменная i будет храниться в стеке.
        Object o = new Object();        // 2 Создается переменная o типа Object и создается новый объект типа Object. Ссылка на этот объект будет храниться в стеке, а сам объект будет храниться в хипе
        Integer ii = 2;                 // 3 Создается переменная ii типа Integer и присваивается значение. Значение переменной ii будет храниться в стеке.
        printAll(o, i, ii);             // 4 application classloader. Вызывается метод printAll с параметрами o, i и ii. При вызове метода создается новый фрейм в стеке.
        System.out.println("finished"); // 7 в классе System определяется переменная с именем out.Область памяти, в которой вызывается переменная "out" в классе System, называется "статической памятью" или "памятью класса".Выводится строка "finished" на консоль.

    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 Создается переменная uselessVar типа Integer и ей присваивается значение 700. Значение переменной uselessVar сохраняется в стеке.
        System.out.println(o.toString() + i + ii);  // 6  Вызывается метод println у объекта System.out, который выводит (o.toString() + i + ii) на консоль.
    }
}
