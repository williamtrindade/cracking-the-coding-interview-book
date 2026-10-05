package CTCI11IsUnique;

import java.util.HashSet;

public class Solution {
    boolean isUnique(String str) {
        if (str.length() > 65536) {
            return false;
        }

        // Array fixo inicializado com false
        boolean[] charSet = new boolean[65536];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i); // Em Java, char é convertido implicitamente para int

            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }

        return true;
    }
}
// 1
// boolean isUnique(String str) {
//    HashSet<Character> set = new HashSet<>();
//    for (Character c: str.toCharArray()) {
//        if (set.contains(c)) {
//            return false;
//        }
//        set.add(c);
//    }
//    return true;
// }