package tc;
public final class a {
    public final String f46925a;
    public final int f46926b;
    public transient String f46927c;

    public a(String str, int i10) {
        this.f46925a = str;
        this.f46926b = i10;
    }

    public final String toString() {
        if (this.f46927c == null) {
            this.f46927c = String.format("%s:%d", this.f46925a, Integer.valueOf(this.f46926b));
        }
        return this.f46927c;
    }
}
