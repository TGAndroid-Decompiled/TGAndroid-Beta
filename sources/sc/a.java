package sc;
public final class a {
    public final String f47888a;
    public final int f47889b;
    public transient String f47890c;

    public a(String str, int i10) {
        this.f47888a = str;
        this.f47889b = i10;
    }

    public final String toString() {
        if (this.f47890c == null) {
            this.f47890c = String.format("%s:%d", this.f47888a, Integer.valueOf(this.f47889b));
        }
        return this.f47890c;
    }
}
