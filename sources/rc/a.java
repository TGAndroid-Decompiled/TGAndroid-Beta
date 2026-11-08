package rc;
public final class a {
    public final String f54434a;
    public final int f54435b;
    public transient String f54436c;

    public a(String str, int i7) {
        this.f54434a = str;
        this.f54435b = i7;
    }

    public final String toString() {
        if (this.f54436c == null) {
            this.f54436c = String.format("%s:%d", this.f54434a, Integer.valueOf(this.f54435b));
        }
        return this.f54436c;
    }
}
