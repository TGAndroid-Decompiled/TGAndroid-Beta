package w7;
public abstract class f7 {
    public static int a(long j10) {
        if (j10 <= 2147483647L && j10 >= -2147483648L) {
            return (int) j10;
        }
        throw new RuntimeException(org.telegram.ui.Cells.c1.h(j10, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
    }
}
