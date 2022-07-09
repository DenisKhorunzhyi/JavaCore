package Main;

public class Enam {

        public static enum Month {
            JANUARY(31, Enam.Seasons.WINTER),
            FEBRUARY(28, Enam.Seasons.WINTER),
            MARCH(31, Enam.Seasons.SPRING),
            APRIL(30, Enam.Seasons.SPRING),
            MAY(31, Enam.Seasons.SPRING),
            JUNE(30, Enam.Seasons.SUMMER),
            JULY(31, Enam.Seasons.SUMMER),
            AUGUST(31, Enam.Seasons.SUMMER),
            SEPTEMBER(30, Enam.Seasons.FALL),
            OCTOBER(31, Enam.Seasons.FALL),
            NOVEMBER(30, Enam.Seasons.FALL),
            DECEMBER(31, Enam.Seasons.WINTER);

            int day;
            Enam.Seasons seasons;

            private Month(int day, Enam.Seasons seasons) {
                this.day = day;
                this.seasons = seasons;
            }

            public int getDay() {
                return this.day;
            }

            public Enam.Seasons getSeasons() {
                return this.seasons;
            }
        }

        public static enum Seasons {
            WINTER,
            SPRING,
            SUMMER,
            FALL;

            private Seasons() {
            }
        }
    }
