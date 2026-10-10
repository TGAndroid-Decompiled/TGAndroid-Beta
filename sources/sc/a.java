package sc;
public final class a {
    public final String f47932a;
    public final int f47933b;
    public transient String f47934c;

    public a(String str, int i10) {
        this.f47932a = str;
        this.f47933b = i10;
    }

    public final String toString() {
        if (this.f47934c == null) {
            this.f47934c = String.format("%s:%d", this.f47932a, Integer.valueOf(this.f47933b));
        }
        return this.f47934c;
    }
}
