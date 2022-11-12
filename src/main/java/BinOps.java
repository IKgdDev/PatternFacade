public class BinOps {
    public String sum(String aBin, String bBin) {
        int a = Integer.parseInt(aBin, 2);
        int b = Integer.parseInt(bBin, 2);

        int result = a + b;

        return Integer.toBinaryString(result);
    }

    public String mult(String aBin, String bBin) {
        int a = Integer.parseInt(aBin, 2);
        int b = Integer.parseInt(bBin, 2);

        int result = a * b;

        return Integer.toBinaryString(result);
    }
}
