import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1. uzunluğu giriniz");
        double kenar1= input.nextDouble();
        System.out.println("2. uzunluğu giriniz");
        double kenar2= input.nextDouble();
        double hipotenus=(kenar1*kenar1)+(kenar2*kenar2);
        hipotenus=Math.sqrt(hipotenus);
        System.out.println("hipotenus "+hipotenus);
        double u=(kenar1+kenar2+hipotenus)/2;
        double alan=u * (u - kenar1)* (u - kenar2) * (u - hipotenus);
        System.out.println("üçgenin alanı "+ Math.sqrt(alan));
    }
}
