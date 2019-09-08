package com.test.logical;
import java.util.*;
public class Age {
	public static void main(String args[]){
		HashMap map=new HashMap();
		map.put(new Key(1,"HYD"), "HYD CITY");
		map.put(new Key(2,"BLR"), "BLR CITY");
		map.put(new Key(1,"CHE"), "CHE CITY");
		map.put(new Key(1,"MUMBAI"), "MUMBAI CITY");
		System.out.println(map.size());
		//Iterator it=map.keySet().iterator();
		Iterator it=map.entrySet().iterator();
		while(it.hasNext()){
		Object obj=it.next();
		Map.Entry entry=(Map.Entry)obj;
		System.out.println(entry.getKey().toString()+"\t"+entry.getValue());
		
		System.out.println(map);
			//System.out.println(map.get(it.next()));
		}
		System.out.println(map.size());
		
	}

}
class Key{
	int index;
	String Name;
	Key(int index,String Name){
		
		this.index=index;
		this.Name=Name;
	}
	public int hashcode(){
		return (int)5;
	}
	public boolean equals(Object obj){
		return true;
	}
	public String toString(){
		return Name;
	}
}
/*String key;
Key(String key){
	this.key=key;
	
}
public int hashcode(){
	int hash=(int)key.charAt(0);
	System.out.println("hash code for key:-" +key+ "=" +hash);
	return hash;
}
public boolean equals(Object obj){
	return this.key.equals(((Key)obj).key);
}
public String toString(){
	return key;
	
}*/