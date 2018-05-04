package com.erbil.mps.constant;

public enum CtypeEnum {
	
		POSTPAID("1", "Postpaid"),
		PREPAID("2", "Prepaid"),
		PREPAID_NODATA("3", "NODATA"),
	    NOT_FOUND("4", "NOT_FOUND");
		
	    private String value;
	    private String code;
	    
	    private CtypeEnum(String code, String value) {
	        this.value = value;
	        this.code = code;
	    }

	    public String value() {
	        return value;
	    }
	    
	    public String code() {
	        return code;
	    }
	    
	    public static CtypeEnum findByAbbr(String abbr){
	        for(CtypeEnum v : values()){
	            if( v.code().equals(abbr)){
	                return v;
	            }
	        }
	        return null;
	    }
	    
	    
}
