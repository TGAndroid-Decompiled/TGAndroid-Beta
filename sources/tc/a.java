package tc;
public final class a {
    public final String f47371a;
    public final int f47372b;
    public transient String f47373c;

    public a(String str, int i10) {
        this.f47371a = str;
        this.f47372b = i10;
    }

    public final String toString() {
        if (this.f47373c == null) {
            this.f47373c = String.format("%s:%d", this.f47371a, Integer.valueOf(this.f47372b));
        }
        return this.f47373c;
    }
}
