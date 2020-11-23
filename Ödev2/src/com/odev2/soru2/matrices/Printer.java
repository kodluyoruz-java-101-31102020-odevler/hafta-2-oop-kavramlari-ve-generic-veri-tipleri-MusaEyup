package com.odev2.soru2.matrices;

public class Printer {
	
	public static<T> void print(T[][] t){

        if (Reflection.getType(t) == Type.DOUBLE || Reflection.getType(t) == Type.FLOAT) {

            //Consolda daha iyi bir þekilde gözüksün diye Double veya Float tipinde ise String.format kullan
            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[0].length; j++) {
                    System.out.print(String.format("%.2f " , t[i][j]) );
                }
                System.out.println();
            }

        }


        else {

            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[0].length; j++){
                    System.out.print(t[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

}
