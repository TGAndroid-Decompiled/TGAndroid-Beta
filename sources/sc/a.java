package sc;
public final class a {
    public final String f48119a;
    public final int f48120b;
    public transient String f48121c;

    public a(String str, int i10) {
        this.f48119a = str;
        this.f48120b = i10;
    }

    public final String toString() {
        if (this.f48121c == null) {
            this.f48121c = String.format("%s:%d", this.f48119a, Integer.valueOf(this.f48120b));
        }
        return this.f48121c;
    }
}
