package rc;
public final class a {
    public final String f54446a;
    public final int f54447b;
    public transient String f54448c;

    public a(String str, int i7) {
        this.f54446a = str;
        this.f54447b = i7;
    }

    public final String toString() {
        if (this.f54448c == null) {
            this.f54448c = String.format("%s:%d", this.f54446a, Integer.valueOf(this.f54447b));
        }
        return this.f54448c;
    }
}
