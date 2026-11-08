package rc;
public final class a {
    public final String f54435a;
    public final int f54436b;
    public transient String f54437c;

    public a(String str, int i7) {
        this.f54435a = str;
        this.f54436b = i7;
    }

    public final String toString() {
        if (this.f54437c == null) {
            this.f54437c = String.format("%s:%d", this.f54435a, Integer.valueOf(this.f54436b));
        }
        return this.f54437c;
    }
}
