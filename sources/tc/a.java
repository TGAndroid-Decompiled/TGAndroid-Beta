package tc;
public final class a {
    public final String f47370a;
    public final int f47371b;
    public transient String f47372c;

    public a(String str, int i10) {
        this.f47370a = str;
        this.f47371b = i10;
    }

    public final String toString() {
        if (this.f47372c == null) {
            this.f47372c = String.format("%s:%d", this.f47370a, Integer.valueOf(this.f47371b));
        }
        return this.f47372c;
    }
}
