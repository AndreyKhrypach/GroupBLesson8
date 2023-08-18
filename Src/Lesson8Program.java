import java.util.Scanner;

public class Lesson8Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            menuCalculator();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("please enter first num");
                    int a = scanner.nextInt();
                    System.out.println("please enter first num");
                    int b = scanner.nextInt();
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println("please enter first num");
                    int a1 = scanner.nextInt();
                    System.out.println("please enter first num");
                    int b1 = scanner.nextInt();
                    System.out.println(a1 - b1);
                    break;
                case 3:
                    System.out.println("please enter first num");
                    int a2 = scanner.nextInt();
                    System.out.println("please enter first num");
                    int b2 = scanner.nextInt();
                    System.out.println(a2 * b2);
                    break;
                case 4:
                    System.out.println("please enter first num");
                    int a3 = scanner.nextInt();
                    System.out.println("please enter first num");
                    int b3 = scanner.nextInt();
                    if(b3 != 0)
                        System.out.println(a3 / b3);
                    else{
                        System.out.println("Can't divide by zero");
                    }
                    break;
                case 5:
                    return;
            }
        }

//        Person bob = new Person("Bob", "Green Eyes", true, "no scars");
//        System.out.println("Bob parameters = " + bob);
//        Person mary = new Person("Mary", "Blue eyes", false, "no scars");
//        System.out.println(mary);
//        Person tom = new Person();
//        tom.name = "Tom";
//        tom.sex = true;
//        tom.scars = "big scars";
//        tom.colorEyes = "brown eyes";
//
//        System.out.println("Tom parameters = " + tom);
//        Lesson8Program lesson8 = new Lesson8Program();
//        Object objectTest = new Object();
//
//        String nameObject = objectTest.getClass().getName();
//        String name = lesson8.getClass().getName();
//
//        System.out.println(name);
//        System.out.println(nameObject);
    }

    public static void menuCalculator(){
        System.out.println("Please choice calculation");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }
}
