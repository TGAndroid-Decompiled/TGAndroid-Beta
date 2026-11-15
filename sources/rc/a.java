package rc;
public final class a {
    public final String f55918a;
    public final int f55919b;
    public transient String f55920c;

    public a(String str, int i7) {
        this.f55918a = str;
        this.f55919b = i7;
    }

    public final String toString() {
        if (this.f55920c == null) {
            this.f55920c = String.format("%s:%d", this.f55918a, Integer.valueOf(this.f55919b));
        }
        return this.f55920c;
    }
}
