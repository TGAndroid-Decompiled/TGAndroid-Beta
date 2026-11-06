package rc;
public final class a {
    public final String f54318a;
    public final int f54319b;
    public transient String f54320c;

    public a(String str, int i7) {
        this.f54318a = str;
        this.f54319b = i7;
    }

    public final String toString() {
        if (this.f54320c == null) {
            this.f54320c = String.format("%s:%d", this.f54318a, Integer.valueOf(this.f54319b));
        }
        return this.f54320c;
    }
}
