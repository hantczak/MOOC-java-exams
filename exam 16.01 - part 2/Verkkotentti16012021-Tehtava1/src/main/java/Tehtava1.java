import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input edge length of the cube to be calculated: ");
        int userInput = Integer.valueOf(scanner.nextLine());

        Cube cube = new Cube(userInput);

        System.out.println(cube.summarizedSidesArea());
        System.out.println(cube.objectVolume());
        System.out.println();
    }
}
