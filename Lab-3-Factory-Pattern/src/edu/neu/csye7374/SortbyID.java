package edu.neu.csye7374;

import java.util.Comparator;

public class SortbyID implements Comparator<AbstractItemAPI> {
	    public int compare(AbstractItemAPI a, AbstractItemAPI b)
	    {
	        return a.getId() - b.getId();
	    }
}
