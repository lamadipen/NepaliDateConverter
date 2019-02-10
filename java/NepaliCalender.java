import java.util.*;

public class NepaliCalender {

    static List<List<Integer>> bs = new ArrayList<>();
    static Map<String, String> nepEngNumMap = new HashMap<>();

    public NepaliCalender() {
        bs.add(Arrays.asList(2000, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31));
        bs.add(Arrays.asList(2001, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2002, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2003, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2004, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31));
        bs.add(Arrays.asList(2005, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2006, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2007, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2008, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31));
        bs.add(Arrays.asList(2009, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2010, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2011, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2012, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30));
        bs.add(Arrays.asList(2013, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2014, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2015, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2016, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30));
        bs.add(Arrays.asList(2017, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2018, 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2019, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31));
        bs.add(Arrays.asList(2020, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2021, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2022, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30));
        bs.add(Arrays.asList(2023, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31));
        bs.add(Arrays.asList(2024, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2025, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2026, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2027, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31));
        bs.add(Arrays.asList(2028, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2029, 31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2030, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2031, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31));
        bs.add(Arrays.asList(2032, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2033, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2034, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2035, 30, 32, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31));
        bs.add(Arrays.asList(2036, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2037, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2038, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2039, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30));
        bs.add(Arrays.asList(2040, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2041, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2042, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2043, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30));
        bs.add(Arrays.asList(2044, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2045, 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2046, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2047, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2048, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2049, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30));
        bs.add(Arrays.asList(2050, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31));
        bs.add(Arrays.asList(2051, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2052, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2053, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30));
        bs.add(Arrays.asList(2054, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31));
        bs.add(Arrays.asList(2055, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2056, 31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2057, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2058, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31));
        bs.add(Arrays.asList(2059, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2060, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2061, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2062, 30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31));
        bs.add(Arrays.asList(2063, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2064, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2065, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2066, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31));
        bs.add(Arrays.asList(2067, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2068, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2069, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2070, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30));
        bs.add(Arrays.asList(2071, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2072, 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2073, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31));
        bs.add(Arrays.asList(2074, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2075, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2076, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30));
        bs.add(Arrays.asList(2077, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31));
        bs.add(Arrays.asList(2078, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2079, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30));
        bs.add(Arrays.asList(2080, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30));
        bs.add(Arrays.asList(2081, 31, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30));
        bs.add(Arrays.asList(2082, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30));
        bs.add(Arrays.asList(2083, 31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30));
        bs.add(Arrays.asList(2084, 31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30));
        bs.add(Arrays.asList(2085, 31, 32, 31, 32, 30, 31, 30, 30, 29, 30, 30, 30));
        bs.add(Arrays.asList(2086, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30));
        bs.add(Arrays.asList(2087, 31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30));
        bs.add(Arrays.asList(2088, 30, 31, 32, 32, 30, 31, 30, 30, 29, 30, 30, 30));
        bs.add(Arrays.asList(2089, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30));
        bs.add(Arrays.asList(2090, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30));

        nepEngNumMap.put("१","1");
        nepEngNumMap.put("२","2");
        nepEngNumMap.put("३","3");
        nepEngNumMap.put("४","4");
        nepEngNumMap.put("५","5");
        nepEngNumMap.put("६","6");
        nepEngNumMap.put("७","7");
        nepEngNumMap.put("८","8");
        nepEngNumMap.put("९","9");
        nepEngNumMap.put("०","0");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        NepaliCalender nepaliCalender = new NepaliCalender();

        //englishToNepali(2019,2,9);
        //englishToNepali(1943,2,9);
        //eng_to_nep(2019,2,9);
        String test = nepEngNumMap.get("१");
        System.out.println(test);

    }

