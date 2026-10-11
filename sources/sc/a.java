package sc;
public final class a {
    public final String f48012a;
    public final int f48013b;
    public transient String f48014c;

    public a(String str, int i10) {
        this.f48012a = str;
        this.f48013b = i10;
    }

    public final String toString() {
        if (this.f48014c == null) {
            this.f48014c = String.format("%s:%d", this.f48012a, Integer.valueOf(this.f48013b));
        }
        return this.f48014c;
    }
}
