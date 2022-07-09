package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Scanner(System.in);
        String month = "july";
        System.out.println("Is month " + month + " exist? | " + IsMonthExist(month));
        PrintSamePeriodMonth("Summer");
        PrintSameDayMonth(28);
        PrintLessDayMonth(31);
        PrintGreaterDayMonth(30);
        PrintNextSeason("fall");
        PrintPreviousSeason("winter");
        PrintMonthWithEvenDays();
        PrintMonthWithNotEvenDays();
        PrintIsMontHashEvenDays("July");
    }

    static Boolean IsMonthExist(String month) {
        String monthUpper = month.toUpperCase();
        return Main.Enam.Month.valueOf(monthUpper).toString().equals(monthUpper) ? Boolean.TRUE : Boolean.FALSE;
    }

    static void PrintSamePeriodMonth(String period) {
        System.out.println("Same " + period + " period month ");
        period = period.toUpperCase(Locale.ROOT);
        Main.Enam.Month[] var1 = Main.Enam.Month.values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Main.Enam.Month month = var1[var3];
            if (month.getSeasons().toString().equals(period)) {
                System.out.println(String.valueOf(month));
            }
        }

    }

    static void PrintSameDayMonth(int day) {
        System.out.println("Same " + day + " days month ");
        Main.Enam.Month[] var1 = Main.Enam.Month.values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Main.Enam.Month month = var1[var3];
            if (month.getDay() == day) {
                System.out.println(String.valueOf(month));
            }
        }

    }

    static void PrintLessDayMonth(int day) {
        System.out.println("Less " + day + " days month ");
        Main.Enam.Month[] var1 = Main.Enam.Month.values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Main.Enam.Month month = var1[var3];
            if (month.getDay() < day) {
                System.out.println(String.valueOf(month));
            }
        }

    }

    static void PrintGreaterDayMonth(int day) {
        System.out.println("Greater " + day + " days month ");
        Main.Enam.Month[] var1 = Main.Enam.Month.values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Main.Enam.Month month = var1[var3];
            if (month.getDay() > day) {
                System.out.println(String.valueOf(month));
            }
        }

    }

    static void PrintNextSeason(String period) {
        System.out.println("Next season after " + period + " period  ");
        period = period.toUpperCase(Locale.ROOT);
        Main.Enam.Seasons[] var1 = Main.Enam.Seasons.values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Main.Enam.Seasons seasons = var1[var3];
            Main.Enam.Seasons[] seasonArray = Main.Enam.Seasons.values();
            if (Main.Enam.Seasons.valueOf(period).toString().equals(period)) {
                try {
                    System.out.println(String.valueOf(seasonArray[Main.Enam.Seasons.valueOf(period).ordinal() + 1]));
                } catch (Exception var7) {
                    System.out.println("WINTER");
                }
                break;
            }
        }

    }

    static void PrintPreviousSeason(String period) {
        System.out.println("Next season previous " + period + " period  ");
        period = period.toUpperCase(Locale.ROOT);
        Main.Enam.Seasons[] var1 = Main.Enam.Seasons.values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Main.Enam.Seasons seasons = var1[var3];
            Main.Enam.Seasons[] seasonArray = Main.Enam.Seasons.values();
            if (Main.Enam.Seasons.valueOf(period).toString().equals(period)) {
                try {
                    System.out.println(String.valueOf(seasonArray[Main.Enam.Seasons.valueOf(period).ordinal() - 1]));
                } catch (Exception var7) {
                    System.out.println("FALL");
                }
                break;
            }
        }

    }

    static void PrintMonthWithEvenDays() {
        System.out.println("Month with even days ");
        Main.Enam.Month[] var0 = Main.Enam.Month.values();
        int var1 = var0.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            Main.Enam.Month month = var0[var2];
            if (month.getDay() % 2 == 0) {
                System.out.println(String.valueOf(month));
            }
        }

    }

    static void PrintMonthWithNotEvenDays() {
        System.out.println("Month with not even days ");
        Main.Enam.Month[] var0 = Main.Enam.Month.values();
        int var1 = var0.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            Main.Enam.Month month = var0[var2];
            if (month.getDay() % 2 != 0) {
                System.out.println(String.valueOf(month));
            }
        }

    }

    static void PrintIsMontHashEvenDays(String month) {
        if (IsMonthExist(month)) {
            String monthUpper = month.toUpperCase();
            Main.Enam.Month[] var2 = Main.Enam.Month.values();
            int var3 = var2.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                Main.Enam.Month Month = var2[var4];
                if (Month.valueOf(monthUpper).toString().equals(monthUpper)) {
                    if (Month.getDay() % 2 == 0) {
                        System.out.print("Month " + month + " has even umber of days ");
                    } else {
                        System.out.print("Month " + month + " does not have even umber of days ");
                    }
                    break;
                }
            }
        } else {
            System.out.println("Month does not exist");
        }

    }
}
