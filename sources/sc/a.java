package sc;
public final class a {
    public final String f47978a;
    public final int f47979b;
    public transient String f47980c;

    public a(String str, int i10) {
        this.f47978a = str;
        this.f47979b = i10;
    }

    public final String toString() {
        if (this.f47980c == null) {
            this.f47980c = String.format("%s:%d", this.f47978a, Integer.valueOf(this.f47979b));
        }
        return this.f47980c;
    }
}
