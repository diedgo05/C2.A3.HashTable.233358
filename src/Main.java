import Business.Business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        HashTable HashTable = new HashTable();

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

        HashTable.search("tUFrWirKiKi_TAnsVWINQQ","Target", "AZ");
    }
}

