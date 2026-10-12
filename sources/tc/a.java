package tc;
public final class a {
    public final String f45564a;
    public final int f45565b;
    public transient String f45566c;

    public a(String str, int i10) {
        this.f45564a = str;
        this.f45565b = i10;
    }

    public final String toString() {
        if (this.f45566c == null) {
            this.f45566c = String.format("%s:%d", this.f45564a, Integer.valueOf(this.f45565b));
        }
        return this.f45566c;
    }
}
