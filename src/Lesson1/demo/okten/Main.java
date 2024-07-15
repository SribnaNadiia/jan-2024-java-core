package Lesson1.demo.okten;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    /*public static void main(String[] args) {

        String hello0kten = "Hello okten!"; *//*String - тільки стрінга*//*
     *//*var helloOkten1 = 1;
        Integer hello0kten2 = 1;*//*
        System.out.println(hello0kten);
//        sout
    }*/
    public static void main(String[] args) {
        System.out.println("Hello Okten");

        var variable = "test"; /*after Compilation -> String Variable - NOT Dinamic*/

        variable = "test2"; /*valid*/
//        variable = 1; not valid
//        variable = false; not valid
//        variable = <ONLY STRING>;


        String text = "lorem ipsum";
        String newText = new String("lorem ipsum");
        String oldText = "lorem ipsum";

        System.out.println(text.equals(newText)); /*true*/
        System.out.println(text == newText); /*false*/
        System.out.println(text == oldText); /*true*/

        boolean bool = true; /*false*/

        byte b = 127; /*-128 - 127*/
        short s = 23767; /*2^15 - 1*/
        int i = 2_000_000_000; /*2^31-1*/
        long l = 546516546843236456L; /*2^63-1*/

        double d = 2.32;
        BigDecimal bd = new BigDecimal("2.32");
        BigInteger bi = new BigInteger("32");

        float f = 3.14F;

        char c = '2';

        /*Test.printHello();*/
        /*Demo.printHello();*/
        /*private - only in class
        protected
         <no modifier> (Test.printHello) - only in Packages - package-private
        private*/

        Product laptop = new Product("Lenovo", new BigDecimal("20000"));
        System.out.println(laptop.getName());
        System.out.println(laptop.getPrice());
        laptop.setPrice(new BigDecimal("15000"));
        System.out.println(laptop.getPrice());

        var pencil = new Product("pen", new BigDecimal("10"));

      /*  var reviews = new String[10];
        reviews[0] = "good job";
        pencil.setReviews(reviews);*/
        pencil.addReview("Have are nice day");
        pencil.addReview("Have are bad day");
        /*System.out.println(Arrays.toString(pencil.getReviews()));*/

        System.out.println(pencil.getReviews());

        for (int index = 0; index < pencil.getReviews().size(); index++)
            System.out.println(pencil.getReviews().get(index));


        for (String review : pencil.getReviews()) {
            System.out.println(review);
        }

        int index = 0;
        while (index < pencil.getReviews().size()) {
            System.out.println(pencil.getReviews().get(index));
//            index = index + 1;
            index++;
        }


        if (pencil.getReviews().size() > 0){
            System.out.println("Pen have reviews");
        }

       /* do {

        } while ();*/
    }
}

//psvm





























