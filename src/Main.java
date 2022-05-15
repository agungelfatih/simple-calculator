import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float a, b, res;
        char operasi;
        Scanner S = new Scanner(System.in);

        do {
            System.out.println("Main Menu: ");
            System.out.println(" 1 Penjumlahan");
            System.out.println(" 2 Pengurangan");
            System.out.println(" 3 Pembagian");
            System.out.println(" 4 Perkalian");
            System.out.println(" 5 Exit");

            System.out.print("Masukkan Operasi: ");

            operasi = S.next().charAt(0);

            switch (operasi) {
                case '1':
                    System.out.print("Masukkan angka pertama: ");
                    a = S.nextFloat();
                    System.out.print("Masukkan angka kedua: ");
                    b = S.nextFloat();
                    res = a + b;
                    System.out.printf("%f + %f = %f\n",a, b, res);
                    break;

                case '2':
                    System.out.print("Masukkan angka pertama: ");
                    a = S.nextFloat();
                    System.out.print("Masukkan angka kedua: ");
                    b = S.nextFloat();
                    res = a - b;
                    System.out.printf("%f - %f = %f\n",a, b, res);
                    break;

                case '3':
                    System.out.print("Masukkan angka pertama: ");
                    a = S.nextFloat();
                    System.out.print("Masukkan angka kedua: ");
                    b = S.nextFloat();
                    res = a / b;
                    System.out.printf("%f / %f = %f\n",a, b, res);
                    break;

                case '4':
                    System.out.print("Masukkan angka pertama: ");
                    a = S.nextFloat();
                    System.out.print("Masukkan angka kedua: ");
                    b = S.nextFloat();
                    res = a * b;
                    System.out.printf("%f * %f = %f\n",a, b, res);
                    break;

                case '5':
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        } while (operasi != 5);

    }
}
