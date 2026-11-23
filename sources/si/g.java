package si;
public final class g {
    public static final g f57552b = new g(-1);
    public final int f57553a;

    public g(int i7) {
        if (i7 != -1 && i7 <= 0) {
            throw new IllegalArgumentException("height must be positive or -1");
        }
        this.f57553a = i7;
    }
}
