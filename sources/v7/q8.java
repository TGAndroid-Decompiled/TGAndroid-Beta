package v7;
public abstract class q8 {
    public static int a(long j10) {
        if (j10 <= 2147483647L && j10 >= -2147483648L) {
            return (int) j10;
        }
        throw new RuntimeException(org.telegram.ui.Cells.f1.n(j10, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
    }
}
