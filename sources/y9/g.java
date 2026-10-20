package y9;
public final class g {
    public static final g f50100c = new g(0, 0);
    public final int f50101a;
    public final int f50102b;

    public g(int i10, int i11) {
        this.f50101a = i10;
        this.f50102b = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f50101a);
        sb2.append(", length = ");
        return a1.g.n(this.f50102b, "]", sb2);
    }
}
