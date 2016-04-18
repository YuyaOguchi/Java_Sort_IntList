public class SortedIntList extends IntList
{

    //------------------------------------------------------------- 
    // Constructor -- creates an integer list of a given size.
    //------------------------------------------------------------- 
    public SortedIntList(int size)
    {
        super(size);
    }

    //------------------------------------------------------------- 
    // Adds an integer to the list.  If the list is full,
    // prints a message and does nothing.
    //------------------------------------------------------------- 

    public void add(int value)
    {
        if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else
        {
            list[numElements] = value;
            numElements++;
        }
        
        //numElement is number in array 
           for (int i = 0 ; i < numElements; i++)
        {
            for (int j = 1 ; j < numElements; j++)
            {
                if (list[j - 1] > list [j])
                {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        
    }
}