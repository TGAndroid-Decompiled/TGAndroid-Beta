package sc;
public final class a {
    public final String f47886a;
    public final int f47887b;
    public transient String f47888c;

    public a(String str, int i10) {
        this.f47886a = str;
        this.f47887b = i10;
    }

    public final String toString() {
        if (this.f47888c == null) {
            this.f47888c = String.format("%s:%d", this.f47886a, Integer.valueOf(this.f47887b));
        }
        return this.f47888c;
    }
}
