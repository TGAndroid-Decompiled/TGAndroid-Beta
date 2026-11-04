package x7;
public abstract class u {
    public static boolean a(int i3, int i10) {
        if ((i3 & i10) != 0) {
            return true;
        }
        return false;
    }

    public static int b(int i3, int i10, boolean z10) {
        if (z10) {
            return i3 | i10;
        }
        return i3 & (~i10);
    }
}
