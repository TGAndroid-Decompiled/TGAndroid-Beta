package tc;
public final class a {
    public final String f46927a;
    public final int f46928b;
    public transient String f46929c;

    public a(String str, int i10) {
        this.f46927a = str;
        this.f46928b = i10;
    }

    public final String toString() {
        if (this.f46929c == null) {
            this.f46929c = String.format("%s:%d", this.f46927a, Integer.valueOf(this.f46928b));
        }
        return this.f46929c;
    }
}
