import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double n1,n2;
            int select;
            System.out.print("Islem Yapmak Istediginiz Ilk Sayiyi Giriniz : ");
            n1=input.nextDouble();
            System.out.print("Islem Yapmak Istediginiz Ikinci Sayiyi Giriniz : ");
            n2=input.nextDouble();
            System.out.print("*1 - Toplama\n*2- Cikarma\n*3- Carpma\n*4- Bolme\nIslem Yapmak Istediginiz Hesap Turunu Giriniz :");
            select=input.nextInt();
            switch (select) {
                case 1:System.out.println("Toplam = "+(n1+n2));
                    break;
                case 2:System.out.println("Kalan = "+(n1-n2));
                    break;
                case 3:System.out.println("Carpim = "+(n1*n2));     
                    break;
                case 4:System.out.println("Bolum = "+(n1/n2));
                    break;
            }
        }


    }
    
}
