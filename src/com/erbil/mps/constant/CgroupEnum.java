package com.erbil.mps.constant;

public enum CgroupEnum {
		
		UNDEFINED("0", "UNDEFINED"),
	    MASS("1", "MASS"),
	    CORPORATE("2", "CORPORATE"),
	    SME("3", "SME");
		
	    private String value;
	    private String code;
	    
	    private CgroupEnum(String code, String value) {
	        this.value = value;
	        this.code = code;
	    }

	    public String value() {
	        return value;
	    }
	    
	    public String code() {
	        return code;
	    }
	    
	    public static CgroupEnum findByAbbr(String abbr){
	        for(CgroupEnum v : values()){
	            if( v.code().equals(abbr)){
	                return v;
	            }
	        }
	        return null;
	    }
	    
	    
}
