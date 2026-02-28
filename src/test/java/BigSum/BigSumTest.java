package BigSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BigSumTest {

    @Test
    public void given_abc_def_throws_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> BigSum.add("abc", "def"));
    }

    @Test
    public void given_abc_123_throws_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> BigSum.add("abc", "123"));
    }

    @Test
    public void given_123_abc_throws_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> BigSum.add("123", "abc"));
    }

    @Test
    public void given_123_plus_123_returns_246() {
        assertEquals("246", BigSum.add("123", "123"));
    }

    @Test
    public void given_900_plus_100_returns_1000() {
        assertEquals("1000", BigSum.add("900", "100"));
    }

    @Test
    public void given_888_plus_112_returns_1000() {
        assertEquals("1000", BigSum.add("888", "112"));
    }

    @Test
    public void given_888_plus_113_returns_1001() {
        assertEquals("1001", BigSum.add("888", "113"));
    }

    @Test
    public void given_88888888888_plus_11111111113_returns_100000000001() {
        assertEquals("100000000001", BigSum.add("88888888888", "11111111113"));
    }

    @Test
    public void given_88888888888_plus_11111111114_returns_100000000002() {
        assertEquals("100000000002", BigSum.add("88888888888", "11111111114"));
    }

    @Test
    public void given_1234567890123456789012345_plus_8765432109876543210987655_returns_10000000000000000000000000() {
        assertEquals("10000000000000000000000000", BigSum.add("1234567890123456789012345", "8765432109876543210987655"));
    }

    @Test
    public void given_strings_9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999_plus_9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999_returns_19999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999998() {
        assertEquals("19999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999998", BigSum.add("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999", "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"));
    }

    @Test
    public void given_98_plus_1_returns_99() {
        assertEquals("99", BigSum.add("98", "1"));
    }

    @Test
    public void given_99_plus_1_returns_100() {
        assertEquals("100", BigSum.add("99", "1"));
    }

    @Test
    public void given_1_multipliedBy_1_returns_1() {
        assertEquals("1", BigSum.multiply("1", "1"));
    }

    @Test
    public void given_2_multipliedBy_2_returns_4() {
        assertEquals("4", BigSum.multiply("2", "2"));
    }

    @Test
    public void given_3_multipliedBy_3_returns_9() {
        assertEquals("9", BigSum.multiply("3", "3"));
    }

    @Test
    public void given_4_multipliedBy_4_returns_16() {
        assertEquals("16", BigSum.multiply("4", "4"));
    }

    @Test
    public void given_5_multipliedBy_5_returns_25() {
        assertEquals("16", BigSum.multiply("4", "4"));
    }

    @Test
    public void given_6_multipliedBy_6_returns_36() {
        assertEquals("36", BigSum.multiply("6", "6"));
    }

    @Test
    public void given_7_multipliedBy_7_returns_49() {
        assertEquals("49", BigSum.multiply("7", "7"));
    }

    @Test
    public void given_8_multipliedBy_8_returns_64() {
        assertEquals("64", BigSum.multiply("8", "8"));
    }

    @Test
    public void given_9_multipliedBy_9_returns_81() {
        assertEquals("81", BigSum.multiply("9", "9"));
    }

    @Test
    public void given_10_multipliedBy_10_returns_100() {
        assertEquals("100", BigSum.multiply("10", "10"));
    }

    @Test
    public void given_12_345_multipliedBy_67_890_returns_838_102_050() {
        assertEquals("838102050", BigSum.multiply("12345", "67890"));
    }

    @Test
    public void given_2_multipliedBy_54_returns_108() {
        assertEquals("108", BigSum.multiply("2", "54"));
        assertEquals("56088", BigSum.multiply("123", "456"));
        assertEquals("998001", BigSum.multiply("999", "999"));
        assertEquals("1000", BigSum.multiply("25", "40"));
        assertEquals("12338766", BigSum.multiply("9999", "1234"));
        assertEquals("45", BigSum.multiply("5", "9"));
        assertEquals("0", BigSum.multiply("0", "999999"));
    }
//
//    @Test
//    public void testy() {
//        assertEquals("0", BigSum.subtract("2", "2"));
//    }
//
//    @Test
//    public void testyyyy() {
//        assertEquals("1", BigSum.subtract("3", "2"));
//    }
}