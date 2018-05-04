package com.erbil.mps.constant;

public enum StatusEnum {
	    
	    ACTIVE("a", "Aktif"),
	    DEACTIVE("d", "Deaktif"),
	    SUSPENDED("s", "Suspend"),
	    HOTLINE("h", "Hotline"),
	    TEMPORARY_ERROR("te", "te");
		
	    private String value;
	    private String code;
	    
	    private StatusEnum(String code, String value) {
	        this.value = value;
	        this.code = code;
	    }

	    public String value() {
	        return value;
	    }
	    
	    public String code() {
	        return code;
	    }
	    
	    public static StatusEnum findByAbbr(String abbr){
	        for(StatusEnum v : values()){
	            if( v.code().equals(abbr)){
	                return v;
	            }
	        }
	        return null;
	    }
	    
	    
}
