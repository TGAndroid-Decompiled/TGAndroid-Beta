package rc;
public final class a {
    public final String f54343a;
    public final int f54344b;
    public transient String f54345c;

    public a(String str, int i7) {
        this.f54343a = str;
        this.f54344b = i7;
    }

    public final String toString() {
        if (this.f54345c == null) {
            this.f54345c = String.format("%s:%d", this.f54343a, Integer.valueOf(this.f54344b));
        }
        return this.f54345c;
    }
}
