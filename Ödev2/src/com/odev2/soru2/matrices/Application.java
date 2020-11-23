package com.odev2.soru2.matrices;

public class Application {
	public static void main(String[] args) {
		
        runIntegerMatrice();  
        runLongMatrice();
        runDoubleMatrice();
        runFloatMatrice();

    }
    public static void runIntegerMatrice(){

        Matrices<Integer> a = new Matrices<Integer>(Integer.class,3,3);
        Matrices<Integer> b = new Matrices<Integer>(Integer.class,3,3);

        a.fill();
        b.fill();

        System.out.println("1. Matrice (Integer)");
        Printer.print(a.getMatrice());

        System.out.println("2. Matrice (Integer)");
        Printer.print(b.getMatrice());

        Integer[][] result = MatriceMultiplay.multiplay(Integer.class, a.getMatrice(), b.getMatrice());
        System.out.println("Ýki (Integer) Matrisin Çarpýmý: ");
        Printer.print(result);
    }
    public static void runLongMatrice(){
        Matrices<Long> a = new Matrices<Long>(Long.class,3,3);
        Matrices<Long> b = new Matrices<Long>(Long.class,3,3);

        a.fill();
        b.fill();

        System.out.println("1. Matrice (Long)");
        Printer.print(a.getMatrice());

        System.out.println("2. Matrice (Long)");
        Printer.print(b.getMatrice());

        Long[][] result = MatriceMultiplay.multiplay(Long.class, a.getMatrice(), b.getMatrice());
        System.out.println("Ýki (Long) Matrisin Çarpýmý: ");
        Printer.print(result);
    }
    public static void runDoubleMatrice(){
        Matrices<Double> a = new Matrices<Double>(Double.class,3,3);
        Matrices<Double> b = new Matrices<Double>(Double.class,3,3);

        a.fill();
        b.fill();

        System.out.println("1. Matrice (Double)");
        Printer.print(a.getMatrice());

        System.out.println("2. Matrice (Double)");
        Printer.print(b.getMatrice());

        Double[][] result = MatriceMultiplay.multiplay(Double.class, a.getMatrice(), b.getMatrice());
        System.out.println("Ýki (Double) Matrisin Çarpýmý: ");
        Printer.print(result);
    }
    public static void runFloatMatrice(){
        Matrices<Float> a = new Matrices<Float>(Float.class,3,3);
        Matrices<Float> b = new Matrices<Float>(Float.class,3,3);

        a.fill();
        b.fill();

        System.out.println("1. Matrice (Float)");
        Printer.print(a.getMatrice());

        System.out.println("2. Matrice (Float)");
        Printer.print(b.getMatrice());

        Float[][] result = MatriceMultiplay.multiplay(Float.class, a.getMatrice(), b.getMatrice());
        System.out.println("Ýki (Float) Matrisin Çarpýmý: ");
        Printer.print(result);
    }

}
