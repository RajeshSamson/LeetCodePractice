package com.leetcode.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

class CharacterReplacementTest {

    private CharacterReplacement chr;

    @BeforeEach
    void setUp() {
        chr = new CharacterReplacement();
    }

    @ParameterizedTest
    @MethodSource("collectionProvider")
    void replaceTest(String input, char replace, String replaceWith, String expected) {
        Assertions.assertEquals(chr.replace(input, replace, replaceWith), expected);
    }

    public static Collection<Object[]> collectionProvider() {
        return Arrays.asList(new Object[][]{
                {"10.10.129.86", '.', "[.]", "10[.]10[.]129[.]86"},
                {"1.1000000", '.', "[.]", "1[.]1000000"},
                {"1", '.', "[.]", "1"},
                {"10..", '.', "[.]", "10[.][.]"},
        });
    }
}