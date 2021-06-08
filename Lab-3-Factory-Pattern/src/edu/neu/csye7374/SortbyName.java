package edu.neu.csye7374;

import java.util.Comparator;

public class SortbyName implements Comparator<AbstractItemAPI> {
	    public int compare(AbstractItemAPI a, AbstractItemAPI b)
	    {
	    	return a.getName().compareTo(b.getName());
	    }
}
