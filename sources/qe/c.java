package qe;

public abstract class c {
    public static long a(int i10, int i11) {
        return ((long) (8388607 & i11)) | (((long) i10) << 32) | (((long) 60) << 24);
    }
}
