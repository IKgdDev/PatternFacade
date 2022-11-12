public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String aBin = "00000010"; //2
        String bBin = "00001000"; //8

        System.out.println(bins.mult(aBin, bBin));
        System.out.println(bins.sum(aBin, bBin));
    }

}
