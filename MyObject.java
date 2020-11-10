package parsing;

import org.json.JSONObject;

public class MyObject {

	private JSONObject obj = new JSONObject();
	
	 public MyObject() {}
	 
	 public MyObject(JSONObject obj) {
	     this.obj=obj;
	 }
	 
	public JSONObject getobj() {
		return obj;
	}

	public int hashCode() {
		    final int prime = 31;
		    int result = 1;
		    for(String key : obj.keySet()) 
		     { 
		    		result = prime * result + ((obj.get(key) == null) ? 0 : obj.get(key).hashCode());
		     }
		    return result;
	 }

	  public boolean equals( Object temp ) {
				  
		     if (!(temp instanceof MyObject))
		        return false;
		     if ( obj.length() != ((MyObject)temp).obj.length() )
		        return false;
		     
		     for(String key : obj.keySet()) 
		     { 
		    	 
		     	if (!(obj.get(key).equals(((MyObject)temp).obj.get(key)))) {
		     		return false;
		     	}
		     }
		     return true;
		  }	
}
	
	



