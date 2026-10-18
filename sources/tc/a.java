package tc;
public final class a {
    public final String f46975a;
    public final int f46976b;
    public transient String f46977c;

    public a(String str, int i10) {
        this.f46975a = str;
        this.f46976b = i10;
    }

    public final String toString() {
        if (this.f46977c == null) {
            this.f46977c = String.format("%s:%d", this.f46975a, Integer.valueOf(this.f46976b));
        }
        return this.f46977c;
    }
}
