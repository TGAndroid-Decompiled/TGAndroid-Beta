package rc;
public final class a {
    public final String f56502a;
    public final int f56503b;
    public transient String f56504c;

    public a(String str, int i7) {
        this.f56502a = str;
        this.f56503b = i7;
    }

    public final String toString() {
        if (this.f56504c == null) {
            this.f56504c = String.format("%s:%d", this.f56502a, Integer.valueOf(this.f56503b));
        }
        return this.f56504c;
    }
}
