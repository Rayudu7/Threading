// A java program to take command line input of the name of the person and produce out of an random UUID
// and the person name.

import java.util.Scanner;
import java.util.UUID;


public class Person {

    public static void main (String[] args){
        String person;
        UUID uuid = UUID.randomUUID();
        final String randomUUIDString = uuid.toString();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the person name :");
        person = scan.nextLine();
        System.out.println("Enter the person name :" + person);
        System.out.println("ID of the person :" + randomUUIDString);
    }

}
