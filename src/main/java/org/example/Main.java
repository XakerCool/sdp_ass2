package org.example;

import org.example.tank.*;

import java.io.FileReader;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HeavyTank base = new HeavyTank(
                new MediumTank(
                        new LightTank(
                                new BaseTank("KV-85", 85, 150, HeavyTank.type)
                        )
                )
        );
        System.out.println(base.getDescription());
        System.out.println(base.fire());
        System.out.println(base.receiveDamage(85));
        System.out.println(base.lineBreakout());

        System.out.println("================");
        Tank userTank = new BaseTank();
        String userChoice = "";
        while (true) {
            String name = "";
            int caliber = 0;
            int armourThickness = 0;
            System.out.print("Hello, which tank would u like to create? (light - l, medium - m, heavy - h) or input 0 to exit: ");
            userChoice = scanner.nextLine();
            if (!userChoice.equals("0"))
            {
                System.out.print("Okay, now input the name of a tank: ");
                name = scanner.nextLine();
                System.out.print("Input the caliber of a tank: ");
                caliber = Integer.parseInt(scanner.nextLine());
                System.out.print("Input the armour thickness of a tank: ");
                armourThickness = Integer.parseInt(scanner.nextLine());
            }
            switch (userChoice) {
                case "l":
                    userTank = new LightTank(name, caliber, armourThickness);
                    break;
                case "m":
                    userTank = new MediumTank(name, caliber, armourThickness);
                    break;
                case "h":
                    userTank = new HeavyTank(name, caliber, armourThickness);
                    break;
                case "0":
                    System.out.println("Goodbye soldier!");
                    break;
                default:
                    System.out.println("There is no that option!");
                    break;
            }
            if (!userChoice.equals("0")) {
                System.out.println("-------------------------");
                System.out.println("Your tank:");
                System.out.println(userTank.getDescription());
            }
            if (userChoice.equals("0"))
                break;
        }
    }
}