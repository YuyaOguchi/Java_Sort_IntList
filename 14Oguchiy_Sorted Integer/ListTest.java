// ****************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some 
// ints in it, and prints the list.
//          
// ****************************************************************

public class ListTest
{
    public static void main(String[] args)
    {
	IntList myList = new IntList(10);
	myList.add(100);
	myList.add(50);
	myList.add(200);
	myList.add(25);
	myList.add(30);
	myList.add(35);
	System.out.println(myList);
	
	SortedIntList sortedList = new SortedIntList(10);
	sortedList.add(100);
	sortedList.add(50);
	sortedList.add(200);
	sortedList.add(25);
	sortedList.add(30);
	sortedList.add(35);
	System.out.println(sortedList);
    }
}