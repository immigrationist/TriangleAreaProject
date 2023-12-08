public class TriangleArea {

    public static int readNumber()throws Exception{
        int number = 0;
        char digitAsciiCode = '0';
        int value = 0;

        digitAsciiCode = (char)System.in.read();
        while(digitAsciiCode != '\n'){
            value = digitAsciiCode - '0';
            number = number * 10 + value;
            digitAsciiCode = (char)System.in.read();
        }
        return number;
    }

    public static void main(String[] args) {
        int base = 0;
        int height = 0;
        double area = 0;

        try{
            System.out.println("Enter base");
            base = readNumber();
            System.out.println("Enter height");
            height = readNumber();

            area = ((double)base * height) / 2;
            System.out.println("The area is " + area);

        }
        catch(Exception e){
            System.out.println("Keyboard malfunctioned");
        }
    }
}
