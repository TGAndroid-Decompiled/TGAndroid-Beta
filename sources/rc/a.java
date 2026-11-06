package rc;
public final class a {
    public final String f54342a;
    public final int f54343b;
    public transient String f54344c;

    public a(String str, int i7) {
        this.f54342a = str;
        this.f54343b = i7;
    }

    public final String toString() {
        if (this.f54344c == null) {
            this.f54344c = String.format("%s:%d", this.f54342a, Integer.valueOf(this.f54343b));
        }
        return this.f54344c;
    }
}
