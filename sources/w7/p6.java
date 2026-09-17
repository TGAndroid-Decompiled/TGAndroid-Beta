package w7;
public abstract class p6 {
    public static int a(long j3) {
        if (j3 <= 2147483647L && j3 >= -2147483648L) {
            return (int) j3;
        }
        throw new RuntimeException(org.telegram.ui.Cells.p6.h(j3, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
    }
}
