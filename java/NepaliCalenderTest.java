import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NepaliCalenderTest {

    @Test
    public void isLeadYearTest(){
        assertTrue(NepaliCalender.isLeadYear(2020));
        assertTrue(NepaliCalender.isLeadYear(2024));
        assertTrue(NepaliCalender.isLeadYear(2028));
        assertFalse(NepaliCalender.isLeadYear(2021));
        assertFalse(NepaliCalender.isLeadYear(2022));
    }
}