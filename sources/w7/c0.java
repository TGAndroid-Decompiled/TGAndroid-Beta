package w7;
public abstract class c0 {
    public static boolean a(int i10, int i11) {
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    public static int b(int i10, int i11, boolean z10) {
        if (z10) {
            return i10 | i11;
        }
        return i10 & (~i11);
    }
}
