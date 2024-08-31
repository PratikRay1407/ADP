package Q01;

public class Computer {

    public void keyboardUsed(Keyboard keyboard) {

        keyboard.type();

    }

    public static void main(String[] args) {

        Computer computer = new Computer();

        Keyboard dellKeyboard = new DellKeyboard();

        Keyboard lenovoKeyboard = new LenovoKeyboard();

        

        computer.keyboardUsed(dellKeyboard);

        computer.keyboardUsed(lenovoKeyboard);

    }

}
