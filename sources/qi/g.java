package qi;
public final class g {
    public static final g f53980b = new g(-1);
    public final int f53981a;

    public g(int i3) {
        if (i3 != -1 && i3 <= 0) {
            throw new IllegalArgumentException("height must be positive or -1");
        }
        this.f53981a = i3;
    }
}
