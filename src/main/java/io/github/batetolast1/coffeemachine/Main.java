package io.github.batetolast1.coffeemachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Coffee[] coffeeTypes = {Coffee.ESPRESSO, Coffee.LATTE, Coffee.CAPPUCCINO};
        final CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550, coffeeTypes);

        while (coffeeMachine.getCoffeeMachineState() != CoffeeMachineState.POWERED_OFF) {
            coffeeMachine.printMessage();
            coffeeMachine.nextState(scanner.nextLine());
        }
    }
}
