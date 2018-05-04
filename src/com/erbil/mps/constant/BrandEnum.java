package com.erbil.mps.constant;

public enum BrandEnum {
	    
		AVEA("0", "AVEA"),
		FENERCELL("1", "FENERCELL"),
		GSMOBILE("3", "GSMOBILE"),
		KARTALCELL("2", "KARTALCELL"),
		TRABZONCELL("4", "TRABZONCELL"),
		TTNET("7", "TTNET"),
		BIMCELL("9", "BIMCELL"),
		PTTCELL("10", "PTTCELL"),
		POCELL("11", "POCELL"),
		TEKNOSAMOBIL("12", "TEKNOSA");
		
	    private String value;
	    private String code;
	    
	    private BrandEnum(String code, String value) {
	        this.value = value;
	        this.code = code;
	    }

	    public String value() {
	        return value;
	    }
	    
	    public String code() {
	        return code;
	    }
	    
	    public static BrandEnum findByAbbr(String abbr){
	        for(BrandEnum v : values()){
	            if( v.code().equals(abbr)){
	                return v;
	            }
	        }
	        return null;
	    }
	    
	    
}
