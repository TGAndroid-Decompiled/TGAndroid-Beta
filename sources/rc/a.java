package rc;
public final class a {
    public final String f56492a;
    public final int f56493b;
    public transient String f56494c;

    public a(String str, int i7) {
        this.f56492a = str;
        this.f56493b = i7;
    }

    public final String toString() {
        if (this.f56494c == null) {
            this.f56494c = String.format("%s:%d", this.f56492a, Integer.valueOf(this.f56493b));
        }
        return this.f56494c;
    }
}
