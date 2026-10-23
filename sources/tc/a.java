package tc;
public final class a {
    public final String f46936a;
    public final int f46937b;
    public transient String f46938c;

    public a(String str, int i10) {
        this.f46936a = str;
        this.f46937b = i10;
    }

    public final String toString() {
        if (this.f46938c == null) {
            this.f46938c = String.format("%s:%d", this.f46936a, Integer.valueOf(this.f46937b));
        }
        return this.f46938c;
    }
}