    public static boolean isLeadYear(Integer year) {
        if (0 == year % 100) {
            if (0 == year % 400) {
                return true;
            } else {
                return false;
            }
        } else {
            if (0 == year % 4) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static String getNepaliMonth(int month) {

        switch (month) {
            case 1:
                return "Baishak";

            case 2:
                return "Jestha";

            case 3:
                return "Ashad";

            case 4:
                return "Shrawn";

            case 5:
                return "Bhadra";

            case 6:
                return "Ashwin";

            case 7:
                return "kartik";

            case 8:
                return "Mangshir";

            case 9:
                return "Poush";

            case 10:
                return "Magh";

            case 11:
                return "Falgun";

            case 12:
                return "Chaitra";
            default:
                throw new RuntimeException("The month you enter is not valid. Try with vaild month " + month);
        }
    }

    public static String getEnglishMonth(int month) {
        switch (month) {
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";
            default:
                throw new RuntimeException("The month you enter is not valid. Try with vaild month " + month);
        }
    }

    public static String getEnglishDayOfWeek(int day) {
        switch (day) {
            case 1:
                return "Sunday";

            case 2:
                return "Monday";

            case 3:
                return "Tuesday";

            case 4:
                return "Wednesday";

            case 5:
                return "Thursday";

            case 6:
                return "Friday";

            case 7:
                return "Saturday";
            default:
                throw new RuntimeException("The day you enter is not valid. Try with vaild day " + day);
        }
    }

    public static boolean isRangeEnglish(int year, int month, int day) {
        if (year < 1944 || year > 2033) {
            throw new RuntimeException("Supported only between 1944-2022");
        }

        if (month < 1 || month > 12) {
            throw new RuntimeException("Error! value 1-12 only");
        }

        if (day < 1 || day > 31) {
            throw new RuntimeException("Error! value 1-31 only");
        }
        return true;
    }

    public static boolean isRangeNepali(int year, int month, int day) {
        if (year < 2000 || year > 2089) {
            throw new RuntimeException("Supported only between 2000-2089");
        }

        if (month < 1 || month > 12) {
            throw new RuntimeException("Error! value 1-12 only");
        }

        if (day < 1 || day > 32) {
            throw new RuntimeException("Error! value 1-31 only");
        }
        return true;
    }

    public static void englishToNepali(int year, int month, int day) {
        try {
            isRangeEnglish(year, month, day);

            int[] engMonthRegularArr = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int[] engMonthLeapArr    = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int engYearHead = 1944; //spear head english date
            int totalEngDays = 0;

            //count total number of days in terms of year
            for (int i = 0; i < (year - engYearHead); i++) {
                if (isLeadYear(year)) {
                    for (int j = 0; j < 12; j++) {
                        totalEngDays += engMonthLeapArr[j];
                    }
                } else {
                   for (int j = 0; j < 12; j++){
                        totalEngDays += engMonthRegularArr[j];
                    }
                }
            }

            for (int i = 0; i < month; i++){
                if (isLeadYear(year)) {
                    totalEngDays += engMonthLeapArr[i];
                } else {
                    totalEngDays += engMonthRegularArr[i];
                }
            }
            System.out.println(totalEngDays);
            //count total number of days in terms of date
            //totalEngDays += day;
            System.out.println(totalEngDays);



            int nepYearHead = 2000; //spear hed neapli date
            int diffNepEngDayInMonth = 17;
            int totalNepDays = 0;
            totalNepDays = diffNepEngDayInMonth;
            int diffNepEngDayInWeek = 7;
            int i = 0;


            int diffNepEngMonth = 9;
            int j = diffNepEngMonth;
            int m = diffNepEngMonth;
            int y = nepYearHead;
            int a = 0;



            while(totalEngDays != 0){
                a  = bs.get(i).get(j);
                totalNepDays++;       //count the days
                diffNepEngDayInWeek++;  // count the days interms of 7 days

                if (totalNepDays > a) {
                    m++;
                    totalNepDays = 1;
                    j++;
                }
                if (diffNepEngDayInWeek > 7) {
                    diffNepEngDayInWeek = 1;
                }
                if (m > 12) {
                    y++;
                    m = 1;
                }
                if(j > 12){
                    j = 1;
                    i++;
                }
                totalEngDays--;
            }

            System.out.println("Total days in neplai" + totalNepDays);
            System.out.println("Nepali Year " + y);
            System.out.println("Nepali Month " + m);
            System.out.println("Nepal Month Full " + getNepaliMonth(m));
            System.out.println("Date " + totalNepDays);
            System.out.println("Day Full " + getEnglishDayOfWeek(diffNepEngDayInWeek));
            System.out.println("Day " + diffNepEngDayInWeek);

        } catch (Exception ex) {
            System.out.println("Out of Rannge"+ ex);
        }
    }

    public void englishToNepaliUnicode(String year, String month, String day ){

        //englishToNepali();

    }

}