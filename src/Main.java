public class Main {
    public static void main(String[] args) {

        Holder<String> hs = new Holder<>("BitCode");
        hs.getData();

        Holder<Holder<String>> holderOfHolder = new Holder<Holder<String>>(hs);
        holderOfHolder.getData().getData();

        Holder<int[]> holderArray = new Holder<int[]>(
                new int[]{10, 20, 30, 40}
        );
        int[] array = holderArray.getData();



        /*Pair1 pair1 = new Pair1("roll", 100);
        pair1.display();
        Pair1 pair2 = new Pair1("name", "Vishal");
        pair2.display();*/

        /*Pair2 pair2 = new Pair2("code", "XYZ");
        pair2.display();*/

        /*Pair3<Float> pair31 = new Pair3<Float>("marks", 55.66f);
        pair31.display();

        Pair3<String> pair32 = new Pair3<String>("address", "Karve road, Pune");
        pair32.display();*/

        /*Pair4<Integer> pair41 = new Pair4<Integer>(101, "BitCode");
        pair41.display();

        Pair4<Float> pair42 = new Pair4<Float>(12.12f, "Pune");
        pair42.display();*/

        Pair5<Integer, String> p51 = new Pair5<Integer, String>(100, "Demo");
        p51.display();
        Pair5<String, Integer> p52 = new Pair5<String, Integer>("Demo", 100);
        p52.display();

    }
}
