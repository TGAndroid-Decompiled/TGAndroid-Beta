package tc;
public final class a {
    public final String f46932a;
    public final int f46933b;
    public transient String f46934c;

    public a(String str, int i10) {
        this.f46932a = str;
        this.f46933b = i10;
    }

    public final String toString() {
        if (this.f46934c == null) {
            this.f46934c = String.format("%s:%d", this.f46932a, Integer.valueOf(this.f46933b));
        }
        return this.f46934c;
    }
}
