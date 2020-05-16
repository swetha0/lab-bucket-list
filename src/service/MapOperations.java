package service;
import java.util.*;

import model.TouristPlace;

public class MapOperations
{
	Map<String,TouristPlace> map = new HashMap<String,TouristPlace>();
	Map<String,TouristPlace> linkedhash = new LinkedHashMap<String,TouristPlace>();
	Map<String,TouristPlace> treemap = new TreeMap<String,TouristPlace>();
	public Map add(TouristPlace places)
	{
		map.put(places.getRank(),places);
		linkedhash.put(places.getRank(),places);
		treemap.put(places.getRank(),places);
		return (HashMap<String, TouristPlace>)map;
	}
	public Map sortRandomly(TouristPlace places)
	{
	    return (HashMap<String, TouristPlace>)map;
    }
	public Object sortInEntryOrder(TouristPlace tp)
	{
        return linkedhash; 	
	}
	public Object sortAlphabetically(TouristPlace tp)
	{
        return treemap; 	
	}
	public Object reset( HashMap<Integer, TouristPlace> bucketList)
	{
		bucketList.clear();
		return bucketList;
	}
	public HashMap<String,TouristPlace> remove(TouristPlace places)
	{
	    map.remove(places.getRank(),places);
		linkedhash.remove(places.getRank(),places);
		treemap.remove(places.getRank(),places);
		return  (HashMap<String, TouristPlace>) map;
	}
}