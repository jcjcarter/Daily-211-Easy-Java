package com.company;

public class Main {

    public static void main(String[] args) {

        char f = args[0].charAt(0);
        String end = "AEIOU".contains(f+"") ?
                args[0].toLowerCase() : args[0].substring(1, args[0].length());
        String[] l = new String[3];
        l[0] = f=='B'?"Bo-"+end:"Bo B"+end;
        l[1] = f=='F'?"Fo-"+end:"Fo F"+end;
        l[2] = f=='M'?"Mo-"+end:"Mo M"+end;
        System.out.printf(
                "%s, %s %s,%nBonana fanna %s,%nFee fy %s,%n%s!",
                args[0], args[0], l[0], l[1], l[2], args[0]);
    }
}
