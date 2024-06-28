import Business.Business;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        HashTable HashTable = new HashTable();
        Scanner teclado = new Scanner(System.in);
        int op = 0;

        String line = "";
        String splitBy = ",";
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("bussines.csv"));
            while ((line = br.readLine()) != null)
            {
                String[] busines = line.split(splitBy);
                Business business = new Business(busines[1],busines[2],busines[3],busines[4]);
                HashTable.insert(busines[0],business);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        do {
            try {
                System.out.println("CHOOSE THE FUNCTION THAT YOU WANT TO TRY: ");
                System.out.println("1.DIVISION     2.MULTIPLICATION     3.FINISH");
                op = teclado.nextInt();

                switch (op) {
                    case 1:
                        HashTable.searchDiv("qkRM_2X51Yqxk3btlwAQIg","Temple Beth-El", "St. Petersburg");
                        break;
                    case 2:
                        HashTable.searchMul("tUFrWirKiKi_TAnsVWINQQ","Target", "AZ");
                        break;
                    default:
                        System.out.println("FINISHING THE PROGRAM");
                        break;
            }
            }
            catch (InputMismatchException e) {
                System.out.println("ERROR, TYPE A VALID NUMBER");
                teclado.next();
            }
        }
        while (op !=3);
        teclado.close();
    }
}

