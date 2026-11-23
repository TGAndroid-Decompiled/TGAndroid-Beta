package rc;
public final class a {
    public final String f56537a;
    public final int f56538b;
    public transient String f56539c;

    public a(String str, int i7) {
        this.f56537a = str;
        this.f56538b = i7;
    }

    public final String toString() {
        if (this.f56539c == null) {
            this.f56539c = String.format("%s:%d", this.f56537a, Integer.valueOf(this.f56538b));
        }
        return this.f56539c;
    }
}
