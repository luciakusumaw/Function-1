import java.util.Scanner;

public class Cube13 {

    static int calcArea (int s, int totalS) {
        int area = s*s*totalS;
        return area;
    }
    static int calcVolume (int s) {
        int volume = s*s*s;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        int totalS= 6;

        System.out.print("Input the side of cubic: ");
        s = sc.nextInt();

        int L = calcArea(s, totalS);
        System.out.println("The total area of the cubic is (side*side*6): " + L);
        int volume = calcVolume(totalS);
        System.out.println("The total volume of the cubic is (side*side*side): " + volume);

        sc.close(); 
    }
}