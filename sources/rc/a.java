package rc;
public final class a {
    public final String f56615a;
    public final int f56616b;
    public transient String f56617c;

    public a(String str, int i7) {
        this.f56615a = str;
        this.f56616b = i7;
    }

    public final String toString() {
        if (this.f56617c == null) {
            this.f56617c = String.format("%s:%d", this.f56615a, Integer.valueOf(this.f56616b));
        }
        return this.f56617c;
    }
}
