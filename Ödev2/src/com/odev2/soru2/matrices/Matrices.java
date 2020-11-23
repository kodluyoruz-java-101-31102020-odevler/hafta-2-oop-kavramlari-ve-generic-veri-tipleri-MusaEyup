package com.odev2.soru2.matrices;

import java.lang.reflect.Array;

public class Matrices <T extends Number>  {
	private int col;
    private int row;
    private T[][] matrice;

    // getters and setters
    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public T[][] getMatrice() {

        return matrice;
    }

    public void setMatrice(T[][] matrice) {
        this.matrice = matrice;
    }

    // Kurucu(constructor)
    @SuppressWarnings("unchecked")
	public Matrices(Class<T> datatype, int col, int row) {
        this.col = col;
        this.row = row;
        this.matrice = (T[][]) Array.newInstance(datatype, row, col);

    }

    // Fill matrice with random numbers
    public void fill() {
        // get matris dataType from static getType function
        Type dataType = Reflection.getType(this.getMatrice());
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {

                // generate random numbers
                matrice[i][j] = generateRandomNumber(dataType);
            }

        }

    }

    // Generate number
    @SuppressWarnings("unchecked")
	private T generateRandomNumber(Type type){
        if(type == Type.DOUBLE){
            Double randomDouble =  (Math.random() * 100);

            return (T) randomDouble;
        }
         else if (type == Type.FLOAT){
             Float randomFloat = (float) (Math.random() * 100);
            return (T) randomFloat;
        }
         else if (type == Type.INTEGER){
             Integer randomInteger = (int) (Math.random() * 100);
             return (T) randomInteger;
        }
         else {
             Long randomLong = (long) (Math.random() * 100);
             return (T) randomLong;
        }

    }

}
