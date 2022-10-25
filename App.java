import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int i,j;
        int k;
        int jumlah;
        int panjang;
        int lebar;
        char simbol;
        
        Scanner baca = new Scanner (System.in);
        do{
        System.out.println("Masukkan Jumlah : ");
        jumlah = baca.nextInt();
        }while (jumlah < 1 || jumlah > 5);
        do{
        System.out.println("Masukkan panjang :");
        panjang = baca.nextInt();
        }while (panjang < 3 || panjang > 10);
        do{
        System.out.println("Masukkan lebar :");
        lebar = baca.nextInt();
        }while (lebar < 3 || lebar > 10);
        System.out.println("Masukkan simbol :");
        simbol = baca.next().charAt(0);

        for(i = 0; i<panjang;i++)
        {
            k=0;
            while(k<jumlah)
            {
                for(j = 0;j<lebar; j++)
                {
                    if (i == 0 || i == panjang-1)
                    {
                        System.out.print(simbol);
                    }else{
                        if(j == 0 || j == lebar-1)
                        System.out.print(simbol);
                        else{
                            System.out.print(" ");
                        }
                        }
                }
                System.out.print(" ");
                k++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }
}
