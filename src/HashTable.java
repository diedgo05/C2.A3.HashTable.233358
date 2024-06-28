import Business.Business;
import Linkedlist.LinkedList;
import Linkedlist.Node;

public class HashTable {
LinkedList[] LinkedList = new LinkedList[100003];

public int Ascii (String value) {
    int suma=0;
    for (int i=0;i<value.length();i++) {
        char car = value.charAt(i);
        int ASCII = (int) car;
        suma +=ASCII;
    }
    return suma;
}

public void insert (String id,Business business) {
    int indexR = this.Ascii(id);
    int hashtableNull = this.hashMul(indexR);

    if (this.LinkedList[hashtableNull] == null) {
        this.LinkedList[hashtableNull] = new LinkedList();
    }

    this.LinkedList[hashtableNull].push(business);
}

private int hashDiv (int indexR) {

    int keyD = 0;
    keyD = (indexR % this.LinkedList.length);

    return keyD;
}

private int hashMul (int indexR) {
    double A = 0.32189;
    //k = 11
   double keyM = (this.LinkedList.length * ((indexR*A) % 1));

   int result = (int) keyM;

    return result;
}

public void search(String key, String name, String state) {
    int ref = this.Ascii(key);
    int freeSpace = this.hashMul(ref);

    for(int i=0; i<this.LinkedList.length; i++){
        if(this.LinkedList[i] != null) {
            if(i == freeSpace){
                for(int j=0; j<this.LinkedList[i].size(); j++){
                    Node findNode = this.LinkedList[i].getElementAt(j);
                    if(findNode.getBusiness().getName().equals(name) && findNode.getBusiness().getState().equals(state)){
                        System.out.println("The index is: " + i + " with the position in the linked list: " + j );
                        System.out.println("The value was found, using the multiplication function: " + findNode.getBusiness().toString());
                        }
                    }
                }
            }
        }
    }
}
