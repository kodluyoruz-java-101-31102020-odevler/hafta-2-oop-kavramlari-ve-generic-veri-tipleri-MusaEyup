package com.odev2.soru2.matrices;

public class Reflection {
	public static <T> Type getType(T[][] matrice){

        @SuppressWarnings("rawtypes")
		Class c = matrice.getClass();
        // getTypeName() return java.lang.Double (Integer, Float, Long....)
        String[] nameList = c.getTypeName().split("\\.");
        String type = nameList[nameList.length - 1].substring(0, nameList[nameList.length -1].length()-4).toUpperCase();

        return Type.valueOf(type);

    }

}
