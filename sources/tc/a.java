package tc;
public final class a {
    public final String f46953a;
    public final int f46954b;
    public transient String f46955c;

    public a(String str, int i10) {
        this.f46953a = str;
        this.f46954b = i10;
    }

    public final String toString() {
        if (this.f46955c == null) {
            this.f46955c = String.format("%s:%d", this.f46953a, Integer.valueOf(this.f46954b));
        }
        return this.f46955c;
    }
}
