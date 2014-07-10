
public class OrderedArray {

    private long[] a;
    private int nElems;

    public OrderedArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public int size(){
        return nElems;
    }

    public int find(long searchKey){
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;

        while(true){
            curIn = (lowerBound + upperBound) / 2;
            if(a[curIn] == searchKey){
                return curIn; // found it
            } else if(lowerBound > upperBound) {
                return nElems;
            } else {
                if(a[curIn] < searchKey){
                    lowerBound = curIn + 1;

                    System.out.println("Lower Bound " + lowerBound);

                } else {
                    upperBound = curIn - 1;
                    System.out.println("Upper Bound " + lowerBound);
                }
            }
        }
    }

    public void insert(long value) {
        int j;
        for(j=0; j<nElems; j++)
            if(a[j] > value) break;
        for(int k=nElems; k>j; k--)
            a[k] = a[k-1];
        a[j] = value;
        nElems++;
    }

    public boolean delete(long value)
    {
        int j = find(value);
        if(j==nElems) // can’t find it
            return false;
        else // found it
        {
            for(int k=j; k<nElems; k++) // move bigger ones down
                a[k] = a[k+1];
            nElems--; // decrement size
            return true;
        }
    } // end delete()

    public void display() // displays array contents
    {
        for(int j=0; j<nElems; j++) // for each element,
            System.out.println(a[j] + " "); // display it
             System.out.println("");
    }

}



class OrderedArrayApp{
    public static void main(String[] args){
        int maxSize = 100;
        OrderedArray arr;
        arr = new OrderedArray(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        int searchKey = 55;
        if(arr.find(searchKey) != arr.size()){
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can not find " + searchKey);
        }

        arr.display();
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();


    }
}



