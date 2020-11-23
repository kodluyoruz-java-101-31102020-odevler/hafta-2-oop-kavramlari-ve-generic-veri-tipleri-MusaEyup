package com.odev2.soru2.matrices;

import java.lang.reflect.Array;

public class MatriceMultiplay {
	public static <T extends Number> T[][] multiplay(Class<T> dataType, T[][] matriceA, T[][] matriceB){

        @SuppressWarnings("unchecked")
		T[][] resultMatrice = (T[][]) Array.newInstance(dataType,matriceA.length,matriceB[0].length );
        boolean isNull ;
        Type dType = Reflection.getType(resultMatrice);

        for (int i = 0; i < matriceA.length; i++) {
            for (int j = 0; j < matriceB[0].length; j++) {
                for (int k = 0; k < matriceA[0].length; k++) {

                    //resultMatrice'in varsayýlan deðeri null, type cast yaptýðým zaman runtime hatasaý alýyorum
                    //buyüzden null olup olmadýðýný kontrol ediyorum
                    if (resultMatrice[i][j] == null){
                        isNull = true;
                    }
                    else{
                        isNull = false;
                    }
                    resultMatrice[i][j] =  multiplay(dType, matriceA[i][k] , matriceB[k][j], resultMatrice[i][j], isNull);

                }
                
            }
            
        }
        return resultMatrice;
    }
    @SuppressWarnings("unchecked")
	private static  <T> T multiplay(Type type, T a, T b, T c, boolean isNull){
        if(type == Type.DOUBLE){
            Double result =  (isNull) ? (double) a * (double) b  :  (double) a * (double) b + (double) c;
            return (T) result;
        }
        else if (type == Type.FLOAT){
            Float result = (isNull) ? (float) a * (float) b :(float) a * (float) b + (float) c;
            return (T) result;
        }
        else if (type == Type.INTEGER){
            Integer result = (isNull) ? (int) a * (int) b: (int) a * (int) b + (int) c;
            return (T) result;
        }
        else {
            Long result =  (isNull) ? (long) a * (long) b : (long) a * (long) b + (long) c;
            return (T) result;
        }
    }

}
