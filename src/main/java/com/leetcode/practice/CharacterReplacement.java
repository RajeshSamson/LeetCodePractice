package com.leetcode.practice;

public class CharacterReplacement {

    /**
     * Replace the occurrence of the character with the provided character sequence
     *
     * @param value       - The input value.
     * @param replace     - The character to be replaced
     * @param replaceWith - The replacement string value.
     * @return - Returns replace {@code String}
     */
    public String replace(String value, char replace, String replaceWith) {
        StringBuilder sb = new StringBuilder();
        char[] ch = value.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == replace) {
                sb.append(replaceWith);
            } else {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }

 /*   public Boolean isPrime(final Integer number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }*/
}
