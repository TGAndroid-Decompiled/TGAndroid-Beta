package rc;
public final class a {
    public final String f56533a;
    public final int f56534b;
    public transient String f56535c;

    public a(String str, int i7) {
        this.f56533a = str;
        this.f56534b = i7;
    }

    public final String toString() {
        if (this.f56535c == null) {
            this.f56535c = String.format("%s:%d", this.f56533a, Integer.valueOf(this.f56534b));
        }
        return this.f56535c;
    }
}
