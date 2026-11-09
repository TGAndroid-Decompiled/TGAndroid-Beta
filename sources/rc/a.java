package rc;
public final class a {
    public final String f54447a;
    public final int f54448b;
    public transient String f54449c;

    public a(String str, int i7) {
        this.f54447a = str;
        this.f54448b = i7;
    }

    public final String toString() {
        if (this.f54449c == null) {
            this.f54449c = String.format("%s:%d", this.f54447a, Integer.valueOf(this.f54448b));
        }
        return this.f54449c;
    }
}
