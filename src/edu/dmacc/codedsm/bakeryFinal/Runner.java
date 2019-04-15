package edu.dmacc.codedsm.bakeryFinal;

public class Runner {

    public static void main(String[] args) {

        BakeryFinal natesBakery;
        natesBakery = new finalBakery("Nates Bakery");

        BakeryFinal bakeTheGoods;
        bakeTheGoods = new finalBakery("Bake The Goods");


        System.out.println("natesBakery = " + natesBakery);

    }
    public static class finalBakery extends BakeryFinal {
        public finalBakery(String nates_bakery) {
        }

        @Override
        public void bakeTheGoods() {

        }
     }
}
















//    public static void main(String[] args) {
// System.out.println("natesBakery = " + natesBakery);

//
//        BakeryFinal natesBakery = natesBakery(natesBakery);
//
//
//        System.out.println("natesBakery = " + natesBakery);


//            BakeryFinal pamsBakery =
//
//                    new BakeryFinal(Arrays.asList("Spoon"),
//
//                            Arrays.asList("Pam"),
//
//                            Arrays.asList("Cake Mix"),
//
//                            100000000.0d,

//                            false);
//
//            System.out.println("pamsBakery = " + pamsBakery);








