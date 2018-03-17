public class HeadFlipYear {

    public static void main(String[] args){
        //needs to be minus 1 since for loop 0 based
        long daysInYearMinus1 = 364;
        //True for heads, false for tails
        boolean heads;
        long headsNum = 0;
        long tailsNum = 0;
        for (int j=0; j<=100; j++) {
            for (int i = 0; i <= daysInYearMinus1; i++) {
                heads = false;
                while (!heads) {
                    heads = flip();
                    if (heads) {
                        headsNum += 1;
                        heads = true;
                    } else {
                        tailsNum += 1;
                    }
                }
            }
        }
        System.out.println("Final heads count: " + headsNum/101);
        System.out.println("Final tails count: " + tailsNum/101);
    }

    private static boolean flip(){
        return Math.random() < 0.5;
    }
}