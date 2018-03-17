/*
My implementation of this very popular recursive puzzle.
Using a source pillar, and 2 other pillars, move a series of disks from the source pillar to one of the other pillars.
At no time can a bigg disk be on top of a smaller disk.

I am just running the program from console. it looks to be working fine.
 */

import java.util.Arrays;

public class TowersOfHanoi {

    public static void main(String[] args){
        System.out.println("***TOWERS OF HANOI***");
        int[] discs = {1,2,3,4,5};
        hanoiMove(discs, "Source", "Option A", "Option B");
    }

    public static void hanoiMove(int[] disks, String source, String optionA, String optionB){
        if (disks.length == 0){
            return;
        }
        hanoiMove((Arrays.copyOfRange(disks, 1, disks.length)), source, optionB, optionA);
        System.out.println("Move disc" + disks.length + " from " + source + " to " + optionB);
        hanoiMove((Arrays.copyOfRange(disks, 1, disks.length)), optionA, source, optionB);
    }


}
