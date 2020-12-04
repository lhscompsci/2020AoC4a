package com.wtxcompsci;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner inf = new Scanner(new File(("input.dat")));


        ArrayList<Map<String, String>> pptList = new ArrayList<>();

        Map<String, String> m = new TreeMap<>();

 //       int counter = 0;

        while (inf.hasNextLine()) {
            String line = inf.nextLine();
            if (!line.equals("")) {
                Scanner parts = new Scanner(line);
                while (parts.hasNext()) {
                    Scanner part = new Scanner(parts.next());
                    part.useDelimiter(":");
                    m.put(part.next(), part.next());
                }
            } else {
 //               System.out.println("set "+ ++counter+": "+m);
                pptList.add(m);
                m = new TreeMap<>();
            }
        }

//        System.out.println();
//        System.out.println(pptList);
//        System.out.println();

        int ans = 0, ans2 = 0;

        for (Map<String, String> stringStringMap : pptList) {
//            System.out.println(stringStringMap);
            if ((8 == stringStringMap.keySet().size()) || (!stringStringMap.containsKey("cid") && (stringStringMap.keySet().size() == 7)))
                ans++;


        }

        //203 is too low
        //259 is too high


        System.out.println(ans);
//        System.out.println(ans2);

    }


}
