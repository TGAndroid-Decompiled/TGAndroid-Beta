package tc;
public final class a {
    public final String f46935a;
    public final int f46936b;
    public transient String f46937c;

    public a(String str, int i10) {
        this.f46935a = str;
        this.f46936b = i10;
    }

    public final String toString() {
        if (this.f46937c == null) {
            this.f46937c = String.format("%s:%d", this.f46935a, Integer.valueOf(this.f46936b));
        }
        return this.f46937c;
    }
}
